package br.usp.esi.entities;

import java.util.List;

public class Grade {
	private String nomePeriodo;
	private List<HorarioAula> horarios;
	
	public String getNomePeriodo() {
		return nomePeriodo;
	}

	public void setNomePeriodo(String nomePeriodo) {
		this.nomePeriodo = nomePeriodo;
	}

	public List<HorarioAula> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioAula> horarios) {
		this.horarios = horarios;
	}
	
}
