public class Klient {

	public static void main(String[] args) 
	{
		Part zawieszenie = new Group("Zawieszenie");
        zawieszenie.setData("zesp� element�w ��cz�cych ko�a z reszt� pojazdu. "
        		+ "Zawieszenie przenosi si�y powstaj�ce na styku ko�a z jezdni� na "
        		+ "nadwozie. Zapewnia komfort jazdy oraz stateczno�� i sterowno�� "
        		+ "pojazdu.");
       
        Part amortyzator = new SimplePart("amortyzator");
        amortyzator.setPrice(79.50);
        amortyzator.setData("mechanizm, kt�rego zadaniem jest przechwyci�"
        		+ " i rozproszy� nadmiar energii w uk�adzie mechanicznym. "
        		+ "U�ywany jest w celu zabezpieczenia urz�dzenia lub operatora "
        		+ "przed negatywnym oddzia�ywaniem drga� i zwi�kszenia komfortu "
        		+ "eksploatacji.");
        zawieszenie.addPart(amortyzator);
             
        Part sprezyna = new SimplePart("spr�yna");
        sprezyna.setPrice(659.50);
        sprezyna.setData("Utrzymuj� mas� pojazdu i �agodz� drgania wynikaj�ce "
        		+ "z poruszania si� pojazdu po nier�wnej nawierzchni. Wyd�u�aj� "
        		+ "�ywotno�� amortyzator�w oraz innych element�w uk�adu "
        		+ "jezdnego(opony, elementy metalowo-gumowe zawieszenia)."
        		+ "Spr�yny wraz z amortyzatorami w uk�adzie zawieszenia zapewniaj� "
        		+ "utrzymanie przyczepno�ci k� i umo�liwiaj� bezpieczne prowadzenie "
        		+ "pojazdu.");
        zawieszenie.addPart(sprezyna);
        System.out.println(zawieszenie.getData());
        
        Part nadwozie = new Group("Nadwozie");
        nadwozie.setData("Wymienione elementy nadzwozia pojazdu:");
       
        Part lampa_p = new SimplePart("Lampa przednia");
        lampa_p.setData("Lampa przednia sk�ada si� z szeregu element�w"
        		+ "takich jak np. klosz, elementy elektroniczne, �ar�wki, odb�y�niki,"
        		+ "uchwyty monta�owe.");
        lampa_p.setPrice(967.9);
        nadwozie.addPart(lampa_p);
             
        Part drzwi_p_l = new SimplePart("Drzwi przednie lewe");
        drzwi_p_l.setData("Drzwi przeznaczone do pojazdu Nissan");
        drzwi_p_l.setPrice(2839.5);
        nadwozie.addPart(drzwi_p_l);
             
        Part klapa = new SimplePart("Klapa baga�nika");
        klapa.setData("Klapa baga�nika do pojazdu Nissan");
        klapa.setPrice(310);
        nadwozie.addPart(klapa);
              
        Part blotnik_p = new SimplePart("B�otnik prawy przedni");
        blotnik_p.setData("B�otnik prawy przedni do pojazdu Nissan");
        blotnik_p.setPrice(1156.5);
        nadwozie.addPart(blotnik_p);
        System.out.println(nadwozie.getData());
        
        Part nakretka = new SimplePart("nakr�tka");
        nakretka.setPrice(4.35);
        nakretka.setData("Nakr�tka uniwersalna 10\"");
        System.out.println(nakretka.getData());
        
        Part felga = new SimplePart("Felga stalowa");
        felga.setPrice(880.5);
        felga.setData("Felga stalowa w rozmiarze 18\". Rozstaw �rub 4x100.");
        System.out.println(felga.getData());

	}

}
