package es.oesia.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class JPATest {

	static EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeAll 
	public static void initAll() {
		 emf= Persistence.createEntityManagerFactory("oesia");
		
	}
	
	@BeforeEach
	public void init() {
		em= emf.createEntityManager();
		Persistence.generateSchema("oesia", null);
	}
//	@Test
//	void test() {
//		
//		LibroRepositorio repo= new LibroRepositorioJPA(em);
//		Libro libro=repo.buscarUno("1AB");
//		assertEquals("1AB",libro.getIsbn());
//	}

}
