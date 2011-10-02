package br.usp.esi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="auditorio")
public class Auditorio extends Espaco {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="auditorio_id", nullable=false)
	private Integer id;
	private int numeroAuditorio;
	private boolean dataShow;
	private Espaco espaco;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="num_auditorio", nullable=false)
	public int getNumeroAuditorio() {
		return numeroAuditorio;
	}
	public void setNumeroAuditorio(int numeroAuditorio) {
		this.numeroAuditorio = numeroAuditorio;
	}
	@Column(name="data_show", columnDefinition="tinyInt default 0")
	public boolean hasDataShow() {
		return dataShow;
	}
	public void setDataShow(boolean dataShow) {
		this.dataShow = dataShow;
	}
	
	@Column(name="espaco_id", nullable=false)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	public Espaco getEspaco() {
		return espaco;
	}
	public void setEspaco(Espaco espaco) {
		this.espaco = espaco;
	}
}
