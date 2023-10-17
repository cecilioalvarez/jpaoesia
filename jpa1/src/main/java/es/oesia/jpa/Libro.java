package es.oesia.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
@NamedQueries({
	
	@NamedQuery(name="Libro.buscarTodos",query="select l from Libro l"),
	@NamedQuery(name="Libro.buscarTodosPorAutor",query="select l from Libro l where l.autor=:autor")

})
public class Libro {

	@Id
	private String isbn;
	private String titulo;
	private String autor;
	private Date fecha;
	private double precio; 
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="categorias_id")
	private Categoria categoria;
	
	@OneToMany(mappedBy="libro", cascade = {CascadeType.MERGE, CascadeType.REMOVE})
	private List<Ejemplar> ejemplares= new ArrayList<Ejemplar>();
	
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
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
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", precio="
				+ precio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	public void addEjemplar(Ejemplar ejemplar) {
		//una relacion bidireccional a nivel de clases
		ejemplares.add(ejemplar);
		ejemplar.setLibro(this);
	}
	
	public void removeEjemplar(Ejemplar ejemplar) {
		
		ejemplares.remove(ejemplar);
	}
	
	
	
	
}
