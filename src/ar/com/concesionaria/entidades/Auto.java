package ar.com.concesionaria.entidades;

public class Auto extends Vehiculo {
	
	private Integer Cantidad_puertas;
	
	public Auto() {}
	
	public Auto(Marca Marca, Modelo Modelo, Integer Puertas, Double Costo) {
		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setCosto(Costo);
		this.setCantidad_puertas(Puertas);
		init();
	}
	
	public Integer getCantidad_puertas() {
		
		return Cantidad_puertas;
	}
	public void setCantidad_puertas(Integer cantidad_puertas) {
		Cantidad_puertas = cantidad_puertas;
	}

	@Override
	public void Imprimir() {
		String str = String.format("Marca: %s // Modelo: %s // Puertas: %d   // Precio: $ %g", this.Marca.getNombre(),this.Modelo.getNombre(),this.Cantidad_puertas,this.getCosto());
		System.out.println(str);
	}
}
