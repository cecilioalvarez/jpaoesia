//package es.oesia.jpa.relaciones;
//
//import java.util.Optional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import es.oesia.jpa.Libro;
//import es.oesia.jpa.repositorios.jpa.LibroRepositorio;
//import es.oesia.jpa.repositorios.jpa.LibroRepositorioJPAViejo;
//
//public class Principal9d {
//
//	public static void main(String[] args) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oesia");
//		EntityManager em = emf.createEntityManager();
//		
//		LibroRepositorio repo= new LibroRepositorioJPAViejo(em);
//		Optional<Libro> oLibro=repo.buscarUno("1AB");
//		//optionals con programacion funcional un consumidor
//		
//		oLibro.ifPresent(System.out::println);
//		
//		/*
//		if (oLibro.isPresent()) {
//			
//			System.out.println(oLibro.get().getTitulo());
//		}else {
//			System.out.println("no hay");
//		}
//		*/
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
