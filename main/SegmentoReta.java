package main;

public class SegmentoReta extends ObjetoGeometrico {
    final private Ponto p1;
    final private Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double comprimento() {
        return Math.sqrt(Math.pow(p2.getCoordX() - p1.getCoordX(), 2) + 
            Math.pow(p2.getCoordY() - p1.getCoordY(), 2));
    }

    public double coeficienteAngular() {
        if (p2.getCoordX() - p1.getCoordX() == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (p2.getCoordY() - p1.getCoordY()) / (p2.getCoordX() - p1.getCoordX());
    }

    public boolean paralelo(SegmentoReta s) {
        return this.coeficienteAngular() == s.coeficienteAngular();
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
    
}
