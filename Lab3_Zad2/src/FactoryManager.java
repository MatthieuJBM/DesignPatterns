import java.util.HashMap;
import java.util.Map;

public class FactoryManager {
    private static volatile FactoryManager factoryManager;

    private static Map<String, AbstractFactory> factories = new HashMap<>();

    private FactoryManager() {
        factories.put("1", new Factory1());
        factories.put("2", new Factory2());
        factories.put("3", new Factory3());
    }

    public static FactoryManager getInstance() {
        if (factoryManager == null) {
            synchronized (FactoryManager.class) {
                if (factoryManager == null) {
                    factoryManager = new FactoryManager();
                }
            }
        }
        return factoryManager;
    }

    public AbstractFactory getFactory(String name) {
        return factories.get(name);
    }

    public void addFactory(String key, AbstractFactory factory) {
        factories.put(key, factory);
    }

    public void removeFactory(String key){
        factories.remove(key);
    }


}
