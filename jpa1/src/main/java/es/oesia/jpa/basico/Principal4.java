package es.oesia.jpa.basico;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;

public class Principal4 {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("oesia");
		EntityManager em= emf.createEntityManager();
		//tienen que estar gestionadas por jpa
		//tienen que ser clases anotadas por JPA
		// que quieres enfocar por un interface
		//usar alguna clase abstracta hasta que punto lo permitiria
		//porque es un find de un elemento
		
		// unas anotaciones una @discriminator y otra es la de mappedsupperclass
		
		//la entidad no existe porque puedo suponer que 
		//entidad puede estar en la base de datos
		
		//detached 
		Libro libro= new Libro("2","net","pedro", new Date(),20);
		em.merge(libro);
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.println(libro.getFecha());

	}

}
