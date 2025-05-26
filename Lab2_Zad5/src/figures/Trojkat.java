package figures;

public class Trojkat implements FiguraPlaska {
    double a, b, c, h;

    public Trojkat(double a, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return (a * h) / 2;
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }
}
