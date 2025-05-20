public class BitaSmietana extends DekoratorPrzypraw {
	Napoj napoj;
 
	public BitaSmietana(Napoj napoj) {
		this.napoj = napoj;
	}
 
	public String getOpis() {
		return napoj.getOpis() + ", bita �mietana";
	}
 
	public double koszt() {
		return 1.5 + napoj.koszt();
	}
}
