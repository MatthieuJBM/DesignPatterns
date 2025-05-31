package factories;

import figury.Figura;
import figury.Prostokat;
import figury.Punkt;
import figury.Punkt2D;

public class Figura2DFactory implements FiguraFactory {
    public Punkt createPunkt(double x, double y) {
        return new Punkt2D(x, y);
    }

    public Figura createFigura() {
        return new Prostokat();
    }
}
