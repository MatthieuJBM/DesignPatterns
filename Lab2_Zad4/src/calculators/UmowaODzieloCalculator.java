package calculators;

public class UmowaODzieloCalculator implements WynagrodzenieCalculator {
    public double oblicz(double kwotaBrutto) {
        double kosztyUzyskania = kwotaBrutto * 0.20;
        double podstawaOpodatkowania = kwotaBrutto - kosztyUzyskania;
        double podatek = podstawaOpodatkowania * 0.12;
        return kwotaBrutto - podatek;
    }
}
