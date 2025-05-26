import factory.FiguraFactory;
import factory.ProstokatFactory;
import factory.SzescianFactory;
import factory.WalecFactory;
import figures.Bryla;
import figures.FiguraPlaska;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY METHOD!");
        System.out.println("LAB 2 ZAD 5 Wykorzystując odpowiedni wzorzec projektowy napisz aplikację pozwalającą na obliczenie\n" +
                "pola i obwodu prostokąta, rombu, trójkąta oraz koła. Użytkownik powinien mieć możliwość\n" +
                "wprowadzenia rodzaju figury geometrycznej z klawiatury. Następnie rozszerz aplikację o możliwość\n" +
                "obliczania pola i objętości dla brył geometrycznych typu: sześcian, ostrosłup i walec.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz figurę:");
        System.out.println("1 - Prostokąt");
        System.out.println("2 - Romb");
        System.out.println("3 - Trójkąt");
        System.out.println("4 - Koło");
        System.out.println("5 - Sześcian");
        System.out.println("6 - Ostrosłup");
        System.out.println("7 - Walec");

        int wybor = scanner.nextInt();
        FiguraFactory factory = null;
        Object figura = null;

        switch (wybor) {
            case 1 -> factory = new ProstokatFactory();
//            case 2 -> factory = new RombFactory();
//            case 3 -> factory = new TrojkatFactory();
//            case 4 -> factory = new KoloFactory();
            case 5 -> factory = new SzescianFactory();
//            case 6 -> factory = new OstroslupFactory();
            case 7 -> factory = new WalecFactory();
            // dodaj kolejne przypadki dla rombu, trójkąta, brył itd.
            default -> {
                System.out.println("Nieznany wybór.");
                System.exit(1);
            }
        }

        figura = factory.stworzFigure(scanner);

        if (figura instanceof FiguraPlaska f) {
            System.out.println("Pole: " + f.obliczPole());
            System.out.println("Obwód: " + f.obliczObwod());
        } else if (figura instanceof Bryla b) {
            System.out.println("Pole powierzchni: " + b.obliczPole());
            System.out.println("Objętość: " + b.obliczObjetosc());
        }

    }
}