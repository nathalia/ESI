package main.br.usp.esi.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import main.br.usp.esi.service.UsuarioService;
import main.br.usp.esi.service.impl.UsuarioServiceImpl;

@ManagedBean
@ApplicationScoped
public class LoginBean {
	private String email;
	private String password;

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
		FacesMessage msg = null;
		
		boolean autenticar = usuarioService.autenticarUsuario(this.getEmail(), this.getPassword());
		if (autenticar) {
//			HttpSession session = (HttpSession) FacesContext
//					.getCurrentInstance().getExternalContext()
//					.getSession(true);
//			session.setAttribute("authenticated", true);
//			session.setAttribute("user", user);
//			return "index2?faces-redirect=true"; // Pagina Principal
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", email);
			return "yes";
		} else {
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Invalid credentials");  
			return "no";
		}
	}

}
