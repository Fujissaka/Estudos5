package main;

public class Elipse extends FormaGeometrica {
    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;
    
    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        if (semiEixoA <= 0 || semiEixoB <= 0) {
            throw new IllegalArgumentException("Semi-eixos devem ser maiores que zero");
        }
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getSemiEixoMenor() {
        return Math.min(semiEixoA, semiEixoB);
    }

    public double getSemiEixoMaior() {
        return Math.max(semiEixoA, semiEixoB);
    }

    public double cincunferencia() {
        double eixoSoma = getSemiEixoMaior() * getSemiEixoMaior() + getSemiEixoMenor() * getSemiEixoMenor();
        return Math.sqrt(eixoSoma/2) * 2 * Math.PI;
    }

    @Override
    public double perimetro() {
        return cincunferencia();
    }

    @Override
    public double area() {
        return Math.PI * getSemiEixoMaior() * getSemiEixoMenor();
    }

    @Override
    public double largura() {
        return getSemiEixoMaior() * 2;
    }

    @Override
    public double altura() {
        return getSemiEixoMenor() * 2;
    }
}
