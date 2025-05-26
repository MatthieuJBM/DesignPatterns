package figures;

public class Kolo implements FiguraPlaska {
    double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return 3.14 * r * r;
    }

    @Override
    public double obliczObwod() {
        return 2 * 3.14 * r;
    }
}
