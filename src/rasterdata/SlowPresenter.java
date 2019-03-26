package rasterdata;

import io.vavr.collection.Stream;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;
import java.util.function.Function;



public class SlowPresenter<PixelType> implements Presenter<Graphics, PixelType> {
    private @NotNull final Function<PixelType, Integer> pixelTypeToInteger;
    public SlowPresenter(@NotNull final Function<PixelType, Integer> pixelTypeToInteger){

        this.pixelTypeToInteger =pixelTypeToInteger;

    }
    @Override
    @NotNull
    public Graphics present(@NotNull Graphics device, @NotNull Raster<PixelType> raster) {
        final BufferedImage img = new BufferedImage(raster.getWidth(),raster.getHeight(),BufferedImage.TYPE_INT_RGB);
        Stream.range(0,raster.getHeight()).forEach(
                r ->  Stream.range(0, raster.getWidth()).forEach(
                                c -> raster.getValue(c, r).ifPresent(value -> img.setRGB(c, r, pixelTypeToInteger.apply(value)))
                        )

        );
        device.drawImage(img, 0, 0, null);
        return device;
    }
}
