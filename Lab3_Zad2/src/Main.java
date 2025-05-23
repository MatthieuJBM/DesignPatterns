public class Main {
    public static void main(String[] args) {
        System.out.println("ABSTRACT FACTORY && ");
        System.out.println("Lab3. Zad.2 Zrealizuj implementację wzorca Fabryki abstrakcyjnej, tak aby:\n" +
                "- lista instancji trzech konkretnych fabryk była dostępna z pojedynczego egzemplarza\n" +
                "w postaci kolekcji,\n" +
                "- klient mógł pobrać referencję do konkretnej fabryki z pojedynczego egzemplarza,\n" +
                "- istniała możliwość dodawania i usuwania fabryk.");
        FactoryManager manager = FactoryManager.getInstance();

        AbstractFactory factory = manager.getFactory("1");
        System.out.println(factory.createProduct());  // "Product from Factory A"

        manager.removeFactory("1");
        manager.addFactory("4", () -> "Custom product 4");

        System.out.println(manager.getFactory("4").createProduct());  // "Custom product D"


    }
}