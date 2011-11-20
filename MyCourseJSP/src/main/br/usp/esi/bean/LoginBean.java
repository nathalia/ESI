package main.br.usp.esi.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;

@ManagedBean
@ApplicationScoped
public class LoginBean {
	private String email;
	private String password;
	private String msg = "";

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		UsuarioService usuarioService = new UsuarioServiceImpl();
		boolean autenticar = usuarioService.autenticarUsuario(this.getEmail(), this.getPassword());
		if (autenticar) {
		return "logado";
		} else {
			setMsg("Login recusado");
			return "";
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
