package exporters;

import java.util.List;
import students.Student;

public interface Exporter {
    void export(List<Student> students, String filename);
}
