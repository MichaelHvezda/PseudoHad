package snakeTelo;

import io.vavr.Tuple2;
import rasterdata.Raster;
import transforms.Point2D;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameOver {
    List<Point2D> gameOver = new ArrayList<Point2D>();
    int nasobekSirky, nasobekVysky;

    public GameOver(int sirka, int vyska){

        nasobekSirky = (int)sirka/20;
        nasobekVysky = (int)vyska/20;

        gameOver.add(new Point2D(3,4));
        gameOver.add(new Point2D(7,4));
        gameOver.add(new Point2D(10,4));
        gameOver.add(new Point2D(14,4));
        gameOver.add(new Point2D(16,4));
        gameOver.add(new Point2D(17,4));
        gameOver.add(new Point2D(18,4));

        gameOver.add(new Point2D(2,5));
        gameOver.add(new Point2D(4,5));
        gameOver.add(new Point2D(6,5));
        gameOver.add(new Point2D(8,5));
        gameOver.add(new Point2D(10,5));
        gameOver.add(new Point2D(14,5));
        gameOver.add(new Point2D(16,5));

        gameOver.add(new Point2D(2,6));
        gameOver.add(new Point2D(6,6));
        gameOver.add(new Point2D(8,6));
        gameOver.add(new Point2D(10,6));
        gameOver.add(new Point2D(11,6));
        gameOver.add(new Point2D(13,6));
        gameOver.add(new Point2D(14,6));
        gameOver.add(new Point2D(16,6));
        gameOver.add(new Point2D(17,6));
        gameOver.add(new Point2D(18,6));


        gameOver.add(new Point2D(2,7));
        gameOver.add(new Point2D(4,7));
        gameOver.add(new Point2D(6,7));
        gameOver.add(new Point2D(7,7));
        gameOver.add(new Point2D(8,7));
        gameOver.add(new Point2D(10,7));
        gameOver.add(new Point2D(11,7));
        gameOver.add(new Point2D(13,7));
        gameOver.add(new Point2D(14,7));
        gameOver.add(new Point2D(16,7));

        gameOver.add(new Point2D(2,8));
        gameOver.add(new Point2D(4,8));
        gameOver.add(new Point2D(6,8));
        gameOver.add(new Point2D(8,8));
        gameOver.add(new Point2D(10,8));
        gameOver.add(new Point2D(12,8));
        gameOver.add(new Point2D(14,8));
        gameOver.add(new Point2D(16,8));

        gameOver.add(new Point2D(3,9));
        gameOver.add(new Point2D(4,9));
        gameOver.add(new Point2D(6,9));
        gameOver.add(new Point2D(8,9));
        gameOver.add(new Point2D(10,9));
        gameOver.add(new Point2D(12,9));
        gameOver.add(new Point2D(14,9));
        gameOver.add(new Point2D(16,9));
        gameOver.add(new Point2D(17,9));
        gameOver.add(new Point2D(18,9));

        gameOver.add(new Point2D(3,12));
        gameOver.add(new Point2D(6,12));
        gameOver.add(new Point2D(10,12));
        gameOver.add(new Point2D(12,12));
        gameOver.add(new Point2D(13,12));
        gameOver.add(new Point2D(14,12));
        gameOver.add(new Point2D(16,12));
        gameOver.add(new Point2D(17,12));
        gameOver.add(new Point2D(18,12));

        gameOver.add(new Point2D(2,13));
        gameOver.add(new Point2D(4,13));
        gameOver.add(new Point2D(6,13));
        gameOver.add(new Point2D(10,13));
        gameOver.add(new Point2D(12,13));
        gameOver.add(new Point2D(16,13));
        gameOver.add(new Point2D(18,13));

        gameOver.add(new Point2D(2,14));
        gameOver.add(new Point2D(4,14));
        gameOver.add(new Point2D(7,14));
        gameOver.add(new Point2D(9,14));
        gameOver.add(new Point2D(12,14));
        gameOver.add(new Point2D(13,14));
        gameOver.add(new Point2D(14,14));
        gameOver.add(new Point2D(16,14));
        gameOver.add(new Point2D(17,14));
        gameOver.add(new Point2D(18,14));

        gameOver.add(new Point2D(2,15));
        gameOver.add(new Point2D(4,15));
        gameOver.add(new Point2D(7,15));
        gameOver.add(new Point2D(9,15));
        gameOver.add(new Point2D(12,15));
        gameOver.add(new Point2D(16,15));
        gameOver.add(new Point2D(17,15));

        gameOver.add(new Point2D(2,16));
        gameOver.add(new Point2D(4,16));
        gameOver.add(new Point2D(8,16));
        gameOver.add(new Point2D(12,16));
        gameOver.add(new Point2D(16,16));
        gameOver.add(new Point2D(18,16));

        gameOver.add(new Point2D(3,17));
        gameOver.add(new Point2D(8,17));
        gameOver.add(new Point2D(12,17));
        gameOver.add(new Point2D(13,17));
        gameOver.add(new Point2D(14,17));
        gameOver.add(new Point2D(16,17));
        gameOver.add(new Point2D(18,17));


    }

    public List<Point2D> getGameOver() {
        return gameOver;
    }

    public int getNasobekSirky() {
        return nasobekSirky;
    }

    public int getNasobekVysky() {
        return nasobekVysky;
    }

    public Raster prohralJsi(Raster raster, GameOver gameOver){
        Raster vysledek =raster;

/*
        for (int i= 0;i<gameOver.getGameOver().size();i++){
            vysledek = vysledek.withValue((int)((gameOver.getGameOver().get(i).getX())*gameOver.getNasobekSirky()),(int)((gameOver.getGameOver().get(i).getY())*gameOver.getNasobekVysky()),new Color(255,255,255));
        }
*/
        for (int i= 0;i<gameOver.getGameOver().size();i++){
            for(int s = (int)-(gameOver.getNasobekSirky()/2);s<=(gameOver.getNasobekSirky()/2);s++){
                for(int v = (int)-(gameOver.getNasobekVysky()/2);v<=(gameOver.getNasobekVysky()/2);v++){
                    vysledek = vysledek.withValue((int)(((gameOver.getGameOver().get(i).getX())*gameOver.getNasobekSirky())+s),(int)(((gameOver.getGameOver().get(i).getY())*gameOver.getNasobekVysky())+v),new Color(255,255,255));
                }
            }

        }


        return vysledek;
    }
}
