import caretaker.History;
import originator.Document;

public class Main {
    public static void main(String[] args) {
        System.out.println("MEMENTO PATTERN!");
        // 1.
        Document document = new Document("Initial content\n");
        History history = new History();
        // 2. Write some content
        document.write("Additional content\n");
        history.addMemento(document.createMemento());
        // 3. Write more content
        document.write("More content\n");
        history.addMemento(document.createMemento());
        // 4. Restore to previous state
        document.restoreFromMemento(history.getMemento());

       System.out.println(document.getContent());
    }
}