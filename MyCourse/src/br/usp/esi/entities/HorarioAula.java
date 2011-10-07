package br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="horario_aula")
public class HorarioAula {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="horaio_aula_id", nullable=false)
	private Integer id;
	private int horaInicio;
	private int horaFim;
	@JoinColumn(name="grade_id", nullable=false)
	@ManyToOne
	private Grade grade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="horario_inicio", nullable=false)
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	@Column(name="horario_fim", nullable=false)
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
