public class Fasada
{
  private Osoba osoba;
  private Data data;
  private Konto konto;
  
  public Fasada(String imie, String nazwisko, int rok_ur, String login)
  {
	 osoba = new Osoba(imie, nazwisko, rok_ur);
	 data  = new Data();
	 konto = new Konto(login);
  }
	
  public void wypiszDane()
  {
	  System.out.println("U�ytkownik: " + osoba.getImie() + " " + osoba.getNazwisko());	  
  }
  
  public void wypiszWiek()
  {
	 System.out.println(data.getWiek(osoba.getRok_u())); 
  }
  
  public void wypiszDzisiejszaDate()
  {
	 data.wypiszDate(); 	  
  }
  
  public void wypiszLogin()
  {
	System.out.println("Login u�ytkownika to: "+ konto.login);  
  }
}
