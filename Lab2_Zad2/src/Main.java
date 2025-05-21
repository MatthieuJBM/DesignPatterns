import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory!");
        System.out.println("Lab.2 Zad.2 Wykorzystując odpowiedni wzorzec projektowy zrealizuj interfejs programistyczny oraz jego\n" +
                "implementację, która pozwoli na wprowadzenie danych osobowych studentów tego samego\n" +
                "kierunku, tak aby można było wybrać określoną specjalność (sieci komputerowe, grafika, technologie\n" +
                "wytwarzania oprogramowania, inżynieria systemów informatycznych). Dane te powinny następnie\n" +
                "zostać zapisane w plikach dwóch różnych typów. Wybór reprezentacji obiektu powinien należeć\n" +
                "jednak do użytkownika, którego życzeniem może być jeden lub większa ilość typów obiektów\n" +
                "reprezentacji zbiorów wyjściowych.");


        List<Student> students = List.of(
                new Student("Anna", "Kowalska", "grafika"),
                new Student("Jan", "Nowak", "sieci komputerowe")
        );

        List<ExporterFactory> chosenFactories = List.of(
                new JsonExporterFactory(),
                new XmlExporterFactory()
        );

        for (ExporterFactory factory : chosenFactories) {
            Exporter exporter = factory.createExporter();
            exporter.export(students, "plik." + exporter.getClass().getSimpleName().replace("Exporter", "").toLowerCase());
        }
    }
}