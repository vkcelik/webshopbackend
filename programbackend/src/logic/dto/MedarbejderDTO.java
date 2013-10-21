package logic.dto;

public class MedarbejderDTO {
	
	private int medarbejderNummer;
	private String medarbejderNavn;
	private String medarbejderAdresse;
	private String medarbejderLand;
	private int medarbejderPostnummer;
	private String medarbejderEmail;
	private String medarbejderPassword;
	private String medarbejderRolle;
	
	public MedarbejderDTO(int medarbejderNummer, String medarbejderNavn,
			String medarbejderAdresse, String medarbejderLand,
			int medarbejderPostnummer, String medarbejderEmail,
			String medarbejderPassword, String medarbejderRolle) {
		this.medarbejderNummer = medarbejderNummer;
		this.medarbejderNavn = medarbejderNavn;
		this.medarbejderAdresse = medarbejderAdresse;
		this.medarbejderLand = medarbejderLand;
		this.medarbejderPostnummer = medarbejderPostnummer;
		this.medarbejderEmail = medarbejderEmail;
		this.medarbejderPassword = medarbejderPassword;
		this.medarbejderRolle = medarbejderRolle;
	}

	public int getMedarbejderNummer() {
		return medarbejderNummer;
	}

	public void setMedarbejderNummer(int medarbejderNummer) {
		this.medarbejderNummer = medarbejderNummer;
	}

	public String getMedarbejderNavn() {
		return medarbejderNavn;
	}

	public void setMedarbejderNavn(String medarbejderNavn) {
		this.medarbejderNavn = medarbejderNavn;
	}

	public String getMedarbejderAdresse() {
		return medarbejderAdresse;
	}

	public void setMedarbejderAdresse(String medarbejderAdresse) {
		this.medarbejderAdresse = medarbejderAdresse;
	}

	public String getMedarbejderLand() {
		return medarbejderLand;
	}

	public void setMedarbejderLand(String medarbejderLand) {
		this.medarbejderLand = medarbejderLand;
	}

	public int getMedarbejderPostnummer() {
		return medarbejderPostnummer;
	}

	public void setMedarbejderPostnummer(int medarbejderPostnummer) {
		this.medarbejderPostnummer = medarbejderPostnummer;
	}

	public String getMedarbejderEmail() {
		return medarbejderEmail;
	}

	public void setMedarbejderEmail(String medarbejderEmail) {
		this.medarbejderEmail = medarbejderEmail;
	}

	public String getMedarbejderPassword() {
		return medarbejderPassword;
	}

	public void setMedarbejderPassword(String medarbejderPassword) {
		this.medarbejderPassword = medarbejderPassword;
	}

	public String getMedarbejderRolle() {
		return medarbejderRolle;
	}

	public void setMedarbejderRolle(String medarbejderRolle) {
		this.medarbejderRolle = medarbejderRolle;
	}
	
	
	

}
