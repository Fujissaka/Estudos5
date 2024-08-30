package main;

public class Paralelogramo extends Trapezio {
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        if (Trapezio.existe(p1, p2, p3, p4)) { //se eh trapezio, pode ser paralelogramo
            SegmentoReta p12 = new SegmentoReta(p1, p2); //reta p1p2, Base A
            SegmentoReta p23 = new SegmentoReta(p2, p3); //reta p2p3, Lado A
            SegmentoReta p34 = new SegmentoReta(p3, p4); //reta p3p4, Base B
            SegmentoReta p41 = new SegmentoReta(p4, p1); //reta p4p1, Lado B

            boolean basesIguais = Math.abs(p12.comprimento() - p34.comprimento()) < 0.00001;
            boolean ladosIguais = Math.abs(p23.comprimento() - p41.comprimento()) < 0.00001;

            return basesIguais && ladosIguais;
        }
        return false;
    }
}
