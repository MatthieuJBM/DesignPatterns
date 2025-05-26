package factory;

import figures.FiguraPlaska;
import figures.Prostokat;

import java.util.Scanner;

public class ProstokatFactory extends FiguraFactory {
    public FiguraPlaska stworzFigure(Scanner scanner) {
        System.out.print("Podaj bok a: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj bok b: ");
        double b = scanner.nextDouble();
        return new Prostokat(a, b);
    }
}
