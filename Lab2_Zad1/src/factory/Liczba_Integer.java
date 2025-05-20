package factory;

public class Liczba_Integer implements ProduktLiczbowy {
    private final Integer value;

    public Liczba_Integer(Integer value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }
}
