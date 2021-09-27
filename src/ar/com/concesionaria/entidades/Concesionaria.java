package ar.com.concesionaria.entidades;

import java.util.List;

public class Concesionaria {
	
	String Nombre;
	List<Vehiculo> listaVehiculos;
	MuestraDatos muestraDatos;
	
	public Concesionaria() {
		this.muestraDatos=new MuestraDatosImpl();
	}
	
	public Concesionaria(String nombre, List<Vehiculo> listaVehiculos) {
		super();
		Nombre = nombre;
		this.listaVehiculos = listaVehiculos;
		this.muestraDatos=new MuestraDatosImpl();
	}




	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public MuestraDatos getMuestraDatos() {
		return muestraDatos;
	}

	public void setMuestraDatos(MuestraDatos muestraDatos) {
		this.muestraDatos = muestraDatos;
	}

	public List<Vehiculo> MostrarDatosOrdenadoPorPrecio() {
		return this.muestraDatos.MostrarDatosOrdenadoPorPrecio(this.listaVehiculos);
	}

	public Vehiculo MostrarMasCaro() {
		return this.muestraDatos.MostrarMasCaro(this.listaVehiculos);
	}

	public Vehiculo MostrarMasBarato() {
		return this.muestraDatos.MostrarMasBarato(this.listaVehiculos);
	}

	public List<Vehiculo> ContieneLetraporMarca(String s) {
		return this.muestraDatos.ContieneLetraporMarca(s,this.listaVehiculos);
	}
	
	
	
	
}
