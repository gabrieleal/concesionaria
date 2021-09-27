package ar.com.concesionaria.entidades;



public abstract class Vehiculo {
	Integer id;
	Double costo;
	Marca Marca;
	Modelo Modelo;
	
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Marca getMarca() {
		return Marca;
	}
	public void setMarca(Marca marca) {
		Marca = marca;
	}
	public Modelo getModelo() {
		return Modelo;
	}
	public void setModelo(Modelo modelo) {
		Modelo = modelo;
	}
	protected void init() {
		this.id=ID;
		ID++;
	}
	public abstract void Imprimir(); 
	public static int ID = 1;
}
