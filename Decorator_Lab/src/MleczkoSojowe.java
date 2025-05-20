public class MleczkoSojowe extends DekoratorPrzypraw {
	Napoj napoj;

	public MleczkoSojowe(Napoj m_sojowe) {
		this.napoj = m_sojowe;
	}

	public String getOpis() {
		return napoj.getOpis() + ", mleczko sojowe";
	}

	public double koszt() {
		return 3.0 + napoj.koszt();
	}
}
