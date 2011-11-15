package main.br.usp.esi.entities;

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
@Table(name="professor_horario_sala")
public class ProfessorHorarioSala {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="professor_disciplina_sala_id")
	private Integer id;
	@OneToOne(fetch=FetchType.LAZY)
	private Professor professor;
	@JoinColumn(name="horario_aula_id", nullable=false)
	@OneToOne
	private HorarioAula horarioAula;
	@OneToOne(fetch=FetchType.LAZY)
	private Sala sala;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public HorarioAula getHorarioAula() {
		return horarioAula;
	}
	public void setHorarioAula(HorarioAula horarioAula) {
		this.horarioAula = horarioAula;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
}
