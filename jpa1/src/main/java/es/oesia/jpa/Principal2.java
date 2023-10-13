package es.oesia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal2 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		Libro libro=em.find(Libro.class, "1");
		System.out.println(libro.getIsbn());
		System.out.println(libro.getAutor());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getFecha());

	}

}
