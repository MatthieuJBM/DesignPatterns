import editor.Editor;

/**
 * The application class sets up object relations.
 * It acts as a sender: when something needs to be done,
 * it creates a command object and executes it.
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("COMMAND PATTERN!" +
                "TEXT EDITOR!");
        Editor editor = new Editor();
        editor.init();

    }
}