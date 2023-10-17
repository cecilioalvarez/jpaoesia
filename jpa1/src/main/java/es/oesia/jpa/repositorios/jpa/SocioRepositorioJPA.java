package es.oesia.jpa.repositorios.jpa;

import javax.persistence.EntityManager;

import es.oesia.jpa.Socio;

public class SocioRepositorioJPA extends GenericRepositoryJPA<Socio, String> implements SocioRepositorio{

	public SocioRepositorioJPA(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
