package factory;

public class Liczba_Double implements ProduktLiczbowy {
    private final Double value;

    public Liczba_Double(Double value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }
}
