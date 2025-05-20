public class Pierwiastek extends Wynik {

       public Pierwiastek(String liczba1, String liczba2) {
        if (!liczba1.matches("[0-9+-.]+") || !liczba2.matches("[0-9+-.]+")) {
            throw new IllegalArgumentException("Z�y format danych");
        }
        float dstop;
        dstop = (float) 1.0 / (float) Float.parseFloat(liczba2);
        wynik = (float) Math.pow(Float.parseFloat(liczba1), dstop);
    }
}
