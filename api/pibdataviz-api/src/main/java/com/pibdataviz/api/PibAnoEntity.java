package com.pibdataviz.api;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DataBasePIB")
public class PibAnoEntity {

	@Id
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
}
