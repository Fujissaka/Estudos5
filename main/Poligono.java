package main;

public abstract class Poligono extends FormaGeometrica {
    Ponto[] pontos;

    public Poligono(Ponto[] pontos) {
        this.pontos = pontos;
    }

    public Ponto[] getPontos() {
        return pontos;
    }
}
