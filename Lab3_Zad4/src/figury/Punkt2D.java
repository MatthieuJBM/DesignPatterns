package figury;

public class Punkt2D implements Punkt {
    private double x, y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void rysuj() {
        System.out.println("Punkt2D: (" + x + ", " + y + ")");
    }
}
