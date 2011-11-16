package main.br.usp.esi.entities;

import java.util.List;

public class Professor {
		private String nome;
		private int[][] preferencias = new int[6][6];
		private int preferenciasNaoAtendidas = 4;
		
		public int getPreferenciasNaoAtendidas() {
			return preferenciasNaoAtendidas;
		}
		public void atendido() {
			this.preferenciasNaoAtendidas--;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int[][] getPreferencias() {
			return preferencias;
		}
		public void setPreferencias(int[][] preferencias) {
			this.preferencias = preferencias;
		}
}
