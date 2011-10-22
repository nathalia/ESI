package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sala_biblioteca")
public class SalaBiblioteca extends Espaco {
	private int numeroSala;
//	private Espaco espaco;

	@Column(name="num_sala", nullable=false)
	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
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
