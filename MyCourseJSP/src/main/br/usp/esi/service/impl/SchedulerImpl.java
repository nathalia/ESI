package main.br.usp.esi.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import main.br.usp.esi.entities.Professor;
import main.br.usp.esi.entities.ProfessorHorarioSala;
import main.br.usp.esi.entities.Sala;
import main.br.usp.esi.service.ProfessorService;

public class SchedulerImpl {

	public ArrayList<ProfessorHorarioSala> schedule(List<Professor> professores, List<List<Integer>> preferences, Sala sala){	

		ArrayList<Professor> professoresInsatisfeitos = new ArrayList<Professor>();
		ArrayList<ProfessorHorarioSala> listaGrade = new ArrayList<ProfessorHorarioSala>();
		int[] grade = new int[36];

		HashMap<String, Integer> mapa = new HashMap<String, Integer>();

		for(int i = 0; i < 36; i++){
			if(grade[i]==0){
				Collections.shuffle(professores);
				int j = 0;
				for (Professor professor : professores) {
					if(preferences.get(j).get(i) == 1 && professor.getPreferenciasNaoAtendidas() >0){
						if(!mapa.containsKey(i+"")){
							mapa.put(i+"", professor.getId());
							professor.atendido();
						}
					}
					j++;
				}
			}
		}

		for (Professor professor : professores) {
			int restante = professor.getPreferenciasNaoAtendidas();
			for(int i = 0; i<restante; i++){
				professoresInsatisfeitos.add(professor);
			}
		}
		ProfessorService profService = new ProfessorServiceImpl();
		Collections.shuffle(professoresInsatisfeitos);
		System.out.println(professoresInsatisfeitos.size());
		for(int i = 0; i < 36; i++){
			if(grade[i]==0){
				if(mapa.containsKey(i+"")){
					grade[i] = mapa.remove(i+"");
					listaGrade.add((new ProfessorHorarioSala(
							profService.getProfessor(grade[i]),i,sala)));
				}
				else{
					grade[i] = professoresInsatisfeitos.get(0).getId();
					listaGrade.add((new ProfessorHorarioSala( 
							profService.getProfessor(grade[i]),i,sala)));
				}				
			}
		}

		for(int i = 0; i < 36; i++){
			System.out.print(grade[i]+" ");
		}
		
		System.out.println();
		return listaGrade;
	}

}
