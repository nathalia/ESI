package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sala_id")
	private int id;
	private int numeroSala;
	private int andar;
	@OneToOne(fetch=FetchType.LAZY)
	private ProfessorHorarioSala professorHorarioSala;
	
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
	public ProfessorHorarioSala getProfessorHorarioSala() {
		return professorHorarioSala;
	}
	public void setProfessorHorarioSala(ProfessorHorarioSala professorHorarioSala) {
		this.professorHorarioSala = professorHorarioSala;
	}
}
