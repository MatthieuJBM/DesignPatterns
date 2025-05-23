package factory;

public class KreatorDouble implements KreatorLiczby {
    @Override
    public ProduktLiczbowy factoryMethod(String input) {
        try {
            return new Liczba_Double(Double.parseDouble(input));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Błąd: nieprawidłowa liczba zmiennoprzecinkowa – " + input);
        }
    }
}
