import factories.Figura2DFactory;
import factories.Figura3DFactory;
import factories.FiguraFactory;
import figury.Figura;
import figury.Punkt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3 Zad 4 !" +
                "Abstract Factory!" +
                "Napisz klasę pozwalającą na zdefiniowanie i wyrysowanie obiektu, którym będzie prymityw\n" +
                "geometryczny w postaci Punktu. Następnie wykorzystując klasę Punkt utwórz właściwą kolekcję,\n" +
                "która będzie reprezentowana przez klasę Linia. Rozszerz powstałą strukturę do klas reprezentacji\n" +
                "wymiaru 2D i 3D, tak aby można było utworzyć i wyrysować figury geometryczne Prostokąt i Sześcian.");


        FiguraFactory factory2D = new Figura2DFactory();
        Punkt p1 = factory2D.createPunkt(1, 2);
        Figura f1 = factory2D.createFigura();

        p1.rysuj();
        f1.rysuj();

        System.out.println("---");

        FiguraFactory factory3D = new Figura3DFactory();
        Punkt p2 = factory3D.createPunkt(3, 4);
        Figura f2 = factory3D.createFigura();

        p2.rysuj();
        f2.rysuj();
    }


}