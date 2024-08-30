package main;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio nao pode ser negativo");
        }
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double perimetro() {
        return Math.PI * raio + 2 * raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2) / 2;
    }

    @Override
    public double largura() {
        return 2 * raio;
    }

    @Override
    public double altura() {
        return raio;
    }
}