package factory;

public class KreatorInteger implements KreatorLiczby {
    @Override
    public ProduktLiczbowy factoryMethod(String input) {
        try {
            return new Liczba_Integer(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Błąd: nieprawidłowa liczba całkowita – " + input);
        }
    }
}
