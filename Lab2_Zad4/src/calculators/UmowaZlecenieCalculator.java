package calculators;

public class UmowaZlecenieCalculator implements WynagrodzenieCalculator {
    private final boolean czyStudent;

    public UmowaZlecenieCalculator(boolean czyStudent) {
        this.czyStudent = czyStudent;
    }

    public double oblicz(double kwotaBrutto) {
        if (czyStudent) {
            return kwotaBrutto; // brak składek dla studenta
        }
        double emerytalna = kwotaBrutto * 0.0976;
        double rentowa = kwotaBrutto * 0.015;
        double zdrowotna = (kwotaBrutto - emerytalna - rentowa) * 0.09;
        return kwotaBrutto - emerytalna - rentowa - zdrowotna;
    }
}
