public class Potegowanie extends Wynik {

    public Potegowanie(String liczba1, String liczba2) {

        if (!liczba1.matches("[0-9+-.]+") || !liczba2.matches("[0-9+-.]+")) {
            throw new IllegalArgumentException("Z�y format danych");
        }
        wynik = (float) Math.pow(Float.parseFloat(liczba1), Float.parseFloat(liczba2));
    }
}
