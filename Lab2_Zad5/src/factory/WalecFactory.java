package factory;

import figures.FiguraPlaska;
import figures.Kolo;
import figures.Walec;

import java.util.Scanner;

public class WalecFactory extends FiguraFactory {
    @Override
    public Object stworzFigure(Scanner scanner) {
        System.out.println("Podaj promień podstawy: ");
        double r = scanner.nextDouble();
        FiguraPlaska podstawa = new Kolo(r);
        System.out.println("Podaj wysokość walca: ");
        double h = scanner.nextDouble();

        return new Walec(podstawa, h);
    }
}
