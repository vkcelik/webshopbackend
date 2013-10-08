package data.dto;

public class KategoriDTO {
	
	private int kategoriNummer;
	private String kategoriNavn;
	
	public KategoriDTO(int kategoriNummer, String kategoriNavn) {
		this.kategoriNummer = kategoriNummer;
		this.kategoriNavn = kategoriNavn;
	}
	public int getKategoriNummer() {
		return kategoriNummer;
	}
	public void setKategoriNummer(int kategoriNummer) {
		this.kategoriNummer = kategoriNummer;
	}
	public String getKategoriNavn() {
		return kategoriNavn;
	}
	public void setKategoriNavn(String kategoriNavn) {
		this.kategoriNavn = kategoriNavn;
	}
	
	

}
