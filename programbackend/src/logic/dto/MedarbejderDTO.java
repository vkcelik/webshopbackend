package logic.dto;

public class MedarbejderDTO {
	
	private Integer medarbejderNummer;
	private String medarbejderNavn;
	private String medarbejderAdresse;
	private String medarbejderLand;
	private int medarbejderPostnummer;
	private String medarbejderEmail;
	private String medarbejderPassword;
	private String medarbejderLønType;
	private double medarbejderLøn;
	private int medarbejderRegnr;
	private String medarbejderKonto;
	private String medarbejderCpr;
	

	public MedarbejderDTO(Integer medarbejderNummer, String medarbejderNavn,
			String medarbejderAdresse, String medarbejderLand,
			int medarbejderPostnummer, String medarbejderEmail,
			String medarbejderPassword, String medarbejderLønType, double medarbejderLøn,
			int medarbejderRegnr, String medarbejderKonto, String medarbejderCpr) {
		this.medarbejderNummer = medarbejderNummer;
		this.medarbejderNavn = medarbejderNavn;
		this.medarbejderAdresse = medarbejderAdresse;
		this.medarbejderLand = medarbejderLand;
		this.medarbejderPostnummer = medarbejderPostnummer;
		this.medarbejderEmail = medarbejderEmail;
		this.medarbejderPassword = medarbejderPassword;
		this.medarbejderLønType = medarbejderLønType;
		this.medarbejderLøn = medarbejderLøn;
		this.medarbejderRegnr = medarbejderRegnr;
		this.medarbejderKonto = medarbejderKonto;
		this.medarbejderCpr = medarbejderCpr;
	}

	public Integer getMedarbejderNummer() {
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

	public String getMedarbejderLønType() {
		return medarbejderLønType;
	}

	public void setMedarbejderLønType(String medarbejderLønType) {
		this.medarbejderLønType = medarbejderLønType;
	}

	public double getMedarbejderLøn() {
		return medarbejderLøn;
	}

	public void setMedarbejderLøn(double medarbejderLøn) {
		this.medarbejderLøn = medarbejderLøn;
	}

	public int getMedarbejderRegnr() {
		return medarbejderRegnr;
	}

	public void setMedarbejderRegnr(int medarbejderRegnr) {
		this.medarbejderRegnr = medarbejderRegnr;
	}

	public String getMedarbejderKonto() {
		return medarbejderKonto;
	}

	public void setMedarbejderKonto(String medarbejderKonto) {
		this.medarbejderKonto = medarbejderKonto;
	}

	public String getMedarbejderCpr() {
		return medarbejderCpr;
	}

	public void setMedarbejderCpr(String medarbejderCpr) {
		this.medarbejderCpr = medarbejderCpr;
	}

}
