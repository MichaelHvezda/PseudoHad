package textMaker;

import org.jetbrains.annotations.NotNull;
import rasterdata.Raster;
import transforms.Col;
import transforms.Point2D;

import java.awt.*;


public interface Texter {

    @NotNull Raster textToText(Raster raster, Point2D a, String text, Color col, int nasobek);

}
