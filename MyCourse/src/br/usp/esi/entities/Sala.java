package br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala extends Espaco {
	private int numeroSala;
	private String tipoSala;
	private int andar;
//	private Espaco espaco;
	
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
//	@JoinColumn(name="espaco_id", nullable=false)
//	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
//	public Espaco getEspaco() {
//		return espaco;
//	}
//	public void setEspaco(Espaco espaco) {
//		this.espaco = espaco;
//	}
}
