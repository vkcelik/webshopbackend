package data.dto;

public class BynavnDTO {

	private int postNummer;
	private String byNavn;
	
	public BynavnDTO(int postNummer, String byNavn) {
		this.postNummer = postNummer;
		this.byNavn = byNavn;
	}

	public int getPostNummer() {
		return postNummer;
	}

	public void setPostNummer(int postNummer) {
		this.postNummer = postNummer;
	}

	public String getByNavn() {
		return byNavn;
	}

	public void setByNavn(String byNavn) {
		this.byNavn = byNavn;
	}
	
	
	
	
	
}
