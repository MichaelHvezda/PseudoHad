package snakeTelo;


import io.vavr.Tuple2;
import org.jetbrains.annotations.NotNull;
import pseudoraster.PSRaster;
import rasterdata.Raster;
import transforms.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public interface Telo {

    @NotNull Raster vykresleni(Raster raster, Had a);

    @NotNull List<Tuple2<Point2D,Color>> zvetseni(Had a,Point2D point2D);

    @NotNull boolean kousnuti(Had a);

}
