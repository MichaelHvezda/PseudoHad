package snakeTelo;

import io.vavr.Tuple2;
import transforms.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Had {
    private List<Tuple2<Point2D,Color>> hadSeznam = new ArrayList<Tuple2<Point2D,Color>>();
    private int sirka,vyska;

    //prvotni inicializace hada
    public Had(int sirka, int vyska){
        hadSeznam.add(new Tuple2<>(new Point2D(sirka/2,vyska/2+2),new Color(255,255,255)));
        hadSeznam.add(new Tuple2<>(new Point2D(sirka/2,vyska/2+1),new Color(255,0,0)));
        hadSeznam.add(new Tuple2<>(new Point2D(sirka/2,vyska/2),new Color(0,255,0)));
        hadSeznam.add(new Tuple2<>(new Point2D(sirka/2,vyska/2-1),new Color(0,0,255)));
        hadSeznam.add(new Tuple2<>(new Point2D(sirka/2,vyska/2-2),new Color(255,255,255)));

        this.sirka = sirka;
        this.vyska = vyska;

    }




    public List<Tuple2<Point2D, Color>> getHadSeznam() {
        return hadSeznam;
    }

    public void setHadSeznam(List<Tuple2<Point2D, Color>> hadSeznam) {
        this.hadSeznam = hadSeznam;
    }
    public int getSirka() {
        return sirka;
    }

    public int getVyska() {
        return vyska;
    }

}
