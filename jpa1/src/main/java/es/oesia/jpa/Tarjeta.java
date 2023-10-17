package es.oesia.jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tarjeta {
	@Id
	private int numero;
	private Date fecha;
	@OneToOne
	@JoinColumn(name="dni")
	private Socio socio;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Tarjeta(int numero, Date fecha) {
		super();
		this.numero = numero;
		this.fecha = fecha;
	}
	public Tarjeta() {
		super();
	}
	
}
