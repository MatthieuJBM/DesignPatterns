package sources;

import java.util.Scanner;

public class ConsoleInput implements InputSource {
    public String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst: ");
        return scanner.nextLine();
    }
}
