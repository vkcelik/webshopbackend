package data.dto;

public class KundeDTO {
	
	private int kundeNummer;
	private String kundeNavn;
	private String kundeEmail;
	private String kundeAdresse;
	private String kundeLand;
	private int kundePostnummer;
	private int kundeTelefon;
	
	public KundeDTO(int kundeNummer, String kundeNavn, String kundeEmail,
			String kundeAdresse, String kundeLand, int kundePostnummer,
			int kundeTelefon) {
		this.kundeNummer = kundeNummer;
		this.kundeNavn = kundeNavn;
		this.kundeEmail = kundeEmail;
		this.kundeAdresse = kundeAdresse;
		this.kundeLand = kundeLand;
		this.kundePostnummer = kundePostnummer;
		this.kundeTelefon = kundeTelefon;
	}

	public int getKundeNummer() {
		return kundeNummer;
	}

	public void setKundeNummer(int kundeNummer) {
		this.kundeNummer = kundeNummer;
	}

	public String getKundeNavn() {
		return kundeNavn;
	}

	public void setKundeNavn(String kundeNavn) {
		this.kundeNavn = kundeNavn;
	}

	public String getKundeEmail() {
		return kundeEmail;
	}

	public void setKundeEmail(String kundeEmail) {
		this.kundeEmail = kundeEmail;
	}

	public String getKundeAdresse() {
		return kundeAdresse;
	}

	public void setKundeAdresse(String kundeAdresse) {
		this.kundeAdresse = kundeAdresse;
	}

	public String getKundeLand() {
		return kundeLand;
	}

	public void setKundeLand(String kundeLand) {
		this.kundeLand = kundeLand;
	}

	public int getKundePostnummer() {
		return kundePostnummer;
	}

	public void setKundePostnummer(int kundePostnummer) {
		this.kundePostnummer = kundePostnummer;
	}

	public int getKundeTelefon() {
		return kundeTelefon;
	}

	public void setKundeTelefon(int kundeTelefon) {
		this.kundeTelefon = kundeTelefon;
	}
	
	

}
