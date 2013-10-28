package logic.dto;

public class RolleDTO {
	
	private int rolleNummer;
	private int medarbejderNummer;
	
	
	public RolleDTO(int rolleNummer, int medarbejderNummer) {
		this.rolleNummer = rolleNummer;
		this.medarbejderNummer = medarbejderNummer;
	}
	public int getRolleNummer() {
		return rolleNummer;
	}
	public void setRolleNummer(int rolleNummer) {
		this.rolleNummer = rolleNummer;
	}
	public int getMedarbejderNummer() {
		return medarbejderNummer;
	}
	public void setMedarbejderNummer(int medarbejderNummer) {
		this.medarbejderNummer = medarbejderNummer;
	}


}
