package main.br.usp.esi.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import main.br.usp.esi.entities.Professor;

public class SchedulerImpl {
	ArrayList<Professor> professores = new ArrayList<Professor>();
	ArrayList<Professor> professoresInsatisfeitos = new ArrayList<Professor>();

	public void schedule(){
		int[][] pref1 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof1 = new Professor();
		prof1.setNome("1");
		prof1.setPreferencias(pref1);
		professores.add(prof1);

		int[][] pref2 = {{0,1,0,0,0,0},{1,1,0,0,0,0},{0,0,0,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof2 = new Professor();
		prof2.setNome("2");
		prof2.setPreferencias(pref2);
		professores.add(prof2);

		int[][] pref3 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof3 = new Professor();
		prof3.setNome("3");
		prof3.setPreferencias(pref3);
		professores.add(prof3);

		int[][] pref4 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof4 = new Professor();
		prof4.setNome("4");
		prof4.setPreferencias(pref4);
		professores.add(prof4);

		int[][] pref5 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof5 = new Professor();
		prof5.setNome("5");
		prof5.setPreferencias(pref5);
		professores.add(prof5);

		int[][] pref6 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof6 = new Professor();
		prof6.setNome("6");
		prof6.setPreferencias(pref6);
		professores.add(prof6);

		int[][] pref7 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof7 = new Professor();
		prof7.setNome("7");
		prof7.setPreferencias(pref7);
		professores.add(prof7);

		int[][] pref8 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof8 = new Professor();
		prof8.setNome("8");
		prof8.setPreferencias(pref8);
		professores.add(prof8);

		int[][] pref9 = {{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,1,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
		Professor prof9 = new Professor();
		prof9.setNome("9");
		prof9.setPreferencias(pref9);
		professores.add(prof9);

		String[][] grade = new String[6][6];

		HashMap<String, String> mapa = new HashMap<String, String>();

		for(int i = 0; i < 6; i++){
			for(int j = 0; j< 6; j++){
				if(grade[i][j]==null){
					Collections.shuffle(professores);
					for (Professor professor : professores) {
						if(professor.getPreferencias()[i][j] == 1){
							if(!mapa.containsKey(i+""+j)){
								mapa.put(i+""+j, professor.getNome());
								professor.atendido();
							}
						}
					}
				}
			}
		}

		for (Professor professor : professores) {
			int restante = professor.getPreferenciasNaoAtendidas();
			for(int i = 0; i<restante; i++){
				professoresInsatisfeitos.add(professor);
			}
		}

		Collections.shuffle(professoresInsatisfeitos);
		for(int i = 0; i < 6; i++){
			for(int j = 0; j< 6; j++){
				if(grade[i][j]==null){
					if(mapa.containsKey(i+""+j)){
						grade[i][j] = mapa.remove(i+""+j);
					}
					else{
						grade[i][j] = professoresInsatisfeitos.remove(0).getNome();
					}				
				}
			}
		}

		for(int i = 0; i < 6; i++){
			for(int j = 0; j< 6; j++){
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}

	}
}
