package br.com.esi.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.usp.esi.entities.HorarioAula;

public class TestaInsereUsuario {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.
			createEntityManagerFactory("esi");
		EntityManager entityManager = factory.createEntityManager();
		
		HorarioAula ha = new HorarioAula();
		ha.setHoraInicio(1);
		ha.setHoraFim(2);
		
		entityManager.getTransaction().begin();
		entityManager.persist(ha);
		entityManager.getTransaction().commit();
		
		System.out.println("Conta gravada com sucesso!");
	}
}