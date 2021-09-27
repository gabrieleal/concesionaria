package ar.com.concesionaria.entidades;

import java.util.ArrayList;
import java.util.List;

public class MuestraDatosImpl implements MuestraDatos {

	@Override
	public List<Vehiculo> MostrarDatosOrdenadoPorPrecio(List<Vehiculo> lista) {
		Integer length = lista.size();
		
		for (int i = 0; i < length-1; i++) {
			
			for (int j = 0; j < length-i-1; j++) {
				Double costo1 = lista.get(j).getCosto();
				Double costo2 = lista.get(j+1).getCosto();
				if (lista.get(j).getCosto()>lista.get(j+1).getCosto()) {
					swap(j, j+1,lista);
				}
			}
		}
		
		return lista;
	}
	
	
	private void swap (int indexA, int indexB, List<Vehiculo> list) {
			Vehiculo tmp =  list.get(indexA);
			list.set(indexA, list.get(indexB));
			list.set(indexB, tmp);
			
	}


	@Override
	public Vehiculo MostrarMasCaro(List<Vehiculo> lista) {
		Vehiculo aux=null;
		int i = 0;
		for (Vehiculo vehiculo : lista) {
			if(i==0) {
				aux=vehiculo;
				i++;
			}
			else {
				if(aux.getCosto()<vehiculo.getCosto()) {
					aux=vehiculo;
				}
			}
		}
		return aux;
	}


	@Override
	public Vehiculo MostrarMasBarato(List<Vehiculo> lista) {
		Vehiculo aux=null;
		int i = 0;
		for (Vehiculo vehiculo : lista) {
			if(i==0) {
				aux=vehiculo;
			}
			else {
				if(aux.getCosto()>vehiculo.getCosto()) {
					aux=vehiculo;
				}
			}
		}
		return aux;
	}


	@Override
	public List<Vehiculo> ContieneLetraporMarca(String s, List<Vehiculo> lista) {
		List<Vehiculo> resp = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo : lista) {
			
			String marca = vehiculo.getMarca().getNombre();
			if (marca.contains(s)) {
				resp.add(vehiculo);
			}
		}
		
		return resp;
	}


	
	
}
