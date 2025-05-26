package figures;

public class Szescian implements Bryla {
    double a;

    public Szescian(double a) {
        this.a = a;
    }

    public double obliczPole() {
        return 6 * a * a;
    }

    public double obliczObjetosc() {
        return a * a * a;
    }
}
