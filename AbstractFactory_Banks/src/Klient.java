import java.io.*;

public class Klient 
{
  public static void main(String args[])throws IOException
   {
     
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Wpisz nazw� banku, w kt�rym chcesz wzi�� kredyt: ");
     String bankName=br.readLine();
     
     System.out.print("Podaj typ kredytu: ");
     String kredytname=br.readLine();
  
     FabrykaAbstrakcyjna bankFactory = KreatorFabryki.getFabryka("Bank");
     Bank b=bankFactory.getBank(bankName);

     System.out.print("Podaj stop� procentow�: " + b.getBankName() + ": ");

     double stopa=Double.parseDouble(br.readLine());
     System.out.print("Podaj wysoko�� kwoty kredytu: ");

     double kwota=Double.parseDouble(br.readLine());
     System.out.print("Wprowad� okres sp�aty kredytu (w latach): ");

     int ile_lat=Integer.parseInt(br.readLine());
     System.out.println("bierzesz kredyt z banku "+ b.getBankName());

     FabrykaAbstrakcyjna fabrykaKredytu = KreatorFabryki.getFabryka("Kredyt");
     Kredyt l=fabrykaKredytu.getKredyt(kredytname);
     l.getStopa(stopa);
     l.oblicz_rate(kwota,ile_lat);
   }
}
