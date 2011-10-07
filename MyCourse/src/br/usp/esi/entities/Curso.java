package br.usp.esi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="curso_id")
	private int id;
	private String nome;
	@OneToMany(fetch=FetchType.LAZY)
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	@OneToMany(fetch=FetchType.LAZY)
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private String descricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="nome_curso", nullable=false, length=255)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Column(name="descricao", nullable=false, length=1000)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
