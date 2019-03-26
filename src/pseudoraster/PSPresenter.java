package pseudoraster;

import autoPlay.AutoPlay;
import org.jetbrains.annotations.NotNull;
import rasterdata.Presenter;
import rasterdata.Raster;
import rasterdata.SlowPresenter;
import rasterdata.VavrRaster;
import snakeTelo.GameOver;
import snakeTelo.Had;
import snakeTelo.TeloHada;
import textMaker.TextMaker;
import transforms.Point2D;

import javax.swing.*;
import java.awt.*;

public class PSPresenter {
    private static final Point2D NAHORU = new Point2D(0,-1);
    private static final Point2D DOLU = new Point2D(0,1);
    private static final Point2D VLEVO = new Point2D(-1,0);
    private static final Point2D VPRAVO = new Point2D(1,0);
    private static final Point2D AUTOPLAY = new Point2D(0,0);
    private PSRaster psRaster;
    private Point2D posledniKrok = DOLU;
    private int width;
    private int height;
    private Had had;
    private TeloHada teloHada;
    private AutoPlay autoPlay;

    private GameOver gameOver;
    private TextMaker textMaker;
    private @NotNull Raster<Color> raster;
    private @NotNull Raster<Color> pomraster;
    private final @NotNull Presenter<Graphics, Color> presenter;


    public PSPresenter(final int width, final int height) {
        autoPlay = new AutoPlay();
        psRaster = new PSRaster(50,width,height);
        textMaker = new TextMaker();
        raster = new VavrRaster<>(width,height,Color.BLACK);
        presenter = new SlowPresenter<>(Color::getRGB);
        this.width =width;
        this.height = height;

    }

    public @NotNull Raster inicializace(){

        had = new Had(psRaster.getxPSRasteru(),psRaster.getyPSRasteru());
        teloHada = new TeloHada(psRaster);

        raster = psRaster.orezRastr(raster);
        raster = textMaker.textToText(raster,new Point2D(10,10),"Score:", Color.white,5);


        pomraster=raster;
        raster = textMaker.textToText(raster,new Point2D(130,10), Integer.toString(had.getHadSeznam().size()-5) , Color.white,5);
        raster = psRaster.toRaster(raster,teloHada.getJidlo());
        raster = psRaster.toRaster(raster,had.getHadSeznam());
        return raster;
    }

    public @NotNull Raster pohyb(Point2D pohyb){

        Point2D pohyb2D = pohyb;
        raster=pomraster;
        if(pohyb2D.getX() == AUTOPLAY.getX() && pohyb2D.getY() == AUTOPLAY.getY()){
            pohyb2D = autoPlay.predikce(had,teloHada.getJidlo());
        }else {
            autoPlay.clearKrokyHada();
        }

        had.setHadSeznam(teloHada.zvetseni(had,pohyb2D));
        raster = psRaster.toRaster(raster,teloHada.getJidlo());
        raster = psRaster.toRaster(raster,had.getHadSeznam());
        raster = textMaker.textToText(raster,new Point2D(130,10), Integer.toString(had.getHadSeznam().size()-5) , Color.white,5);
        raster = textMaker.textToText(raster,new Point2D(10,10),"Score:", Color.white,5);

        if(teloHada.kousnuti(had)){
            System.err.println("Game over");
            gameOver = new GameOver(width,height);
            raster=gameOver.prohralJsi(raster,gameOver);
        }

        return raster;
    }




    public void present(final Graphics graphics) {

        presenter.present(graphics,raster);
    }

    public PSRaster getPsRaster() {
        return psRaster;
    }

    public void setPsRaster(PSRaster psRaster) {
        this.psRaster = psRaster;
    }

    public Point2D getPosledniKrok() {
        return posledniKrok;
    }

    public void setPosledniKrok(Point2D posledniKrok) {
        this.posledniKrok = posledniKrok;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Had getHad() {
        return had;
    }

    public void setHad(Had had) {
        this.had = had;
    }

    public TeloHada getTeloHada() {
        return teloHada;
    }

    public void setTeloHada(TeloHada teloHada) {
        this.teloHada = teloHada;
    }

    public AutoPlay getAutoPlay() {
        return autoPlay;
    }

    public void setAutoPlay(AutoPlay autoPlay) {
        this.autoPlay = autoPlay;
    }

    public GameOver getGameOver() {
        return gameOver;
    }

    public void setGameOver(GameOver gameOver) {
        this.gameOver = gameOver;
    }

    public TextMaker getTextMaker() {
        return textMaker;
    }

    public void setTextMaker(TextMaker textMaker) {
        this.textMaker = textMaker;
    }

    public Raster<Color> getRaster() {
        return raster;
    }

    public void setRaster(Raster<Color> raster) {
        this.raster = raster;
    }

    public Raster<Color> getPomraster() {
        return pomraster;
    }

    public void setPomraster(Raster<Color> pomraster) {
        this.pomraster = pomraster;
    }
}
