package exporters;

import students.Student;

import java.util.List;

public class JsonExporter implements Exporter {
    public void export(List<Student> students, String filename) {
        // Tu zapis do JSON (można uprościć)
        System.out.println("Eksport do JSON: " + filename);
    }
}
