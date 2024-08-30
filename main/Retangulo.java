package main;

public class Retangulo extends Paralelogramo {
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public boolean quadrado() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);
        SegmentoReta s2 = new SegmentoReta(getPontos()[1], getPontos()[2]);

        if (s1.comprimento() == s2.comprimento()) {
            return true;
        }
        return false;
    }

     public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return Paralelogramo.existe(p1, p2, p3, p4) && Paralelogramo.existe(p2, p3, p4, p1);
    }
    
}
