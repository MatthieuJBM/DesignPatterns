package chocolate;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    // The volatile keyword ensures that multiple threads handle the uniqueInstance varaible correctly
    // when it is being initialized to the Singleton instance.
    private volatile static ChocolateBoiler uniqueInstance; // With volatile - double-checked locking
    // In order to create the above mentioned instance eagerly instead of lazily, you can write it like this:
    // private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {

        if (uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    System.out.println("Creating unique instance of Chocolate Boiler");
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
        // In an eagerly initialized singleton it's enough to return the instance: return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
