package ar.com.concesionaria.entidades;

import java.util.List;

public interface MuestraDatos {
	
	List<Vehiculo> MostrarDatosOrdenadoPorPrecio(List<Vehiculo> lista);
	Vehiculo MostrarMasCaro(List<Vehiculo> lista);
	Vehiculo MostrarMasBarato(List<Vehiculo> lista);
	List<Vehiculo> ContieneLetraporMarca(String s, List<Vehiculo> lista);
 	
}
