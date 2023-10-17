package es.oesia.jpa.repositorios.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import es.oesia.jpa.Socio;

public class SocioRepositorioJPA extends GenericRepositoryJPA<Socio, String> implements SocioRepositorio{

	@Override
	public List<Socio> buscarTodos() {
		// TODO Auto-generated method stub
		 return em.createQuery("select distinct (s) from Socio s join fetch s.tarjeta ", Socio.class).getResultList();
	}

	public SocioRepositorioJPA(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
