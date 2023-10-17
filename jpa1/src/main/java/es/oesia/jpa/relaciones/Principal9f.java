package es.oesia.jpa.relaciones;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;
import es.oesia.jpa.repositorios.jpa.LibroRepositorio;
import es.oesia.jpa.repositorios.jpa.LibroRepositorioJPA;

public class Principal9f {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

		LibroRepositorio repo = new LibroRepositorioJPA(em);
		em.getTransaction().begin();
		
		repo.insertar(new Libro("2BC","python","pepito",new Date(),20));
		em.getTransaction().commit();
		

	}

}
