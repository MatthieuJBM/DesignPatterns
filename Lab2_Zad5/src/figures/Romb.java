package figures;

public class Romb implements FiguraPlaska {
    double a, e, f;

    public Romb(double e) {
        this.e = e;
    }

    @Override
    public double obliczPole() {
        return (e * f) / 2;
    }

    @Override
    public double obliczObwod() {
        return 4 * a;
    }
}
