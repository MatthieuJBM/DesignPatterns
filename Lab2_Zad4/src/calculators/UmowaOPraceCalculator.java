package calculators;

public class UmowaOPraceCalculator implements WynagrodzenieCalculator {
    public double oblicz(double kwotaBrutto) {
        double emerytalna = kwotaBrutto * 0.0976;
        double rentowa = kwotaBrutto * 0.015;
        double chorobowa = kwotaBrutto * 0.0245;
        double zdrowotna = (kwotaBrutto - emerytalna - rentowa - chorobowa) * 0.09;
        double netto = kwotaBrutto - emerytalna - rentowa - chorobowa - zdrowotna;
        return netto;
    }
}
