import factory.ArgumentInputFactory;
import factory.ConsoleInputFactory;
import factory.InputFactory;
import sorters.TextSorter;
import sources.InputSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Lab 2 Zad 6 Wykorzystując właściwy wzorzec projektowy napisz program, który będzie umożliwiał\n" +
                "wprowadzenie tekstu z konsoli lub jako parametr tablicy łańcuchowej, tak, aby można go było\n" +
                "następnie posortować poprzez wywołanie metody sortuj(). Sposób wyboru zapisu tekstu ma być\n" +
                "reprezentowany przez oddzielną klasę.");
        InputFactory factory;
        if (args.length > 0) {
            factory = new ArgumentInputFactory(args);
        } else {
            factory = new ConsoleInputFactory();
        }

        InputSource input = factory.createInput();
        TextSorter sorter = new TextSorter(input);
        sorter.sortuj();
    }
}