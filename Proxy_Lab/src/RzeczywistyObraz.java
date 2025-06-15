public class RzeczywistyObraz implements Obraz
 {
   private String nazwaPliku;

    public RzeczywistyObraz(String nazwaPliku)
    {
	    this.nazwaPliku = nazwaPliku;
	    wczytajZdysku(nazwaPliku);
	}

	public void wyswietl()
	{
	  System.out.println("Wyswietlanie obiektu " + nazwaPliku);
	}

	private void wczytajZdysku(String nazwaPliku)
	 {
	      System.out.println("Wczytywanie obiektu " + nazwaPliku);
	 }
 }
