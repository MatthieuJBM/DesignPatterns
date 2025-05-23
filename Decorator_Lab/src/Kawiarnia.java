public class Kawiarnia
{
	public static void main(String args[]) 
	{
		Napoj napoj = new Espresso();
		System.out.println(napoj.getOpis() + " - cena: " + napoj.koszt() + " z� ");
 
		Napoj napoj2 = new MocnoPalona();
		napoj2 = new Czekolada(napoj2);
		napoj2 = new Czekolada(napoj2);
		napoj2 = new BitaSmietana(napoj2);
		System.out.println(napoj2.getOpis() + " - cena: " + napoj2.koszt() + " z� ");
 
		Napoj napoj3 = new MieszankaEspresso();
		napoj3 = new MleczkoSojowe(napoj3);
		napoj3 = new Czekolada(napoj3);
		napoj3 = new BitaSmietana(napoj3);
		System.out.println(napoj3.getOpis() + " - cena: " + napoj3.koszt() + " z� ");
	}
}
