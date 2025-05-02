public class Main {
    public static void main(String[] args) {
        System.out.println("OBSERVER PATTERN!");
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}