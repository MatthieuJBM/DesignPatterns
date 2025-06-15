public class ObiektProxy implements Obraz
 {

	   private RzeczywistyObraz rzeczywistyObraz;
	   private String nazwaPliku;

	   public ObiektProxy(String nazwaPliku)
	   {
	      this.nazwaPliku = nazwaPliku;
	   }


	   public void wyswietl()
	   {
	      if(rzeczywistyObraz == null)
	      {
	         rzeczywistyObraz = new RzeczywistyObraz(nazwaPliku);
	      }
	      rzeczywistyObraz.wyswietl();
	   }
 }
