package es.oesia.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class Libro {

	@Id
	private String isbn;
	private String titulo;
	private String autor;
	private Date fecha;
	private double precio; 
	@ManyToOne
	@JoinColumn(name="categorias_id")
	private Categoria categoria;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Libro(String isbn, String titulo, String autor, Date fecha, double precio) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.precio = precio;
	}
	public Libro() {
		super();
	}
	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}
	
	
	
	
	
}
