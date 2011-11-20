package main.br.usp.esi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="disciplina_id", nullable=false)
	private int id;
	private String nome;
	private int codigo;
	private int creditosAula;
	private int creditosTrabalho;
	private int cargaHoraria;
	private String descricao;
	private int periodoIdeal;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="curso_id", nullable=false)})  
	private Curso curso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="nome_disciplina", nullable=false, length=255)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="cod_disciplina", nullable=false, length=255)
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Column(name="creditos_aula", nullable=false)
	public int getCreditosAula() {
		return creditosAula;
	}
	public void setCreditosAula(int creditosAula) {
		this.creditosAula = creditosAula;
	}
	@Column(name="creditos_trabalho", nullable=false)
	public int getCreditosTrabalho() {
		return creditosTrabalho;
	}
	public void setCreditosTrabalho(int creditosTrabalho) {
		this.creditosTrabalho = creditosTrabalho;
	}
	@Column(name="carga_horaria", nullable=false)
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Column(name="descricao", nullable=false, length=1000)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Column(name="periodo_ideal", nullable=false)
	public int getPeriodoIdeal() {
		return periodoIdeal;
	}
	public void setPeriodoIdeal(int periodoIdeal) {
		this.periodoIdeal = periodoIdeal;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
