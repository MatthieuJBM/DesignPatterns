import java.util.*;

public class Kalkulator_prosty 
{
    public static void main(String args[]) {

        System.out.println("Factory Method");
        System.out.println("Lab.2 Zad.1 Napisz kod klasy języka Java, która zwraca obiekt typu Double lub Integer, w zależności od\n" +
                "rodzaju liczby przekazanej do konstruktora w postaci tekstowej. W rozwiązaniu należy zastosować\n" +
                "odpowiedni wzorzec projektowy.");

        Dzialania oo = new Dzialania();
        Wynik wynik = new Wynik();
        String liczba1, liczba2;
        char operator;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsz� liczb�: ");        
        liczba1 = sc.nextLine();
        
        System.out.println("Podaj dzia�anie (+,-,* lub /): ");
        operator = sc.nextLine().charAt(0);
        
        System.out.println("Podaj drug� liczb�: ");        
        liczba2 = sc.nextLine();
        
        wynik = oo.wybierz_dzialanie(liczba1,operator,liczba2);
        System.out.println(wynik.getWynik());
       
    }
       
}
