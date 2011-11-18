package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name="preferencia1", nullable=false)
	private int preferencia1;
	@Column(name="preferencia2", nullable=false)
	private int preferencia2;
	@Column(name="preferencia3", nullable=false)
	private int preferencia3;
	@Column(name="preferencia4", nullable=false)
	private int preferencia4;
	private int preferenciasNaoAtendidas = 4;
	public Professor(){
		
	}
	public Professor(String nome, int preferencia1, int preferencia2,
			int preferencia3, int preferencia4) {
		super();
		this.nome = nome;
		this.preferencia1 = preferencia1;
		this.preferencia2 = preferencia2;
		this.preferencia3 = preferencia3;
		this.preferencia4 = preferencia4;
		
	}
	public int getPreferencia1() {
		return preferencia1;
	}
	public void setPreferencia1(int preferencia1) {
		this.preferencia1 = preferencia1;
	}
	public int getPreferencia2() {
		return preferencia2;
	}
	public void setPreferencia2(int preferencia2) {
		this.preferencia2 = preferencia2;
	}
	public int getPreferencia3() {
		return preferencia3;
	}
	public void setPreferencia3(int preferencia3) {
		this.preferencia3 = preferencia3;
	}
	public int getPreferencia4() {
		return preferencia4;
	}
	public void setPreferencia4(int preferencia4) {
		this.preferencia4 = preferencia4;
	}
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
	public int getPreferenciasNaoAtendidas() {
		return preferenciasNaoAtendidas;
	}
	public void atendido() {
		this.preferenciasNaoAtendidas--;
	}
}
