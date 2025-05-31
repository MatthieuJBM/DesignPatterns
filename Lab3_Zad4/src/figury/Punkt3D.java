package figury;

public class Punkt3D implements Punkt {
    private double x, y, z;

    public Punkt3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void rysuj() {
        System.out.println("Punkt3D: (" + x + ", " + y + ", " + z + ")");
    }
}
