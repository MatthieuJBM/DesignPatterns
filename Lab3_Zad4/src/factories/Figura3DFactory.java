package factories;

import figury.Figura;
import figury.Punkt;
import figury.Punkt3D;
import figury.Szescian;

public class Figura3DFactory implements FiguraFactory {
    public Punkt createPunkt(double x, double y) {
        return new Punkt3D(x, y, 0); // lub dodaj 3. parametr
    }

    public Figura createFigura() {
        return new Szescian();
    }
}
