package textMaker;

import io.vavr.Tuple2;
import io.vavr.collection.Stream;
import org.jetbrains.annotations.NotNull;
import rasterdata.Raster;
import textMaker.abeceda.Abeceda;
import transforms.Col;
import transforms.Point2D;

import java.awt.*;
import java.util.List;


public class TextMaker implements Texter {
    Abeceda abeceda = new Abeceda();



    @Override
    public @NotNull Raster textToText(Raster raster,Point2D a, String text, Color color, int nasobek) {
        Raster pomocnyRaster = raster;
        char[] stringSplit = rozkrajeni(text.toUpperCase());
        for (Tuple2<List<Point2D>, Integer> pom :
                abeceda.getPismeno(stringSplit)) {

            for (int x=0;x<pom._1.size();x++) {

                pomocnyRaster = kostickaTextu(pomocnyRaster,(int)(a.getX()+pom._1.get(x).getX()*nasobek),(int)(a.getY()+pom._1.get(x).getY()*nasobek),color,nasobek);



            }




            a = new Point2D(a.getX()+pom._2*nasobek+nasobek,a.getY());
        }




        return pomocnyRaster;
    }

    private @NotNull char[] rozkrajeni(String text){

        return text.toCharArray();
    }

    private Raster kostickaTextu(Raster raster, int x, int y , Color color, int nasobek){
        Raster pomocnyRaster = raster;
        for (int indexX = 0; indexX<nasobek;indexX++){

            for (int indexY = 0; indexY<nasobek;indexY++){

                pomocnyRaster= pomocnyRaster.withValue(
                        indexX+x,
                        indexY+y,
                        color

                );

            }
        }



        return pomocnyRaster;
    }



}
