import student_decorators.StypendiumNaukowe;
import student_decorators.StypendiumRektora;
import student_decorators.StypendiumSocjalne;
import students.Student;
import students.StudentBasic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3 Zad 3 " +
                "Decorator Pattern!" +
                "Stosując odpowiedni wzorzec projektowy zaprojektuj strukturę klas:\n" +
                "- Student,\n" +
                "- Student_ze_stypendium_socjalnym,\n" +
                "- Student_ze_stypendium_naukowym,\n" +
                "- Student_ze_stypendium_rektora\n" +
                "tak, aby można było dodawać zobowiązania do kolejnych obiektów, które można w każdej chwili\n" +
                "cofnąć (na przykład student o nr albumu w9999 może pobierać stypendium naukowe i socjalne, ale w\n" +
                "każdej chwili decyzja o jednym z nich może być cofnięta nie wpływając na podstawową strukturę\n" +
                "obiektu stanowiącego podstawę alokacji głównych atrybutów). Pokaż przykłady wywołań różnych\n" +
                "kombinacji obiektów spełniających powyższe założenia.");


        Student student1 = new StudentBasic("w99999");
        System.out.println(student1.getScolarshipAmount());
        student1 = new StypendiumSocjalne(student1);
        System.out.println(student1.getScolarshipAmount());
        student1 = new StypendiumNaukowe(student1);
        System.out.println(student1.getScolarshipAmount());
        student1 = new StypendiumRektora(student1);
        System.out.println(student1.getScolarshipAmount());

        System.out.println("Suma stypendiów: " + student1.getScolarshipAmount());


    }
}