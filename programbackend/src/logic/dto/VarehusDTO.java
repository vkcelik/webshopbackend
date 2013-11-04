package logic.dto;

public class VarehusDTO {
	int varehusNummer;
	String adresse;
	int postnummer;
	String leveringsTid;

	public VarehusDTO(int varehusNummer, String adresse, int postnummer, String leveringsTid) {
		this.varehusNummer = varehusNummer;
		this.adresse = adresse;
		this.postnummer = postnummer;
		this.leveringsTid = leveringsTid;
	}
	
	public int getVarehusNummer() {
		return varehusNummer;
	}
	public void setVarehusNummer(int varehusNummer) {
		this.varehusNummer = varehusNummer;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getLeveringsTid() {
		return leveringsTid;
	}
	public void setLeveringsTid(String leveringsTid) {
		this.leveringsTid = leveringsTid;
	}

	public int getPostnummer() {
		return postnummer;
	}

	public void setPostnummer(int postnummer) {
		this.postnummer = postnummer;
	}
	
	
	
}
