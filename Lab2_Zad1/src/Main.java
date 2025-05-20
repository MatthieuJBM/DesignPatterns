import factory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static KreatorLiczby factoryNumber;

    public static void main(String[] args) throws IOException {
        System.out.println("1. Napisz kod klasy języka Java, która zwraca obiekt typu Double lub Integer, w zależności od\n" +
                "rodzaju liczby przekazanej do konstruktora w postaci tekstowej. W rozwiązaniu należy zastosować\n" +
                "odpowiedni wzorzec projektowy.");

        String input1 = "3";
        String input2 = "3.141592";

        KreatorLiczby creator1 = chooseCreator(input1);
        KreatorLiczby creator2 = chooseCreator(input2);

        ProduktLiczbowy num1 = creator1.factoryMethod(input1);
        ProduktLiczbowy num2 = creator2.factoryMethod(input2);

        System.out.println("Liczba=" + num1.getValue() + " (typ " + num1.getClass().getSimpleName() + ")");
        System.out.println("Liczba=" + num2.getValue() + " (typ " + num2.getClass().getSimpleName()+ ")");
    }

    private static KreatorLiczby chooseCreator(String input) {
        if (input.contains(".")) {
            return new KreatorDouble();
        } else {
            return new KreatorInteger();
        }
    }
}