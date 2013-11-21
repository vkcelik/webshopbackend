package logic.dto;

public class BilledeDTO {
	
	private Integer billedeNummer;
	private int vareNummer;
	private String billedeSti;
	
	public BilledeDTO(Integer billedeNummer, int vareNummer, String billedeSti) {
		this.billedeNummer = billedeNummer;
		this.vareNummer = vareNummer;
		this.billedeSti = billedeSti;
	}

	public Integer getBilledeNummer() {
		return billedeNummer;
	}

	public void setBilledeNummer(int billedeNummer) {
		this.billedeNummer = billedeNummer;
	}

	public int getVareNummer() {
		return vareNummer;
	}

	public void setVareNummer(int vareNummer) {
		this.vareNummer = vareNummer;
	}

	public String getBilledeSti() {
		return billedeSti;
	}

	public void setBilledeSti(String billedeSti) {
		this.billedeSti = billedeSti;
	}

}
