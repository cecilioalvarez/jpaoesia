package es.oesia.jpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
				
		Libro libro= new Libro("1","Java","Pedro", new Date());
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();
	}
}
