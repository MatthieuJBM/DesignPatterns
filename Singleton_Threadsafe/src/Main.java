public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON PATTERN - THREADSAFE!");
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}