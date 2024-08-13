package com.pibdataviz.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DataBasePIB")
public class PibEntity {
	
	@Id
	@Column(name = "Trimestre", length = 113, nullable = false, unique = true)
	private String trimestre;
	@Column(name = "VA", length = 113, nullable = false, unique = true)
	private String va;
	@Column(name = "Imposto", length = 113, nullable = false, unique = true)
	private String imposto;
	@Column(name = "PIB_Trimestral", length = 113, nullable = false, unique = true)
	private String pibTrimestral;
	@Column(name = "Aumento_Percentual_Do_PIB", length = 113, nullable = false, unique = true)
	private String aumentoPercentualDoPib;
	@Column(name = "Ano", length = 113, nullable = true)
	private int Ano;
	@Column(name = "PIB_Anual", length = 113, nullable = true)
	private int PIB_Anual;
	
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public int getPIB_Anual() {
		return PIB_Anual;
	}
	public void setPIB_Anual(int pIB_Anual) {
		PIB_Anual = pIB_Anual;
	}
	public String getTrimestre() {
		return trimestre;
	}
	public void setTrimestre(String trimestre) {
		this.trimestre = trimestre;
	}
	public String getVa() {
		return va;
	}
	public void setVa(String va) {
		this.va = va;
	}
	public String getImposto() {
		return imposto;
	}
	public void setImposto(String imposto) {
		this.imposto = imposto;
	}
	public String getPibTrimestral() {
		return pibTrimestral;
	}
	public void setPibTrimestral(String pibTrimestral) {
		this.pibTrimestral = pibTrimestral;
	}
	public String getAumentoPercentualDoPib() {
		return aumentoPercentualDoPib;
	}
	public void setAumentoPercentualDoPib(String aumentoPercentualDoPib) {
		this.aumentoPercentualDoPib = aumentoPercentualDoPib;
	}

}
