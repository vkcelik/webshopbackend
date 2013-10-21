package data.dto;

public class RolleDTO {
	
	private int rolleNummer;
	private String rolleNavn;
	
	
	public RolleDTO(int rolleNummer, String rolleNavn) {
		this.rolleNummer = rolleNummer;
		this.rolleNavn = rolleNavn;
	}
	public int getRolleNummer() {
		return rolleNummer;
	}
	public void setRolleNummer(int rolleNummer) {
		this.rolleNummer = rolleNummer;
	}
	public String getRolleNavn() {
		return rolleNavn;
	}
	public void setRolleNavn(String rolleNavn) {
		this.rolleNavn = rolleNavn;
	}
	
	
	

}
