package students;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private String kierunek;
    private List<Student> students = new ArrayList<>();

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void addStudent(String imie, String nazwisko, String specjalnosc, List<String> jezyki) {
        students.add(new Student(imie, nazwisko, kierunek, specjalnosc, jezyki));
    }

    public List<Student> getStudents() {
        return students;
    }
}
