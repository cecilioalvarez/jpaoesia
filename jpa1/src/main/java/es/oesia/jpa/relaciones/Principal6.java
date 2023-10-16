package es.oesia.jpa.relaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;

public class Principal6 {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		//lazy feching
		Libro l = em.find(Libro.class, "1AB");
		
		System.out.println(l.getIsbn());
		System.out.println(l.getAutor());
		System.out.println(l.getCategoria().getNombre());
		
	}	
		

}
