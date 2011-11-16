package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import main.br.usp.esi.enums.HorarioType;

@Entity
@Table(name="preferencias")
public class Preferencias {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="preferencias_id", nullable=false)
	private int id;
	@Column(name="nome_preferencias", nullable=false, length=255)
	private HorarioType nome;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HorarioType getNome() {
		return nome;
	}
	public void setNome(HorarioType nome) {
		this.nome = nome;
	}
}
