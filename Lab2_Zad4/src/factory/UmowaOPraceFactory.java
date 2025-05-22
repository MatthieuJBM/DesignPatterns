package factory;

import calculators.UmowaOPraceCalculator;
import calculators.WynagrodzenieCalculator;

public class UmowaOPraceFactory implements CalculatorFactory {
    public WynagrodzenieCalculator stworzKalkulator() {
        return new UmowaOPraceCalculator();
    }
}
