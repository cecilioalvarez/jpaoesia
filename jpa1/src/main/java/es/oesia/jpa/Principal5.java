package es.oesia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal5 {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		Libro libro=em.find(Libro.class, "1");
		em.getTransaction().begin();
		em.remove(libro);
		em.getTransaction().commit();
	}

}
