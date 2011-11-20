package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;


@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="usuario_id")
	private Integer id;
	private String nome;
	private int numeroUSP;
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="curso_id", nullable=false)})*/
	//private Curso curso;
	private String user;
	private String senha;
	//private String tipoUsuario;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroUSP() {
		return numeroUSP;
	}
	public void setNumeroUSP(int numeroUSP) {
		this.numeroUSP = numeroUSP;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String login(){
		System.out.println(this.user);
		System.out.println(this.senha);
		System.out.println("Viemos pra ca");
		UsuarioService userService = new UsuarioServiceImpl();
		if(userService.autenticarUsuario(this.user, this.senha))
			return "logado";
		else
			return "recusado";
	}
}
