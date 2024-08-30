package main;

public class Trapezio extends Quadrilatero {
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }
    
    public SegmentoReta baseMenor() {
        SegmentoReta p12 = new SegmentoReta(getP1(), getP2());
        SegmentoReta p34 = new SegmentoReta(getP3(), getP4());
        if (p12.comprimento() < p34.comprimento()) {
            return p12;
        }
        return p34;
    }

    public SegmentoReta baseMaior() {
        SegmentoReta p12 = new SegmentoReta(getP1(), getP2());
        SegmentoReta p34 = new SegmentoReta(getP3(), getP4());
        if (p12.comprimento() > p34.comprimento()) {
            return p12;
        }
        return p34;
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p3, p4);
        return s1.paralelo(s2);
    }

    @Override
    public double area() {
        return (baseMaior().comprimento() + baseMenor().comprimento()) * altura() / 2;
    }

    @Override
    public double perimetro() {
        SegmentoReta s1 = new SegmentoReta(pontos[0], pontos[1]);
        SegmentoReta s2 = new SegmentoReta(pontos[1], pontos[2]);
        SegmentoReta s3 = new SegmentoReta(pontos[2], pontos[3]);
        SegmentoReta s4 = new SegmentoReta(pontos[3], pontos[0]);
        return s1.comprimento() + s2.comprimento() + s3.comprimento() + s4.comprimento();
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double altura() {
        return Math.abs(pontos[1].getCoordY() - pontos[2].getCoordY()); //a altura é a diferença entre as coordenadas y dos pontos 2 e 3
    }
}
