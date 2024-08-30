package main;

public abstract class Quadrilatero extends Poligono {
    
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[] {p1, p2, p3, p4});
    }

    public Ponto getP1() {
        return getPontos()[0];
    }

    public Ponto getP2() {
        return getPontos()[1];
    }

    public Ponto getP3() {
        return getPontos()[2];
    }

    public Ponto getP4() {
        return getPontos()[3];
    }
}
