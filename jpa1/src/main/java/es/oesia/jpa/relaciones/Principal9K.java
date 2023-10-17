package es.oesia.jpa.relaciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;
import es.oesia.jpa.repositorios.jpa.GenericJPA;
import es.oesia.jpa.repositorios.jpa.LibroRepositorioJPA;

public class Principal9K {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

	
		GenericJPA<Libro,String> repo=  new LibroRepositorioJPA(em);
		
		repo.buscarTodos().forEach(System.out::println);
		
		System.out.println("**********************");
		
		Libro l=repo.buscarUno("1AB");
		System.out.println(l);
		
	}

}
