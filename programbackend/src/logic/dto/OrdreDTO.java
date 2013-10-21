package logic.dto;

public class OrdreDTO {

	private int ordreNummer;
	private int kundeNummer;
	private int bestillingsDato;
	private double total;
	private String ordreStatus;
	
	public OrdreDTO(int ordreNummer, int kundeNummer, int bestillingsDato,
			double total, String ordreStatus) {
		this.ordreNummer = ordreNummer;
		this.kundeNummer = kundeNummer;
		this.bestillingsDato = bestillingsDato;
		this.total = total;
		this.ordreStatus = ordreStatus;
	}

	public int getOrdreNummer() {
		return ordreNummer;
	}

	public void setOrdreNummer(int ordreNummer) {
		this.ordreNummer = ordreNummer;
	}

	public int getKundeNummer() {
		return kundeNummer;
	}

	public void setKundeNummer(int kundeNummer) {
		this.kundeNummer = kundeNummer;
	}

	public int getBestillingsDato() {
		return bestillingsDato;
	}

	public void setBestillingsDato(int bestillingsDato) {
		this.bestillingsDato = bestillingsDato;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getOrdreStatus() {
		return ordreStatus;
	}

	public void setOrdreStatus(String ordreStatus) {
		this.ordreStatus = ordreStatus;
	}
	
	
}
