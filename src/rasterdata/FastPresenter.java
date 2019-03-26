package rasterdata;
import org.jetbrains.annotations.NotNull;
import java.awt.*;
import java.awt.image.BufferedImage;

public class FastPresenter<PixelType> implements Presenter<Graphics, PixelType> {

    @Override
    @NotNull
    public Graphics present(@NotNull Graphics device, @NotNull Raster<PixelType> raster) {
        if (raster instanceof FastRaster<?>){
        final BufferedImage img = ((FastRaster<?>)raster).getImage();
        device.drawImage(img, 0, 0, null);
        }
        else {
            System.err.println("Cannot present " + raster.getClass());
        }
        return device;

    }
}
