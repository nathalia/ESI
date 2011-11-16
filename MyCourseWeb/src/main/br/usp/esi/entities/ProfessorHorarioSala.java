package main.br.usp.esi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="disciplina_horario")
public class ProfessorHorarioSala {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="disciplina_horario_id")
	private Integer id;
	private Professor professor;
	@JoinColumn(name="horario_aula_id", nullable=false)
	@OneToOne
	private HorarioAula horarioAula;
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
}
