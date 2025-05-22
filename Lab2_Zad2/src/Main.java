import exporters.Exporter;
import exporters.JsonExporter;
import students.StudentGroup;

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
                "reprezentacji zbiorów wyjściowych." +
                "Lab.2 Zad.3 Zbuduj interfejs pozwalający na wykorzystanie istniejącej implementacji z zadania 2 i dostosuj\n" +
                "go tak, aby można było tworzyć listy dowolnych kierunków i specjalności studiów z podziałem na\n" +
                "preferencje językowe.");

        StudentGroup group = new StudentGroup();
        group.setKierunek("Informatyka");

        group.addStudent("Anna", "Kowalska", "Grafika", List.of("Python", "JavaScript"));
        group.addStudent("Jan", "Nowak", "Sieci Komputerowe", List.of("C", "Python"));

        Exporter exporter = new JsonExporter();
        exporter.export(group.getStudents(), "studenci.json");
    }

//        List<students.Student> students = List.of(
//                new students.Student("Anna", "Kowalska", "grafika"),
//                new students.Student("Jan", "Nowak", "sieci komputerowe")
//        );

//        List<factories.ExporterFactory> chosenFactories = List.of(
//                new factories.JsonExporterFactory(),
//                new factories.XmlExporterFactory()
//        );
//
//        for (factories.ExporterFactory factory : chosenFactories) {
//            exporters.Exporter exporter = factory.createExporter();
//            exporter.export(students, "plik." + exporter.getClass().getSimpleName().replace("exporters.Exporter", "").toLowerCase());
//        }
//    }
}