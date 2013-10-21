package logic.dto;

public class IndstillingDTO {

	private int indstillingNummer;
	private String indstillingVærdi;
	
	public IndstillingDTO(int indstillingNummer, String indstillingVærdi) {
		this.indstillingNummer = indstillingNummer;
		this.indstillingVærdi = indstillingVærdi;
	}

	public int getIndstillingNummer() {
		return indstillingNummer;
	}

	public void setIndstillingNummer(int indstillingNummer) {
		this.indstillingNummer = indstillingNummer;
	}

	public String getIndstillingVærdi() {
		return indstillingVærdi;
	}

	public void setIndstillingVærdi(String indstillingVærdi) {
		this.indstillingVærdi = indstillingVærdi;
	}
	
	
}
