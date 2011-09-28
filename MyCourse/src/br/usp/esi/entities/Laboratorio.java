package br.usp.esi.entities;

public class Laboratorio extends Espaco {
	private int numeroLab;
	private String tipoLab;
	
	public int getNumeroLab() {
		return numeroLab;
	}
	public void setNumeroLab(int numeroLab) {
		this.numeroLab = numeroLab;
	}
	public String getTipoLab() {
		return tipoLab;
	}
	public void setTipoLab(String tipoLab) {
		this.tipoLab = tipoLab;
	}
}
