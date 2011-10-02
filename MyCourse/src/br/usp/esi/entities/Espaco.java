package br.usp.esi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="espaco")
public class Espaco {
	@Id
	@GeneratedValue
	private int id;
	private int codigo;
	private String nome;
	private int lotacaoMax;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getLotacaoMax() {
		return lotacaoMax;
	}
	public void setLotacaoMax(int lotacaoMax) {
		this.lotacaoMax = lotacaoMax;
	}
}
