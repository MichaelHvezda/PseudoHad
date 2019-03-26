package rasterdata;

import io.vavr.collection.Stream;
import io.vavr.collection.Vector;
import org.jetbrains.annotations.NotNull;
import transforms.Point2D;

import java.util.Optional;

public class VavrRaster<PixelType> implements Raster<PixelType> {

    private final @NotNull Vector<PixelType> image;
    private final int width, height;

    public VavrRaster(final int width, final int height, final @NotNull PixelType value){
        this.width = width;
        this.height = height;
        image = Vector.fill(width*height, ()-> value);
    }

    private VavrRaster(final @NotNull Vector<PixelType> image, final int width, final int height){
        this.image = image;
        this.width = width;
        this.height = height;
    }

    @NotNull
    @Override
    public Optional<PixelType> getValue(int c, int r) {
        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            return Optional.of(image.get(r*width + c));

    return Optional.empty();
    }

    @NotNull
    @Override
    public Raster<PixelType> withValue(int c, int r, @NotNull PixelType value) {
        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            return new VavrRaster<>(image.update(r*width + c,value), width,height);
        return this;
    }

    @Override
    @NotNull
    public Raster<PixelType> withValue(Point2D a, @NotNull PixelType value) {
        int c = (int)a.getX(),r = (int)a.getY();

        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            return new VavrRaster<>(image.update( r*width + c,value), width,height);
        return this;
    }

    @NotNull
    @Override
    public Raster<PixelType> cleared(@NotNull PixelType value) {
        return new VavrRaster<>(width,height,value);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
