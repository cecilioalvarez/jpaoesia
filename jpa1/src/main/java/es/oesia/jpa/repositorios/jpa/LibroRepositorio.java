package es.oesia.jpa.repositorios.jpa;

import java.util.List;
import java.util.Optional;

import es.oesia.jpa.Libro;

public interface LibroRepositorio {

	Optional<Libro> buscarUno(String isbn);
	public List<Libro> buscarTodos();
	public List<Libro> buscarPorAutor(String autor);
	public void insertar(Libro libro);
	public void borrar (Libro libro);
	public void salvar(Libro libro);
	
}