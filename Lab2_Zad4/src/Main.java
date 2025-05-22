import calculators.WynagrodzenieCalculator;
import factory.CalculatorFactory;
import factory.UmowaODzieloFactory;
import factory.UmowaOPraceFactory;
import factory.UmowaZlecenieFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY METHOD!");
        System.out.println("LAB 2 ZAD 4 Dobierz właściwy wzorzec projektowy i utwórz kalkulator wynagrodzeń, tak aby na bazie\n" +
                "wprowadzonej kwoty brutto, wyboru rodzaju umowy (umowa o pracę, umowa zlecenie, umowa\n" +
                "o dzieło) oraz roku podatkowego można było wywołać metodę oblicz() i wyświetlić ile wyniesie\n" +
                "wynagrodzenie, które otrzymamy już jako wypłatę po odliczeniu odpowiednich składek (emerytalna,\n" +
                "chorobowa, rentowa, zdrowotna) – w przypadku umowy zlecenia dla osoby będącej studentem lub\n" +
                "nie, kosztów uzyskania przychodu (w przypadku umowy o dzieło) oraz kosztów pracodawcy\n" +
                "związanych z rodzajem umowy.");

        double kwotaBrutto = 5000;

        CalculatorFactory factory = new UmowaZlecenieFactory(true); // student
        WynagrodzenieCalculator kalkulator = factory.stworzKalkulator();
        double netto = kalkulator.oblicz(kwotaBrutto);
        System.out.printf("Wynagrodzenie netto student: %.2f zł%n", netto);

        CalculatorFactory factory2 = new UmowaOPraceFactory(); // student
        WynagrodzenieCalculator kalkulator2 = factory2.stworzKalkulator();
        double netto2 = kalkulator2.oblicz(kwotaBrutto);
        System.out.printf("Wynagrodzenie netto student: %.2f zł%n", netto2);

        CalculatorFactory factory3 = new UmowaODzieloFactory(); // student
        WynagrodzenieCalculator kalkulator3 = factory3.stworzKalkulator();
        double netto3 = kalkulator3.oblicz(kwotaBrutto);
        System.out.printf("Wynagrodzenie netto student: %.2f zł%n", netto3);

    }
}