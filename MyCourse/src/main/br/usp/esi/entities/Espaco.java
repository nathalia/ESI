package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="espaco")
public class Espaco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="espaco_id", nullable=false)
	private int id;
	private int codigo;
	private String nome;
	private int lotacaoMax;
	private String tipoEspaco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="cod_espaco", nullable=false)
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Column(name="nome_espaco", nullable=false, length=255)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="max_lotacao", nullable=false)
	public int getLotacaoMax() {
		return lotacaoMax;
	}
	public void setLotacaoMax(int lotacaoMax) {
		this.lotacaoMax = lotacaoMax;
	}
	@Column(name="tipo_espaco", nullable=false, length=255)
	public String getTipoEspaco() {
		return tipoEspaco;
	}
	public void setTipoEspaco(String tipoEspaco) {
		this.tipoEspaco = tipoEspaco;
	}
}
