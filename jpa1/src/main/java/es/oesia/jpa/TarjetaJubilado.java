package es.oesia.jpa;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value="jubilado")
public class TarjetaJubilado extends Tarjeta {

	public TarjetaJubilado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TarjetaJubilado(int numero, Date fecha) {
		super(numero, fecha);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double importeConDescuento(double importe) {
		// TODO Auto-generated method stub
		return importe *0.98;
	}

	public boolean jubiladoSenior() {
		
		return true;
	}
}
