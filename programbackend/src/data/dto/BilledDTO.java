package data.dto;

public class BilledDTO {
	
	private int billedNummer;
	private int vareNummer;
	private String billedSti;
	
	public BilledDTO(int billedNummer, int vareNummer, String billedSti) {
		this.billedNummer = billedNummer;
		this.vareNummer = vareNummer;
		this.billedSti = billedSti;
	}

	public int getBilledNummer() {
		return billedNummer;
	}

	public void setBilledNummer(int billedNummer) {
		this.billedNummer = billedNummer;
	}

	public int getVareNummer() {
		return vareNummer;
	}

	public void setVareNummer(int vareNummer) {
		this.vareNummer = vareNummer;
	}

	public String getBilledSti() {
		return billedSti;
	}

	public void setBilledSti(String billedSti) {
		this.billedSti = billedSti;
	}
	
	
	

}
