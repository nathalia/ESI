package br.usp.esi.entities;

import java.util.Date;

public class DisciplinaHorarioAula {
	private Date data;
	private Disciplina disciplina;
	private HorarioAula horarioAula;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public HorarioAula getHorarioAula() {
		return horarioAula;
	}
	public void setHorarioAula(HorarioAula horarioAula) {
		this.horarioAula = horarioAula;
	}
}
