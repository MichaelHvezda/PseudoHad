package snakeTelo;


import io.vavr.Tuple2;
import org.jetbrains.annotations.NotNull;
import pseudoraster.PSRaster;
import rasterdata.Raster;
import transforms.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeloHada implements Telo{

    PSRaster psRaster;
    Jidlo jidlo;

    public TeloHada(PSRaster psRaster) {
        this.psRaster = psRaster;
        jidlo = new Jidlo(psRaster.getxPSRasteru(),psRaster.getyPSRasteru());
    }

    //vykresleni casti hada o dane velikosti na danem miste
    @Override
    public @NotNull Raster vykresleni(Raster raster,Had a) {
        Raster vysledek;


        vysledek = psRaster.toRaster(raster,a.getHadSeznam());


        return vysledek;
    }


    @Override
    public @NotNull List<Tuple2<Point2D,Color>> zvetseni(Had a,Point2D point2D) {
        int vpravoLevo = (int)point2D.getX();
        int nahoruDolu = (int)point2D.getY();
        List<Tuple2<Point2D,Color>> vysledek = new ArrayList<>();

        // souradnice hlavy hada a jidla se schoduji
       if(a.getHadSeznam().get(0)._1.getX()==jidlo.jidlo._1.getX() && a.getHadSeznam().get(0)._1.getY()==jidlo.jidlo._1.getY()){

           //hlava se prebarvy na barvu jidla a posune na misto jidla
            vysledek.add(new Tuple2<>(new Point2D((a.getHadSeznam().get(0)._1.getX()+vpravoLevo+psRaster.getxPSRasteru())%psRaster.getxPSRasteru(),(a.getHadSeznam().get(0)._1.getY()+nahoruDolu+psRaster.getyPSRasteru())%psRaster.getyPSRasteru() ),jidlo.getJidlo()._2));

            //posun jednotlivych clanku hada na misto toho predchoziho
           // pridani posledniho umoznuje zvetseni
            for (int i= 0;i<a.getHadSeznam().size();i++){
                vysledek.add(new Tuple2<>(new Point2D(
                        (a.getHadSeznam().get(i)._1.getX()),(a.getHadSeznam().get(i)._1.getY())
                ),jidlo.getJidlo()._2));    //  jidlo.getJidlo()._2  /  a.getHadSeznam().get(i)._2   meneni jestli se had prebarvuje postupne nebno instante
            }
            newJidlo();
            return vysledek;
        }else{

        //pridani prvniho
        vysledek.add(new Tuple2<>(new Point2D((a.getHadSeznam().get(0)._1.getX()+vpravoLevo+psRaster.getxPSRasteru())%psRaster.getxPSRasteru(),(a.getHadSeznam().get(0)._1.getY()+nahoruDolu+psRaster.getyPSRasteru())%psRaster.getxPSRasteru()),a.getHadSeznam().get(0)._2));

        //posun ostatnich a vynechani posledniho
        for (int i= 0;i<a.getHadSeznam().size()-1;i++){
            vysledek.add(new Tuple2<>(new Point2D(
                    (a.getHadSeznam().get(i)._1.getX()),(a.getHadSeznam().get(i)._1.getY())
            ),a.getHadSeznam().get(0)._2)); // moznost i+1 pro zachovani balev v jednotlivych clancich   i -> barva se meni od mista seberani jidla  0 -> barva se zmeni instante
        }

        return vysledek;
        }
    }

    @Override
    public @NotNull boolean kousnuti(Had a) {

        for (int i= 1;i<a.getHadSeznam().size();i++){

                //zjisteni jestli hlava hada nelezi na casti jeho tela
                if(a.getHadSeznam().get(i)._1.getX() == a.getHadSeznam().get(0)._1.getX() && a.getHadSeznam().get(i)._1.getY() == a.getHadSeznam().get(0)._1.getY()){
                    return true;
                }

        }


        return false;
    }

    public PSRaster getPsRaster() {
        return psRaster;
    }

    public void setPsRaster(PSRaster psRaster) {
        this.psRaster = psRaster;
    }

    public Jidlo getJidlo() {
        return jidlo;
    }

    public void setJidlo(Jidlo jidlo) {
        this.jidlo = jidlo;
    }
    public void newJidlo() {
        this.jidlo = new Jidlo(psRaster.getxPSRasteru(),psRaster.getyPSRasteru());;
    }
}
