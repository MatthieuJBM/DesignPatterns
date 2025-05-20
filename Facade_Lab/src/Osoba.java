public class Osoba
{
    private String imie;
    private String nazwisko;
    private int rok_ur;
    
    public Osoba(String imie, String nazwisko, int rok_ur)
    {
    	this.imie = imie;
    	this.nazwisko = nazwisko;
    	this.rok_ur = rok_ur;
    }
    
    public String getImie()
    {
      return imie;
    }
    
    public String getNazwisko()
    {
      return nazwisko;
    }
    
    public int getRok_u()
    {
      return rok_ur;	
    }
}
