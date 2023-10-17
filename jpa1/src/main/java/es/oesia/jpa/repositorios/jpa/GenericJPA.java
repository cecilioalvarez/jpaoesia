package es.oesia.jpa.repositorios.jpa;

import java.util.List;

public interface GenericJPA<T, K> {

	T buscarUno (K miclave);
	T insertar(T miTipo);

	void borrar(T miTipo);

	void salvar(T miTipo);

	List<T> buscarTodos();

}