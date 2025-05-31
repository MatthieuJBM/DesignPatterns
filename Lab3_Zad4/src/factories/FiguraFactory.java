package factories;

import figury.Figura;
import figury.Punkt;

public interface FiguraFactory {
    Punkt createPunkt(double x, double y);
    Figura createFigura();
}
