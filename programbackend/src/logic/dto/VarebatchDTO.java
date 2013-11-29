package logic.dto;


/**
* @author  Ziad bahlawan  
*/

public class VarebatchDTO {

	private Integer vareBatchNummer;
	private int vareNummer;
	private int vareLager;
	private String lagerPlacering;
	private int mængde;
	
	public VarebatchDTO(Integer vareBatchNummer, int vareNummer, int vareLager,
			String lagerPlacering, int mængde) {
		this.vareBatchNummer = vareBatchNummer;
		this.vareNummer = vareNummer;
		this.vareLager = vareLager;
		this.lagerPlacering = lagerPlacering;
		this.mængde = mængde;
	}

	public Integer getVareBatchNummer() {
		return vareBatchNummer;
	}

	public void setVareBatchNummer(Integer vareBatchNummer) {
		this.vareBatchNummer = vareBatchNummer;
	}

	public int getVareNummer() {
		return vareNummer;
	}

	public void setVareNummer(int vareNummer) {
		this.vareNummer = vareNummer;
	}

	public int getVareLager() {
		return vareLager;
	}

	public void setVareLager(int vareLager) {
		this.vareLager = vareLager;
	}

	public String getLagerPlacering() {
		return lagerPlacering;
	}

	public void setLagerPlacering(String lagerPlacering) {
		this.lagerPlacering = lagerPlacering;
	}

	public int getMængde() {
		return mængde;
	}

	public void setMængde(int mængde) {
		this.mængde = mængde;
	}
	
	
}