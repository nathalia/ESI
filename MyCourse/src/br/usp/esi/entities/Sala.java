package br.usp.esi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala extends Espaco {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sala_id", nullable=false)
	private Integer id;
	private int numeroSala;
	private String tipoSala;
	private int andar;
	private Espaco espaco;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="num_sala", nullable=false)
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	@Column(name="tipo_sala", nullable=false, length=255)
	public String getTipoSala() {
		return tipoSala;
	}
	public void setTipoSala(String tipoSala) {
		this.tipoSala = tipoSala;
	}
	@Column(name="andar", nullable=false)
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	@JoinColumn(name="espaco_id", nullable=false)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	public Espaco getEspaco() {
		return espaco;
	}
	public void setEspaco(Espaco espaco) {
		this.espaco = espaco;
	}
}
