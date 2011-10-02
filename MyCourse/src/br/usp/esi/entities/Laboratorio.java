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
@Table(name="laboratorio")
public class Laboratorio extends Espaco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="laboratorio_id", nullable=false)
	private Integer id;
	private int numeroLab;
	private String tipoLab;
	private Espaco espaco;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="num_lab", nullable=false)
	public int getNumeroLab() {
		return numeroLab;
	}
	public void setNumeroLab(int numeroLab) {
		this.numeroLab = numeroLab;
	}
	@Column(name="tipo_lab", nullable=false, length=255)
	public String getTipoLab() {
		return tipoLab;
	}
	public void setTipoLab(String tipoLab) {
		this.tipoLab = tipoLab;
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
