package rasterdata;

import org.jetbrains.annotations.NotNull;
import transforms.Point2D;

import java.util.Optional;

public interface Raster<ValueType> {
    /**
     * Returns value of the pixel at the given column and row address
     * @param c column address
     * @param r row address
     * @return {@link Optional} of the pixel value if address is valid, empty {@link Optional} otherwise
     */
    @NotNull Optional<ValueType> getValue(int c, int r);

    /**
     * Returns a new Raster with a pixel at the given address set to the given value
     * @param c column address
     * @param r row address
     * @param value new pixel value
     * @return a new Raster if address is valid, this otherwise
     */
    @NotNull Raster<ValueType> withValue(int c, int r, @NotNull ValueType value);


    @NotNull Raster<ValueType> withValue(Point2D a, @NotNull ValueType value);

    /**
     * Returns a new raster filled with the given value
     * @param value value for all the pixels
     * @return new raster
     */
    @NotNull Raster<ValueType> cleared(@NotNull ValueType value);

    /**
     * Returns the number of columns
     * @return column count
     */
    int getWidth();

    /**
     * Returns the number of rows
     * @return row count
     */
    int getHeight();
}
