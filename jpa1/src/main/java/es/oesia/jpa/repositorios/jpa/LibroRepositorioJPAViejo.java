//package es.oesia.jpa.repositorios.jpa;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
//
//import es.oesia.jpa.Libro;
//
//public class LibroRepositorioJPAViejo implements LibroRepositorio {
//
//	private EntityManager em;
//	
//	private final String sqlBuscarTodos="select l from Libro l";
//	private final String sqlBuscarTodosPorAutor="select l from Libro l where l.autor=:autor";
//	
//	
//	
//	
//	public LibroRepositorioJPAViejo(EntityManager em) {
//		this.em = em;
//	}
//	public Optional<Libro> buscarUno(String isbn) {
//		
//		return Optional.ofNullable(em.find(Libro.class, isbn));	
//	}
//
//	public List<Libro> buscarTodos() {
//		
//		return em.createQuery(sqlBuscarTodos,Libro.class).getResultList();
//			
//	}
//	
//	public List<Libro> buscarPorAutor(String autor) {
//		
//		TypedQuery<Libro> query=em.createQuery(sqlBuscarTodosPorAutor,Libro.class);
//		query.setParameter("autor", autor);
//		return query.getResultList();
//			
//	}
//	@Override
//	public void insertar(Libro libro) {
//		em.persist(libro);
//	}
//	@Override
//	public void borrar(Libro libro) {
//		em.remove(libro);
//		
//	}
//	@Override
//	public void salvar(Libro libro) {
//		em.merge(libro);
//		
//	}
//	
//	
//	
//}
