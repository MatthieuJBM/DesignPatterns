public class Czekolada extends DekoratorPrzypraw
{
	Napoj napoj;
 
	public Czekolada(Napoj napoj) 
	{
	  this.napoj = napoj;
	}
 
	public String getOpis()
	{
	  return napoj.getOpis() + ", czekolada";
	}
 
	public double koszt()
	{
	  return 4.0 + napoj.koszt();
	}
}
