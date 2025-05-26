package figures;

public class Prostokat implements FiguraPlaska {
    double a, b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwod() {
        return 2 * (a + b);
    }
}
