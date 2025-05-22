package factory;

import calculators.UmowaZlecenieCalculator;
import calculators.WynagrodzenieCalculator;

public class UmowaZlecenieFactory implements CalculatorFactory {
    private final boolean czyStudent;

    public UmowaZlecenieFactory(boolean czyStudent) {
        this.czyStudent = czyStudent;
    }

    public WynagrodzenieCalculator stworzKalkulator() {
        return new UmowaZlecenieCalculator(czyStudent);
    }
}
