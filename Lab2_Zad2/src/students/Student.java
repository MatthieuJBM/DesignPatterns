package students;

import java.util.List;

public class Student {
    String imie;
    String nazwisko;
    String kierunek;
    String specjalnosc;
    List<String> preferowaneJezyki;

    public Student(String imie, String nazwisko, String kierunek, String specjalnosc, List<String> jezyki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kierunek = kierunek;
        this.specjalnosc = specjalnosc;
        this.preferowaneJezyki = jezyki;
    }
}
