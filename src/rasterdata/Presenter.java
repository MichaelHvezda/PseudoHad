package rasterdata;
import org.jetbrains.annotations.NotNull;

public interface Presenter<DeviceType, PixelType> {
    @NotNull DeviceType present(@NotNull DeviceType device, @NotNull Raster<PixelType> raster);

}
