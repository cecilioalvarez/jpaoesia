package es.oesia.jpa.relaciones.main1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Ejemplar;
import es.oesia.jpa.Libro;

public class Principal7 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		
		Libro l = em.find(Libro.class, "1AB");

		em.getTransaction().begin();
		em.remove(l);
		em.getTransaction().commit();

	}

}
