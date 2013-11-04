package logic.dto;

public class KategoriDTO {
	
	private int kategoriNummer;
	private String kategoriNavn;
	private int parent;
	
	public KategoriDTO(int kategoriNummer, String kategoriNavn, int parent) {
		this.kategoriNummer = kategoriNummer;
		this.kategoriNavn = kategoriNavn;
		this.parent = parent;
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

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}
	
	

}
