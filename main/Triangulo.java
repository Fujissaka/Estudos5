package main;

public class Triangulo extends Poligono {
    
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[] {p1, p2, p3});
    }

    @Override
    public double largura() {
        return Math.abs(getPontos()[1].getCoordX() - getPontos()[2].getCoordX());
    }

    @Override
    public double altura() {
        return Math.abs(getPontos()[0].getCoordY() - getPontos()[1].getCoordY());
    }

    @Override
    public double area() {
        return (largura() * altura()) / 2;
    }

    @Override
    public double perimetro() {
        SegmentoReta s1 = new SegmentoReta(getPontos()[0], getPontos()[1]);
        SegmentoReta s2 = new SegmentoReta(getPontos()[1], getPontos()[2]);
        SegmentoReta s3 = new SegmentoReta(getPontos()[2], getPontos()[0]);

        return s1.comprimento() + s2.comprimento() + s3.comprimento();
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
}
