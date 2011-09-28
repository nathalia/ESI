package br.usp.esi.entities;

public class Auditorio extends Espaco {
	private int numeroAuditorio;
	private boolean dataShow;
	
	public int getNumeroAuditorio() {
		return numeroAuditorio;
	}
	public void setNumeroAuditorio(int numeroAuditorio) {
		this.numeroAuditorio = numeroAuditorio;
	}
	public boolean isDataShow() {
		return dataShow;
	}
	public void setDataShow(boolean dataShow) {
		this.dataShow = dataShow;
	}
}
