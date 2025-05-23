package factory;

import calculators.UmowaODzieloCalculator;
import calculators.WynagrodzenieCalculator;

public class UmowaODzieloFactory implements CalculatorFactory {
    public WynagrodzenieCalculator stworzKalkulator() {
        return new UmowaODzieloCalculator();
    }
}
