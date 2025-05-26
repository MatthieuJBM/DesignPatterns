package factory;

import figures.Bryla;
import figures.Szescian;

import java.util.Scanner;

public class SzescianFactory extends FiguraFactory {
    public Bryla stworzFigure(Scanner scanner) {
        System.out.print("Podaj bok a: ");
        double a = scanner.nextDouble();
        return new Szescian(a);
    }
}
