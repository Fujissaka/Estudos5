package main;

public class Circulo extends Elipse{

    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
    }

    public double getRaio() {
        return getSemiEixoMaior();
    }

    @Override
    public double cincunferencia() {
        return 2 * Math.PI * getRaio();
    }

    @Override
    public double perimetro() {
        return this.cincunferencia();
    }
}
