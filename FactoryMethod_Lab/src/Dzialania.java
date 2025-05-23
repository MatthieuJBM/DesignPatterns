public class Dzialania extends Operacje
{
   
    public Wynik wybierz_dzialanie(String liczba1, char dzialanie, String liczba2) {
        switch (dzialanie) {
            case '+':
                return new Dodawanie(liczba1, liczba2);
            case '-':
                return new Odejmowanie(liczba1, liczba2);
            case '*':
                return new Mnozenie(liczba1, liczba2);
            case '/':
                return new Dzielenie(liczba1, liczba2);
            case '^':
                return new Potegowanie(liczba1, liczba2);
            case '#':
                return new Pierwiastek(liczba1, liczba2);
        }
        throw new IllegalArgumentException("Dzia�anie nie jest obs�ugiwane");

    }
}
