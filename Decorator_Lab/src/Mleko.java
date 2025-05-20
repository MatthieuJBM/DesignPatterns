public class Mleko extends DekoratorPrzypraw
{
	Napoj napoj;

	public Mleko(Napoj napoj) 
	{
		this.napoj = napoj;
	}

	public String getOpis()
	{
	  return napoj.getOpis() + ", mleko";
	}

	public double koszt() 
	{
	  return 2.0 + napoj.koszt();
	}
}
