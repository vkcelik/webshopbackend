package data.dto;

public class OrdrelinieDTO {

	private int vareNummer;
	private int antal;
	private double stykPris;
	private double linieTotal;
	private boolean erGave;
	
	public OrdrelinieDTO(int vareNummer, int antal, double stykPris,
			double linieTotal, boolean erGave) {
		this.vareNummer = vareNummer;
		this.antal = antal;
		this.stykPris = stykPris;
		this.linieTotal = linieTotal;
		this.erGave = erGave;
	}

	public int getVareNummer() {
		return vareNummer;
	}

	public void setVareNummer(int vareNummer) {
		this.vareNummer = vareNummer;
	}

	public int getAntal() {
		return antal;
	}

	public void setAntal(int antal) {
		this.antal = antal;
	}

	public double getStykPris() {
		return stykPris;
	}

	public void setStykPris(double stykPris) {
		this.stykPris = stykPris;
	}

	public double getLinieTotal() {
		return linieTotal;
	}

	public void setLinieTotal() {
		this.linieTotal = this.stykPris*this.antal;
	}

	public boolean isErGave() {
		return erGave;
	}

	public void setErGave(boolean erGave) {
		this.erGave = erGave;
	}
	
	
}
