public class Main {
    public static void main(String[] args) {
        System.out.println("SINGLETON PATTERN - ENUM!");
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println(singleton.getDescription());
    }
}