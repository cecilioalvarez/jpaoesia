package es.oesia.jpa.relaciones.main1;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Prestamo;

public class Principal9 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();
		
		Prestamo p1= new Prestamo(1, new Date());
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		

	}

}
