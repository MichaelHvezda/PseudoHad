package textMaker.abeceda;

import io.vavr.Tuple2;
import io.vavr.collection.Array;
import io.vavr.collection.IndexedSeq;
import org.jetbrains.annotations.NotNull;
import transforms.Point2D;

import java.util.ArrayList;
import java.util.List;


public class Abeceda {
    private List<Point2D> a = new ArrayList<Point2D>();
    private List<Point2D> b = new ArrayList<Point2D>();
    private List<Point2D> c = new ArrayList<Point2D>();
    private List<Point2D> d = new ArrayList<Point2D>();
    private List<Point2D> e = new ArrayList<Point2D>();
    private List<Point2D> f = new ArrayList<Point2D>();
    private List<Point2D> g = new ArrayList<Point2D>();
    private List<Point2D> h = new ArrayList<Point2D>();
    private List<Point2D> i = new ArrayList<Point2D>();
    private List<Point2D> j = new ArrayList<Point2D>();
    private List<Point2D> k = new ArrayList<Point2D>();
    private List<Point2D> l = new ArrayList<Point2D>();
    private List<Point2D> n = new ArrayList<Point2D>();
    private List<Point2D> m = new ArrayList<Point2D>();
    private List<Point2D> o = new ArrayList<Point2D>();
    private List<Point2D> p = new ArrayList<Point2D>();
    private List<Point2D> q = new ArrayList<Point2D>();
    private List<Point2D> r = new ArrayList<Point2D>();
    private List<Point2D> s = new ArrayList<Point2D>();
    private List<Point2D> t = new ArrayList<Point2D>();
    private List<Point2D> u = new ArrayList<Point2D>();
    private List<Point2D> v = new ArrayList<Point2D>();
    private List<Point2D> w = new ArrayList<Point2D>();
    private List<Point2D> x = new ArrayList<Point2D>();
    private List<Point2D> y = new ArrayList<Point2D>();
    private List<Point2D> z = new ArrayList<Point2D>();
    private List<Point2D> jedna = new ArrayList<Point2D>();
    private List<Point2D> dva = new ArrayList<Point2D>();
    private List<Point2D> tri = new ArrayList<Point2D>();
    private List<Point2D> ctyri = new ArrayList<Point2D>();
    private List<Point2D> pet = new ArrayList<Point2D>();
    private List<Point2D> sest = new ArrayList<Point2D>();
    private List<Point2D> sedm = new ArrayList<Point2D>();
    private List<Point2D> osm = new ArrayList<Point2D>();
    private List<Point2D> devet = new ArrayList<Point2D>();
    private List<Point2D> nula = new ArrayList<Point2D>();
    private List<Point2D> space = new ArrayList<Point2D>();
    private List<Point2D> dvojTecka = new ArrayList<Point2D>();



    public Abeceda(){

            a.add(new Point2D(1,0));
            a.add(new Point2D(0,1));
            a.add(new Point2D(2,1));
            a.add(new Point2D(0,2));
            a.add(new Point2D(1,2));
            a.add(new Point2D(2,2));
            a.add(new Point2D(0,3));
            a.add(new Point2D(2,3));
            a.add(new Point2D(0,4));
            a.add(new Point2D(2,4));


            b.add(new Point2D(0,0));
            b.add(new Point2D(1,0));
            b.add(new Point2D(0,1));
            b.add(new Point2D(2,1));
            b.add(new Point2D(0,2));
            b.add(new Point2D(1,2));
            b.add(new Point2D(0,3));
            b.add(new Point2D(2,3));
            b.add(new Point2D(0,4));
            b.add(new Point2D(1,4));

            c.add(new Point2D(1,0));
            c.add(new Point2D(0,1));
            c.add(new Point2D(2,1));
            c.add(new Point2D(0,2));
            c.add(new Point2D(0,3));
            c.add(new Point2D(2,3));
            c.add(new Point2D(1,4));

            d.add(new Point2D(0,0));
            d.add(new Point2D(1,0));
            d.add(new Point2D(2,0));
            d.add(new Point2D(0,1));
            d.add(new Point2D(3,1));
            d.add(new Point2D(0,2));
            d.add(new Point2D(3,2));
            d.add(new Point2D(0,3));
            d.add(new Point2D(3,3));
            d.add(new Point2D(0,4));
            d.add(new Point2D(1,4));
            d.add(new Point2D(2,4));

            e.add(new Point2D(0,0));
            e.add(new Point2D(1,0));
            e.add(new Point2D(2,0));
            e.add(new Point2D(0,1));
            e.add(new Point2D(0,2));
            e.add(new Point2D(1,2));
            e.add(new Point2D(2,2));
            e.add(new Point2D(0,3));
            e.add(new Point2D(0,4));
            e.add(new Point2D(1,4));
            e.add(new Point2D(2,4));

            f.add(new Point2D(0,0));
            f.add(new Point2D(1,0));
            f.add(new Point2D(2,0));
            f.add(new Point2D(0,1));
            f.add(new Point2D(0,2));
            f.add(new Point2D(1,2));
            f.add(new Point2D(2,2));
            f.add(new Point2D(0,3));
            f.add(new Point2D(0,4));

            g.add(new Point2D(1,0));
            g.add(new Point2D(2,0));
            g.add(new Point2D(0,1));
            g.add(new Point2D(3,1));
            g.add(new Point2D(0,2));
            g.add(new Point2D(0,3));
            g.add(new Point2D(2,3));
            g.add(new Point2D(3,3));
            g.add(new Point2D(1,4));
            g.add(new Point2D(2,4));
            g.add(new Point2D(3,4));

            h.add(new Point2D(0,0));
            h.add(new Point2D(2,0));
            h.add(new Point2D(0,1));
            h.add(new Point2D(2,1));
            h.add(new Point2D(0,2));
            h.add(new Point2D(1,2));
            h.add(new Point2D(2,2));
            h.add(new Point2D(0,3));
            h.add(new Point2D(2,3));
            h.add(new Point2D(0,4));
            h.add(new Point2D(2,4));

            i.add(new Point2D(0,0));
            i.add(new Point2D(1,0));
            i.add(new Point2D(2,0));
            i.add(new Point2D(1,1));
            i.add(new Point2D(1,2));
            i.add(new Point2D(1,3));
            i.add(new Point2D(0,4));
            i.add(new Point2D(1,4));
            i.add(new Point2D(2,4));

            j.add(new Point2D(2,0));
            j.add(new Point2D(2,1));
            j.add(new Point2D(0,2));
            j.add(new Point2D(2,2));
            j.add(new Point2D(0,3));
            j.add(new Point2D(2,3));
            j.add(new Point2D(1,4));

            k.add(new Point2D(0,0));
            k.add(new Point2D(2,0));
            k.add(new Point2D(0,1));
            k.add(new Point2D(2,1));
            k.add(new Point2D(0,2));
            k.add(new Point2D(1,2));
            k.add(new Point2D(0,3));
            k.add(new Point2D(2,3));
            k.add(new Point2D(0,4));
            k.add(new Point2D(2,4));

            l.add(new Point2D(0,0));
            l.add(new Point2D(0,1));
            l.add(new Point2D(0,2));
            l.add(new Point2D(0,3));
            l.add(new Point2D(0,4));
            l.add(new Point2D(1,4));
            l.add(new Point2D(2,4));

            n.add(new Point2D(0,0));
            n.add(new Point2D(1,0));
            n.add(new Point2D(3,0));
            n.add(new Point2D(0,1));
            n.add(new Point2D(1,1));
            n.add(new Point2D(3,1));
            n.add(new Point2D(0,2));
            n.add(new Point2D(1,2));
            n.add(new Point2D(2,2));
            n.add(new Point2D(3,2));
            n.add(new Point2D(0,3));
            n.add(new Point2D(2,3));
            n.add(new Point2D(3,3));
            n.add(new Point2D(0,4));
            n.add(new Point2D(2,4));
            n.add(new Point2D(3,4));



            m.add(new Point2D(0,0));
            m.add(new Point2D(1,0));
            m.add(new Point2D(3,0));
            m.add(new Point2D(4,0));
            m.add(new Point2D(0,1));
            m.add(new Point2D(1,1));
            m.add(new Point2D(3,1));
            m.add(new Point2D(4,1));
            m.add(new Point2D(0,2));
            m.add(new Point2D(2,2));
            m.add(new Point2D(4,2));
            m.add(new Point2D(0,3));
            m.add(new Point2D(2,3));
            m.add(new Point2D(4,3));
            m.add(new Point2D(0,4));
            m.add(new Point2D(2,4));
            m.add(new Point2D(4,4));

            o.add(new Point2D(0,0));
            o.add(new Point2D(1,0));
            o.add(new Point2D(2,0));
            o.add(new Point2D(0,1));
            o.add(new Point2D(2,1));
            o.add(new Point2D(0,2));
            o.add(new Point2D(2,2));
            o.add(new Point2D(0,3));
            o.add(new Point2D(2,3));
            o.add(new Point2D(0,4));
            o.add(new Point2D(1,4));
            o.add(new Point2D(2,4));

            p.add(new Point2D(0,0));
            p.add(new Point2D(1,0));
            p.add(new Point2D(0,1));
            p.add(new Point2D(2,1));
            p.add(new Point2D(0,2));
            p.add(new Point2D(1,2));
            p.add(new Point2D(0,3));
            p.add(new Point2D(0,4));

            q.add(new Point2D(0,0));
            q.add(new Point2D(1,0));
            q.add(new Point2D(2,0));
            q.add(new Point2D(3,0));
            q.add(new Point2D(0,1));
            q.add(new Point2D(3,1));
            q.add(new Point2D(0,2));
            q.add(new Point2D(3,2));
            q.add(new Point2D(0,3));
            q.add(new Point2D(2,3));
            q.add(new Point2D(3,3));
            q.add(new Point2D(0,4));
            q.add(new Point2D(1,4));
            q.add(new Point2D(2,4));
            q.add(new Point2D(3,4));

            r.add(new Point2D(0,0));
            r.add(new Point2D(1,0));
            r.add(new Point2D(0,1));
            r.add(new Point2D(2,1));
            r.add(new Point2D(0,2));
            r.add(new Point2D(1,2));
            r.add(new Point2D(0,3));
            r.add(new Point2D(1,3));
            r.add(new Point2D(0,4));
            r.add(new Point2D(2,4));

            s.add(new Point2D(1,0));
            s.add(new Point2D(2,0));
            s.add(new Point2D(0,1));
            s.add(new Point2D(1,2));
            s.add(new Point2D(2,3));
            s.add(new Point2D(0,4));
            s.add(new Point2D(1,4));

            t.add(new Point2D(0,0));
            t.add(new Point2D(1,0));
            t.add(new Point2D(2,0));
            t.add(new Point2D(1,1));
            t.add(new Point2D(1,2));
            t.add(new Point2D(1,3));
            t.add(new Point2D(1,4));

            u.add(new Point2D(0,0));
            u.add(new Point2D(3,0));
            u.add(new Point2D(0,1));
            u.add(new Point2D(3,1));
            u.add(new Point2D(0,2));
            u.add(new Point2D(3,2));
            u.add(new Point2D(0,3));
            u.add(new Point2D(3,3));
            u.add(new Point2D(1,4));
            u.add(new Point2D(2,4));

            v.add(new Point2D(0,0));
            v.add(new Point2D(2,0));
            v.add(new Point2D(0,1));
            v.add(new Point2D(2,1));
            v.add(new Point2D(0,2));
            v.add(new Point2D(2,2));
            v.add(new Point2D(0,3));
            v.add(new Point2D(2,3));
            v.add(new Point2D(1,4));

            w.add(new Point2D(0,0));
            w.add(new Point2D(2,0));
            w.add(new Point2D(4,0));
            w.add(new Point2D(0,1));
            w.add(new Point2D(2,1));
            w.add(new Point2D(4,1));
            w.add(new Point2D(0,2));
            w.add(new Point2D(2,2));
            w.add(new Point2D(4,2));
            w.add(new Point2D(0,3));
            w.add(new Point2D(2,3));
            w.add(new Point2D(4,3));
            w.add(new Point2D(1,4));
            w.add(new Point2D(3,4));

            x.add(new Point2D(0,0));
            x.add(new Point2D(2,0));
            x.add(new Point2D(0,1));
            x.add(new Point2D(1,1));
            x.add(new Point2D(2,1));
            x.add(new Point2D(1,2));
            x.add(new Point2D(0,3));
            x.add(new Point2D(1,3));
            x.add(new Point2D(2,3));
            x.add(new Point2D(0,4));
            x.add(new Point2D(2,4));

            y.add(new Point2D(0,0));
            y.add(new Point2D(2,0));
            y.add(new Point2D(0,1));
            y.add(new Point2D(2,1));
            y.add(new Point2D(1,2));
            y.add(new Point2D(1,3));
            y.add(new Point2D(1,4));

            z.add(new Point2D(0,0));
            z.add(new Point2D(1,0));
            z.add(new Point2D(2,0));
            z.add(new Point2D(2,1));
            z.add(new Point2D(1,2));
            z.add(new Point2D(0,3));
            z.add(new Point2D(0,4));
            z.add(new Point2D(1,4));
            z.add(new Point2D(2,4));

            jedna.add(new Point2D(1,0));
            jedna.add(new Point2D(0,1));
            jedna.add(new Point2D(1,1));
            jedna.add(new Point2D(1,2));
            jedna.add(new Point2D(1,3));
            jedna.add(new Point2D(0,4));
            jedna.add(new Point2D(1,4));
            jedna.add(new Point2D(2,4));

            dva.add(new Point2D(1,0));
            dva.add(new Point2D(0,1));
            dva.add(new Point2D(2,1));
            dva.add(new Point2D(2,2));
            dva.add(new Point2D(1,3));
            dva.add(new Point2D(0,4));
            dva.add(new Point2D(1,4));
            dva.add(new Point2D(2,4));

            tri.add(new Point2D(0,0));
            tri.add(new Point2D(1,0));
            tri.add(new Point2D(2,0));
            tri.add(new Point2D(2,1));
            tri.add(new Point2D(0,2));
            tri.add(new Point2D(1,2));
            tri.add(new Point2D(2,2));
            tri.add(new Point2D(2,3));
            tri.add(new Point2D(0,4));
            tri.add(new Point2D(1,4));
            tri.add(new Point2D(2,4));

            ctyri.add(new Point2D(0,0));
            ctyri.add(new Point2D(0,1));
            ctyri.add(new Point2D(0,2));
            ctyri.add(new Point2D(1,2));
            ctyri.add(new Point2D(2,2));
            ctyri.add(new Point2D(1,3));
            ctyri.add(new Point2D(1,4));

            pet.add(new Point2D(0,0));
            pet.add(new Point2D(1,0));
            pet.add(new Point2D(2,0));
            pet.add(new Point2D(0,1));
            pet.add(new Point2D(0,2));
            pet.add(new Point2D(1,2));
            pet.add(new Point2D(2,2));
            pet.add(new Point2D(2,3));
            pet.add(new Point2D(0,4));
            pet.add(new Point2D(1,4));
            pet.add(new Point2D(2,4));

            sest.add(new Point2D(0,0));
            sest.add(new Point2D(1,0));
            sest.add(new Point2D(0,1));
            sest.add(new Point2D(0,2));
            sest.add(new Point2D(1,2));
            sest.add(new Point2D(2,2));
            sest.add(new Point2D(0,3));
            sest.add(new Point2D(2,3));
            sest.add(new Point2D(0,4));
            sest.add(new Point2D(1,4));
            sest.add(new Point2D(2,4));

            sedm.add(new Point2D(0,0));
            sedm.add(new Point2D(1,0));
            sedm.add(new Point2D(2,0));
            sedm.add(new Point2D(2,1));
            sedm.add(new Point2D(2,2));
            sedm.add(new Point2D(2,3));
            sedm.add(new Point2D(2,4));

            osm.add(new Point2D(0,0));
            osm.add(new Point2D(1,0));
            osm.add(new Point2D(2,0));
            osm.add(new Point2D(0,1));
            osm.add(new Point2D(2,1));
            osm.add(new Point2D(0,2));
            osm.add(new Point2D(1,2));
            osm.add(new Point2D(2,2));
            osm.add(new Point2D(0,3));
            osm.add(new Point2D(2,3));
            osm.add(new Point2D(0,4));
            osm.add(new Point2D(1,4));
            osm.add(new Point2D(2,4));

            devet.add(new Point2D(0,0));
            devet.add(new Point2D(1,0));
            devet.add(new Point2D(2,0));
            devet.add(new Point2D(0,1));
            devet.add(new Point2D(2,1));
            devet.add(new Point2D(0,2));
            devet.add(new Point2D(1,2));
            devet.add(new Point2D(2,2));
            devet.add(new Point2D(2,3));
            devet.add(new Point2D(2,4));

            nula.add(new Point2D(0,0));
            nula.add(new Point2D(1,0));
            nula.add(new Point2D(2,0));
            nula.add(new Point2D(0,1));
            nula.add(new Point2D(2,1));
            nula.add(new Point2D(0,2));
            nula.add(new Point2D(2,2));
            nula.add(new Point2D(0,3));
            nula.add(new Point2D(2,3));
            nula.add(new Point2D(0,4));
            nula.add(new Point2D(1,4));
            nula.add(new Point2D(2,4));

            dvojTecka.add(new Point2D(1,1));
            dvojTecka.add(new Point2D(1,3));



    }

    public @NotNull List<Tuple2<List<Point2D>,Integer>> getPismeno(char[] pismenko){
         List<Tuple2<List<Point2D>,Integer>> seznam = new ArrayList<>();

        for (char a :
                pismenko) {

            switch (a) {
                case 'A':
                    seznam.add(new Tuple2<>(this.a,3));
                    break;
                case 'B':
                    seznam.add(new Tuple2<>(this.b,3));
                    break;
                case 'C':
                    seznam.add(new Tuple2<>(this.c,3));
                    break;
                case 'D':
                    seznam.add(new Tuple2<>(this.d,4));
                    break;
                case 'E':
                    seznam.add(new Tuple2<>(this.e,3));
                    break;
                case 'F':
                    seznam.add(new Tuple2<>(this.f,3));
                    break;
                case 'G':
                    seznam.add(new Tuple2<>(this.g,4));
                    break;
                case 'H':
                    seznam.add(new Tuple2<>(this.h,3));
                    break;
                case 'I':
                    seznam.add(new Tuple2<>(this.i,3));
                    break;
                case 'J':
                    seznam.add(new Tuple2<>(this.j,3));
                    break;
                case 'K':
                    seznam.add(new Tuple2<>(this.k,3));
                    break;
                case 'L':
                    seznam.add(new Tuple2<>(this.l,3));
                    break;
                case 'N':
                    seznam.add(new Tuple2<>(this.n,4));
                    break;
                case 'M':
                    seznam.add(new Tuple2<>(this.m,5));
                    break;
                case 'O':
                    seznam.add(new Tuple2<>(this.o,3));
                    break;
                case 'P':
                    seznam.add(new Tuple2<>(this.p,3));
                    break;
                case 'Q':
                    seznam.add(new Tuple2<>(this.q,4));
                    break;
                case 'R':
                    seznam.add(new Tuple2<>(this.r,3));
                    break;
                case 'S':
                    seznam.add(new Tuple2<>(this.s,3));
                    break;
                case 'T':
                    seznam.add(new Tuple2<>(this.t,3));
                    break;
                case 'U':
                    seznam.add(new Tuple2<>(this.u,4));
                    break;
                case 'V':
                    seznam.add(new Tuple2<>(this.v,3));
                    break;
                case 'W':
                    seznam.add(new Tuple2<>(this.w,5));
                    break;
                case 'X':
                    seznam.add(new Tuple2<>(this.x,3));
                    break;
                case 'Y':
                    seznam.add(new Tuple2<>(this.y,3));
                    break;
                case 'Z':
                    seznam.add(new Tuple2<>(this.z,3));
                    break;
                case ' ':
                    seznam.add(new Tuple2<>(this.space,3));
                    break;
                case '1':
                    seznam.add(new Tuple2<>(this.jedna,3));
                    break;
                case '2':
                    seznam.add(new Tuple2<>(this.dva,3));
                    break;
                case '3':
                    seznam.add(new Tuple2<>(this.tri,3));
                    break;
                case '4':
                    seznam.add(new Tuple2<>(this.ctyri,3));
                    break;
                case '5':
                    seznam.add(new Tuple2<>(this.pet,3));
                    break;
                case '6':
                    seznam.add(new Tuple2<>(this.sest,3));
                    break;
                case '7':
                    seznam.add(new Tuple2<>(this.sedm,3));
                    break;
                case '8':
                    seznam.add(new Tuple2<>(this.osm,3));
                    break;
                case '9':
                    seznam.add(new Tuple2<>(this.devet,3));
                    break;
                case '0':
                    seznam.add(new Tuple2<>(this.nula,3));
                    break;
                case ':':
                    seznam.add(new Tuple2<>(this.dvojTecka,1));
                    break;


            }
        }



        return seznam;
    }




}
