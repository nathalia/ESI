package br.usp.esi.entities;

import java.util.List;

public class Grade {
	private List<HorarioAula> horarios;

	public List<HorarioAula> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<HorarioAula> horarios) {
		this.horarios = horarios;
	}
	
}
