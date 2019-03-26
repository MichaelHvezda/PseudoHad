package pseudoraster;

import io.vavr.Tuple2;
import org.jetbrains.annotations.NotNull;
import rasterdata.Raster;
import rasterdata.VavrRaster;

import snakeTelo.Jidlo;
import transforms.Col;
import transforms.Point2D;

import java.awt.*;
import java.util.List;

public class PSRaster {

    private int velikost;
    private int xRastru;
    private int yRastru;
    private int velikostCtverecku;
    private int xPSRasteru;
    private int yPSRasteru;
    private Color bila = new Color(255,255,255);

    public @NotNull PSRaster(int velikost, int xRastru, int yRastru) {
        this.velikost = velikost;
        this.xRastru = xRastru;
        this.yRastru = yRastru;
        this.velikostCtverecku = (this.velikost-1)*2+1;

        this.xPSRasteru = this.xRastru/velikostCtverecku;
        this.yPSRasteru = this.yRastru/velikostCtverecku;

    }


    public @NotNull Raster toRaster(Raster raster, List<Tuple2<Point2D,Color>> had){
        Raster vysledek = raster;
        for (Tuple2<Point2D,Color> a: had) {
            vysledek = kosticka(vysledek,a);
        }

        return vysledek;
    }

    public @NotNull Raster toRaster(Raster raster, Jidlo jidlo){
        Raster vysledek = raster;

        vysledek = kosticka(vysledek,jidlo.getJidlo());


        return vysledek;
    }




    public @NotNull Raster orezRastr(Raster raster){
        Raster vysledek=raster;
        if(xRastru %velikostCtverecku!=0){
            vysledek=vybarveniLineX(vysledek);
            return orezRastr(vysledek);
        }

        if(yRastru %velikostCtverecku!=0){
           vysledek = vybarveniLineY(vysledek);
           return orezRastr(vysledek);
        }
        return vysledek;
    }

    public int getVelikostCtverecku() {
        return velikostCtverecku;
    }

    public void setVelikostCtverecku(int velikostCtverecku) {
        this.velikostCtverecku = velikostCtverecku;
    }

    public int getxPSRasteru() {
        return xPSRasteru;
    }

    public void setxPSRasteru(int xPSRasteru) {
        this.xPSRasteru = xPSRasteru;
    }

    public int getyPSRasteru() {
        return yPSRasteru;
    }

    public void setyPSRasteru(int yPSRasteru) {
        this.yPSRasteru = yPSRasteru;
    }

    public int getVelikost() {
        return velikost;
    }

    public void setVelikost(int velikost) {
        this.velikost = velikost;
    }

    public int getxRastru() {
        return xRastru;
    }

    public void setxRastru(int xRastru) {
        this.xRastru = xRastru;
    }

    public int getyRastru() {
        return yRastru;
    }

    public void setyRastru(int yRastru) {
        this.yRastru = yRastru;
    }


    private @NotNull Raster vybarveniLineX(Raster raster){
        setxRastru(xRastru-1);
        for (int i = 0; i< yRastru ; i++){
            raster = raster.withValue(xRastru,i,bila);
        }

        return raster;
    }

    private @NotNull Raster vybarveniLineY(Raster raster){
        setyRastru(yRastru-1);
        for (int i = 0; i< xRastru ; i++){
            raster = raster.withValue(i,yRastru,bila);
        }

        return raster;
    }

    private @NotNull Raster kosticka(Raster raster, Tuple2<Point2D,Color> a){
        for (int u = 0; u<velikostCtverecku;u++){
            for (int i = 0; i<velikostCtverecku;i++){
                raster = raster.withValue((int)(a._1.getX())*velikostCtverecku+i,(int)(a._1.getY())*velikostCtverecku+u,a._2);

            }
        }



       return raster ;
    }



}
