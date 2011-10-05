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
@Table(name="sala_biblioteca")
public class SalaBiblioteca extends Espaco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sala_biblioteca_id", nullable=false)
	private Integer id;
	private int numeroSala;
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
	@JoinColumn(name="espaco_id", nullable=false)
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	public Espaco getEspaco() {
		return espaco;
	}
	public void setEspaco(Espaco espaco) {
		this.espaco = espaco;
	}
}
