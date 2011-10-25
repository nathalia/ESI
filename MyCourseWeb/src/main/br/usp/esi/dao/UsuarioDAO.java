package main.br.usp.esi.dao;

import org.hibernate.Criteria;



public class UsuarioDAO extends EntityDAO{
	public boolean autenmticarUsuario(String usuario, String senha){
		if (usuario.isEmpty()|| senha.isEmpty()){
			return false;
		}
		//terminar
		return false;
	}
	
	public boolean hasUser(String Usuario){
		//terminar
		return false;
	}
}
