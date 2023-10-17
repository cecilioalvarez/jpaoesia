//package es.oesia.jpa.relaciones;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import es.oesia.jpa.Libro;
//import es.oesia.jpa.repositorios.jpa.LibroRepositorio;
//import es.oesia.jpa.repositorios.jpa.LibroRepositorioJPAViejo;
//
//public class Principal9e {
//
//	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
//		EntityManager em = emf.createEntityManager();
//		
//		LibroRepositorio repo= new LibroRepositorioJPAViejo(em);
//		List<Libro> libros=repo.buscarPorAutor("cecilio");
//		
//		libros.stream().forEach(System.out::println);
//		
//		
//
//	}
//// metodo que recibe un libro y no de devuelve nada
//	//un consumidor
//	public static void imprimir(Libro l) {
//		
//		System.out.println(l.getTitulo());
//		System.out.println(l.getAutor());
//	}
//}
