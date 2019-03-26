package rasterdata;

import org.jetbrains.annotations.NotNull;
import transforms.Point2D;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Optional;
import java.util.function.Function;

public class FastRaster<PixelType> implements Raster<PixelType> {

    private @NotNull final BufferedImage img;

    private @NotNull final Function<PixelType, Integer> pixelTypeToInteger;
    private @NotNull final Function<Integer, PixelType> integerToPixelType;

    public FastRaster(@NotNull final BufferedImage img,
                      @NotNull final Function<PixelType, Integer> pixelTypeToInteger,
                      @NotNull final Function<Integer, PixelType> integerToPixelType){
        this.img = img;
        this.pixelTypeToInteger =pixelTypeToInteger;
        this.integerToPixelType =integerToPixelType;
    }

    @NotNull
    @Override
    public Optional<PixelType> getValue(int c, int r) {
        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            return Optional.of(integerToPixelType.apply(img.getRGB(c, r)));
        return Optional.empty();
    }

    @NotNull
    @Override
    public Raster<PixelType> withValue(int c, int r, @NotNull PixelType value) {

        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            img.setRGB(c,r, pixelTypeToInteger.apply(value));
        return this;
    }

    @Override
    @NotNull
    public Raster<PixelType> withValue(Point2D a, @NotNull PixelType value) {
        int c = (int)a.getX(),r = (int)a.getY();

        if (0<=c && getWidth()-1>=c && 0<=r && getHeight()-1>=r)
            img.setRGB((int)a.getX(),(int)a.getY(),pixelTypeToInteger.apply(value));
        return this;
    }

    @NotNull
    @Override
    public Raster<PixelType> cleared(@NotNull PixelType value) {
        Graphics gr = img.getGraphics();
        gr.setColor(new Color(pixelTypeToInteger.apply(value)));
        gr.fillRect(0,0,img.getWidth(),img.getHeight());
        return this;
    }

    @Override
    public int getWidth() {
        return img.getWidth();
    }

    @Override
    public int getHeight() {
        return img.getHeight();
    }

    @NotNull
    public BufferedImage getImage(){
        return img;
    }
}

