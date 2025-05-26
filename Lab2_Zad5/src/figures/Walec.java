package figures;

public class Walec implements Bryla {
    private final FiguraPlaska podstawa;
    private final double wysokosc;

    public Walec(FiguraPlaska podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    public double obliczObjetosc() {
        return podstawa.obliczPole() * wysokosc;
    }

    public double obliczPole() {
        return podstawa.obliczObwod() * wysokosc;
    }
}
