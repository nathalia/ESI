package br.usp.esi.entities;

public class Disciplina {
	private int id;
	private String nome;
	private int codigo;
	private int creditosAula;
	private int creditosTrabalho;
	private int cargaHoraria;
	private int descricao;
	private int periodoIdeal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCreditosAula() {
		return creditosAula;
	}
	public void setCreditosAula(int creditosAula) {
		this.creditosAula = creditosAula;
	}
	public int getCreditosTrabalho() {
		return creditosTrabalho;
	}
	public void setCreditosTrabalho(int creditosTrabalho) {
		this.creditosTrabalho = creditosTrabalho;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getDescricao() {
		return descricao;
	}
	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
	public int getPeriodoIdeal() {
		return periodoIdeal;
	}
	public void setPeriodoIdeal(int periodoIdeal) {
		this.periodoIdeal = periodoIdeal;
	}
}
