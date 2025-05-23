package students;

import java.util.List;

public interface StudentGroupBuilder {
    void setKierunek(String kierunek);

    void addStudent(String imie, String nazwisko, String specjalnosc, List<String> jezyki);

    List<Student> getStudents();
}
