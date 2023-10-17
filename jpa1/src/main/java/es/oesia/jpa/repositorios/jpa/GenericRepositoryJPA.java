package es.oesia.jpa.repositorios.jpa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GenericRepositoryJPA<T, K> implements GenericJPA<T, K> {

	protected EntityManager em;
	private Class<T> tipo;

	public GenericRepositoryJPA(EntityManager em) {
		super();
		this.em = em;
		Type type = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) type;
		tipo = (Class) pt.getActualTypeArguments()[0];

	}
	
	@Override
	public T insertar(final T miTipo) {
		
		 em.persist(miTipo);
		 return miTipo;
	}
	
	@Override
	public void borrar(final T miTipo) {
		
		 em.remove(em.merge(miTipo));
		
	}
	
	@Override
	public void salvar(final T miTipo) {
		
		em.merge(miTipo);
		
	}
	
	@Override
	public List<T> buscarTodos() {
		
		CriteriaBuilder cb= em.getCriteriaBuilder();
		CriteriaQuery<T> cq= cb.createQuery(tipo);
		Root<T> root= cq.from(tipo);
		cq.select(root);
		TypedQuery<T> query= em.createQuery(cq);
		return query.getResultList();
	}

}
