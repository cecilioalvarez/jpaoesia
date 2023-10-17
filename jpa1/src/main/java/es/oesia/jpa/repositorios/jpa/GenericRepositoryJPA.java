package es.oesia.jpa.repositorios.jpa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;

public class GenericRepositoryJPA<T, K> {

	protected EntityManager em;
	private Class<T> tipo;

	public GenericRepositoryJPA(EntityManager em) {
		super();
		this.em = em;
		Type type = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) type;
		tipo = (Class) pt.getActualTypeArguments()[0];

	}
	
	public T insertar(final T miTipo) {
		
		 em.persist(miTipo);
		 return miTipo;
	}
	
	public void borrar(final T miTipo) {
		
		 em.remove(em.merge(miTipo));
		
	}
	
	public void salvar(final T miTipo) {
		
		em.merge(miTipo);
		
	}

}
