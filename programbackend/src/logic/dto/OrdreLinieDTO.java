package logic.dto;

/**
* @author  Assaad kassem
*/

public class OrdreLinieDTO {

	private int linieNummer;
	private int vareNummer;
	private int antal;
	private double stykPris;
	private double linieTotal;
	private boolean erGave; // hvis man bestiller fx 3 bøger som gave, skal der oprettes 3 ordrelinier og hver bog skal pakkes ind i gavepapir enkeltvis
	private int ordreNummer;
	
	public OrdreLinieDTO(int linieNummer, int vareNummer, int antal, double stykPris,
			double linieTotal, boolean erGave, int ordreNummer) {
		this.linieNummer = linieNummer;
		this.vareNummer = vareNummer;
		this.antal = antal;
		this.stykPris = stykPris;
		this.linieTotal = linieTotal;
		this.erGave = erGave;
		this.ordreNummer = ordreNummer;
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

	public int getLinieNummer() {
		return linieNummer;
	}

	public void setLinieNummer(int linieNummer) {
		this.linieNummer = linieNummer;
	}

	public int getOrdreNummer() {
		return ordreNummer;
	}

	public void setOrdreNummer(int ordreNummer) {
		this.ordreNummer = ordreNummer;
	}

	public void setLinieTotal(double linieTotal) {
		this.linieTotal = linieTotal;
	}
	
	
}