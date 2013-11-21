package logic.dto;

public class LeveringsmetodeDTO {

	
	private Integer leveringsmetodeNummer;
	private String leveringsmetodeNavn;
	private double leveringsmetodePris;
	
	public LeveringsmetodeDTO(Integer leveringsmetodeNummer,
			String leveringsmetodeNavn, double leveringsmetodePris) {
		this.leveringsmetodeNummer = leveringsmetodeNummer;
		this.leveringsmetodeNavn = leveringsmetodeNavn;
		this.leveringsmetodePris = leveringsmetodePris;
	}

	public Integer getLeveringsmetodeNummer() {
		return leveringsmetodeNummer;
	}

	public void setLeveringsmetodeNummer(int leveringsmetodeNummer) {
		this.leveringsmetodeNummer = leveringsmetodeNummer;
	}

	public String getLeveringsmetodeNavn() {
		return leveringsmetodeNavn;
	}

	public void setLeveringsmetodeNavn(String leveringsmetodeNavn) {
		this.leveringsmetodeNavn = leveringsmetodeNavn;
	}

	public double getLeveringsmetodePris() {
		return leveringsmetodePris;
	}

	public void setLeveringsmetodePris(double leveringsmetodePris) {
		this.leveringsmetodePris = leveringsmetodePris;
	}
	
	
	
}
