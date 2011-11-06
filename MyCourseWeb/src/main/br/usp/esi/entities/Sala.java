package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala {
	private int id;
	private int numeroSala;
	private int andar;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="num_sala", nullable=false)
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
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
