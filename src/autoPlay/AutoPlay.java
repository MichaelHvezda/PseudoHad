package autoPlay;

import io.vavr.Tuple2;
import org.jetbrains.annotations.NotNull;
import snakeTelo.Had;
import snakeTelo.Jidlo;
import snakeTelo.Telo;
import snakeTelo.TeloHada;
import transforms.Point2D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AutoPlay {

    List<Point2D> krokyHada = new ArrayList<>();
    Had had;
    Jidlo jidlo;


    private static final Point2D NAHORU = new Point2D(0,-1);
    private static final Point2D DOLU = new Point2D(0,1);
    private static final Point2D VLEVO = new Point2D(-1,0);
    private static final Point2D VPRAVO = new Point2D(1,0);


    public @NotNull Point2D predikce(Had had, Jidlo jidlo){
        List<Point2D> predikceKroku = new ArrayList<>();
        if(getKrokyHada().isEmpty()|| !(getHad().getHadSeznam().get(0)._2.equals(had.getHadSeznam().get(0)._2))){

            setHad(had);
            setJidlo(jidlo);


            int xHada = (int)getHad().getHadSeznam().get(0)._1.getX();
            int yHada = (int)getHad().getHadSeznam().get(0)._1.getY();
            int xJidla = (int)getJidlo().getJidlo()._1.getX();
            int yJidla = (int)getJidlo().getJidlo()._1.getY();


            int krokyX = (int)((xHada-xJidla));
            int krokyY = (int)((yHada-yJidla));
            if (krokyX!=0&&krokyY!=0){
                for(int i = krokyY; 0>i;i+=1){
                    predikceKroku.add(DOLU);
                    //System.out.println("0 1");
                }

                for(int i = krokyY; 0<i;i-=1){
                    predikceKroku.add(NAHORU);
                    //System.out.println("0 -1");
                }

                for(int i = krokyX; 0>i;i+=1){
                    predikceKroku.add(VPRAVO);
                   // System.out.println("1 0");
                }

                for(int i = krokyX; 0<i;i-=1){
                    predikceKroku.add(VLEVO);
                    //System.out.println("-1 0");
                }

            }else {
                    Point2D hlava = had.getHadSeznam().get(0)._1;
                    Point2D telo = had.getHadSeznam().get(1)._1;

                    predikceKroku.add(new Point2D( hlava.getX()-telo.getX(),hlava.getY()-telo.getY()));


            }

            setKrokyHada(predikceKroku);


            return getPrvniKrokHada();


        }




        return getPrvniKrokHada();
    }

    public void clearKrokyHada(){
        krokyHada.clear();
    }

    private Had getHad() {
        return had;
    }


    public AutoPlay(){


    }

    private AutoPlay(Had had, Jidlo jidlo){
        this.had=had;
        this.jidlo=jidlo;
    }

    public void setHad(Had had) {
        this.had = had;
    }

    public void setJidlo(Jidlo jidlo) {
        this.jidlo = jidlo;
    }

    private Jidlo getJidlo() {
        return jidlo;
    }


    public List<Point2D> getKrokyHada() {
        return krokyHada;
    }

    public void setKrokyHada(List<Point2D> krokyHada) {
        this.krokyHada = krokyHada;
    }

    private Point2D getPrvniKrokHada() {
        Point2D vysledek;
        if(!(getKrokyHada().isEmpty())){
            vysledek = new Point2D(getKrokyHada().get(0).getX(),getKrokyHada().get(0).getY());
        }else{
            predikce(getHad(),getJidlo());
            vysledek = getPrvniKrokHada();
        }
        List<Point2D> progressHada = new ArrayList<>();
        for (int i =1;i<getKrokyHada().size();i++){
            progressHada.add(new Point2D(getKrokyHada().get(i).getX(),getKrokyHada().get(i).getY()));
        }
        setKrokyHada(progressHada);


        return vysledek;





    }
    private  @NotNull Point2D posunHlavy(@NotNull Tuple2<Integer,Integer> a, int vpravoLevo, int nahoruDolu) {
        return new Point2D((a._1)+vpravoLevo*3,(a._2)+nahoruDolu*3);
    }



}
