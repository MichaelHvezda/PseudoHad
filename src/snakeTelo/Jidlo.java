package snakeTelo;

import io.vavr.Tuple2;
import pseudoraster.PSRaster;
import rasterdata.Raster;
import transforms.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jidlo {
    Tuple2<Point2D,Color> jidlo;
    int sirka,vyska;
    public Jidlo(int sirka, int vyska){
       jidlo = new Tuple2<>(new Point2D(getRandomNumberInRange(0,sirka-1),getRandomNumberInRange(0,vyska-1)),new Color(getRandomNumberInRange(10,255),getRandomNumberInRange(10,255),getRandomNumberInRange(10,255)));
       this.sirka = sirka;
       this.vyska = vyska;
    }


    public Raster vyklesleniJidla(Raster raster, Jidlo a, PSRaster psRaster) {
        Raster vysledek;

        vysledek = psRaster.toRaster(raster,a);


        return vysledek;
    }


    public Tuple2<Point2D,Color> getJidlo() {
        return jidlo;
    }

    public int getSirka() {
        return sirka;
    }

    public void setSirka(int sirka) {
        this.sirka = sirka;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
