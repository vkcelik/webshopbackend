package logic.dto;

import java.sql.Timestamp;

/**
* @author  Veli Kerim Celik  
*/
public class OrdreDTO {

	private int ordreNummer;
	private int kundeNummer;
	private Timestamp bestillingsDato;
	private double total;
	private double leveringsPris;
	private String ordreStatus;
	private String leveringsAdresse;
	private int leveringsPostnummer;
	private String faktureringsAdresse;
	private int faktureringsPostnummer;
	private int leveringsMetode;
	
	public OrdreDTO(int ordreNummer, int kundeNummer, Timestamp bestillingsDato,
			double total, double leveringsPris, String ordreStatus, String leveringsAdresse,
			int leveringsPostnummer, String faktureringsAdresse, int faktureringsPostnummer,
			int leveringsMetode) {
		this.ordreNummer = ordreNummer;
		this.kundeNummer = kundeNummer;
		this.bestillingsDato = bestillingsDato;
		this.total = total;
		this.ordreStatus = ordreStatus;
		this.leveringsPris = leveringsPris;
		this.leveringsAdresse = leveringsAdresse;
		this.leveringsPostnummer = leveringsPostnummer;
		this.faktureringsAdresse = faktureringsAdresse;
		this.faktureringsPostnummer = faktureringsPostnummer;
		this.leveringsMetode = leveringsMetode;
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

	public Timestamp getBestillingsDato() {
		return bestillingsDato;
	}

	public void setBestillingsDato(Timestamp bestillingsDato) {
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

	public double getLeveringsPris() {
		return leveringsPris;
	}

	public void setLeveringsPris(double leveringsPris) {
		this.leveringsPris = leveringsPris;
	}

	public String getLeveringsAdresse() {
		return leveringsAdresse;
	}

	public void setLeveringsAdresse(String leveringsAdresse) {
		this.leveringsAdresse = leveringsAdresse;
	}

	public int getLeveringsPostnummer() {
		return leveringsPostnummer;
	}

	public void setLeveringsPostnummer(int leveringsPostnummer) {
		this.leveringsPostnummer = leveringsPostnummer;
	}

	public String getFaktureringsAdresse() {
		return faktureringsAdresse;
	}

	public void setFaktureringsAdresse(String faktureringsAdresse) {
		this.faktureringsAdresse = faktureringsAdresse;
	}

	public int getFaktureringsPostnummer() {
		return faktureringsPostnummer;
	}

	public void setFaktureringsPostnummer(int faktureringsPostnummer) {
		this.faktureringsPostnummer = faktureringsPostnummer;
	}

	public int getLeveringsMetode() {
		return leveringsMetode;
	}

	public void setLeveringsMetode(int leveringsMetode) {
		this.leveringsMetode = leveringsMetode;
	}
	
	
}
