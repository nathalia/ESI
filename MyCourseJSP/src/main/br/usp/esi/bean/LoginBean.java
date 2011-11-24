package main.br.usp.esi.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import main.br.usp.esi.entities.Usuario;
import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;

@ManagedBean
@ApplicationScoped
public class LoginBean {
	private String username;
	private String password;
	private String msg = "";
	private String menu = "menu.xhtml";
	private String botao = "Login";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		UsuarioService usuarioService = new UsuarioServiceImpl();
		boolean autenticar = usuarioService.autenticarUsuario(this.getUsername(),
				this.getPassword());
		if (autenticar) {
			Usuario usuario = usuarioService.getUsuarioByUsername(this.getUsername());
			HttpSession session = (HttpSession) FacesContext
					.getCurrentInstance().getExternalContext().getSession(true);
			session.setAttribute("authenticated", true);
			session.setAttribute("user", usuario);
			menu = "menuLogado.xhtml";
			setMsg("Bem-vindo "+ username);
			botao = "Logout";
			return "index";
		} else {
			setMsg("Login recusado");
			return "";
		}
	}
	
	public String getBotao() {
		return botao;
	}

	public void setBotao(String botao) {
		this.botao = botao;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
