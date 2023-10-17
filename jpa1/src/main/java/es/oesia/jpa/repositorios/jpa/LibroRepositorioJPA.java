package es.oesia.jpa.repositorios.jpa;

import javax.persistence.EntityManager;

import es.oesia.jpa.Libro;

public class LibroRepositorioJPA extends GenericRepositoryJPA<Libro, String> implements LibroRepositorio{

	public LibroRepositorioJPA(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
