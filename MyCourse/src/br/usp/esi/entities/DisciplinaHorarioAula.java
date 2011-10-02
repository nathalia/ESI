package br.usp.esi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="disciplina_horario")
public class DisciplinaHorarioAula {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="disciplina_horario_id")
	private Integer id;
	private Date data;
	private Disciplina disciplina;
	private HorarioAula horarioAula;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="data", nullable=false)
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Column(name="disciplina", nullable=false)
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	@Column(name="horario_aula", nullable=false)
	public HorarioAula getHorarioAula() {
		return horarioAula;
	}
	public void setHorarioAula(HorarioAula horarioAula) {
		this.horarioAula = horarioAula;
	}
}
