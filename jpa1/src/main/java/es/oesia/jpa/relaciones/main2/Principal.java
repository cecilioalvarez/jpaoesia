package es.oesia.jpa.relaciones.main2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.oesia.jpa.Libro;
import es.oesia.jpa.Socio;
import es.oesia.jpa.repositorios.jpa.GenericJPA;
import es.oesia.jpa.repositorios.jpa.LibroRepositorioJPA;
import es.oesia.jpa.repositorios.jpa.SocioRepositorioJPA;

public class Principal {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
		EntityManager em = emf.createEntityManager();

	
		GenericJPA<Socio,String> repo=  new SocioRepositorioJPA(em);
	
		List<Socio> lista=repo.buscarTodos();
		lista.forEach(System.out::println);

	}

}
