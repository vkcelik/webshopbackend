package data.dto;

public class VareDTO {

	private int vareNummer;
	private String vareNavn;
	private double pris;
	private int kategoriNummer;
	private String beskrivelse;
	private double vægt;
	private double bredde;
	private double dybde;
	private double højde;
	
	public VareDTO(int vareNummer, String vareNavn, double pris,
			int kategoriNummer, String beskrivelse, double vægt, double bredde,
			double dybde, double højde) {
		this.vareNummer = vareNummer;
		this.vareNavn = vareNavn;
		this.pris = pris;
		this.kategoriNummer = kategoriNummer;
		this.beskrivelse = beskrivelse;
		this.vægt = vægt;
		this.bredde = bredde;
		this.dybde = dybde;
		this.højde = højde;
	}

	public int getVareNummer() {
		return vareNummer;
	}

	public void setVareNummer(int vareNummer) {
		this.vareNummer = vareNummer;
	}

	public String getVareNavn() {
		return vareNavn;
	}

	public void setVareNavn(String vareNavn) {
		this.vareNavn = vareNavn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public int getKategoriNummer() {
		return kategoriNummer;
	}

	public void setKategoriNummer(int kategoriNummer) {
		this.kategoriNummer = kategoriNummer;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public double getVægt() {
		return vægt;
	}

	public void setVægt(double vægt) {
		this.vægt = vægt;
	}

	public double getBredde() {
		return bredde;
	}

	public void setBredde(double bredde) {
		this.bredde = bredde;
	}

	public double getDybde() {
		return dybde;
	}

	public void setDybde(double dybde) {
		this.dybde = dybde;
	}

	public double getHøjde() {
		return højde;
	}

	public void setHøjde(double højde) {
		this.højde = højde;
	}
	
	
	
	
}
