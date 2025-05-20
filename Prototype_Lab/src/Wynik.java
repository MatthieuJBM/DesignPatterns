import java.util.List;

public class Wynik {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pracownik pracownicy = new Pracownik();
        pracownicy.utworzListe();

        Pracownik pracNew = (Pracownik) pracownicy.clone();
        List<String> list = pracNew.getPracList();
        list.add("Jan");

        Pracownik pracNew1 = (Pracownik) pracownicy.clone();
        List<String> list1 = pracNew1.getPracList();
        list1.remove("Marek");
        System.out.println("Lista pracownik�w: " + pracownicy.getPracList());
        System.out.println("Nowa lista pracownik�w po zatrudnieniu: " + list);
        System.out.println("Nowa lista pracownik�w po zwolnieniu: " + list1);
    }

}