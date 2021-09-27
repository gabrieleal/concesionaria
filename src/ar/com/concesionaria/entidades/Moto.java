package ar.com.concesionaria.entidades;

public class Moto extends Vehiculo {
	Integer Cilindrada;

	public Moto() {
	}

	public Moto(Marca Marca, Modelo Modelo, Integer Cilindrada, Double Costo) {
		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setCosto(Costo);
		this.setCilindrada(Cilindrada);
		this.init();
	}

	public Integer getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(Integer cilindrada) {
		Cilindrada = cilindrada;
	}

	@Override
	public void Imprimir() {
		String str = String.format("Marca: %s // Modelo: %s // Puertas: %d c // Precio: $ %g", this.Marca.getNombre(),this.Modelo.getNombre(), this.Cilindrada, this.getCosto());
		System.out.println(str);
	}
	
}
