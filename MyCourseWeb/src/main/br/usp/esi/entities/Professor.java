package main.br.usp.esi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="professor_id", nullable=false)
	private int id;
	@Column(name="nome_professor", nullable=false, length=255)
	private String nome;
	@OneToOne(fetch=FetchType.LAZY)
	private ProfessorHorarioSala professorHorarioSala;
	@JoinColumn(name="preferencias_id", nullable=false)
	@OneToMany(fetch=FetchType.LAZY)
	private List<Preferencias> preferencias;
	
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
	public ProfessorHorarioSala getProfessorHorarioSala() {
		return professorHorarioSala;
	}
	public void setProfessorHorarioSala(ProfessorHorarioSala professorHorarioSala) {
		this.professorHorarioSala = professorHorarioSala;
	}
	public List<Preferencias> getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(List<Preferencias> preferencias) {
		this.preferencias = preferencias;
	}
}
