package ar.com.concesionaria;

import java.util.ArrayList;
import java.util.List;

import ar.com.concesionaria.entidades.Auto;
import ar.com.concesionaria.entidades.Concesionaria;
import ar.com.concesionaria.entidades.Marca;
import ar.com.concesionaria.entidades.Modelo;
import ar.com.concesionaria.entidades.Moto;
import ar.com.concesionaria.entidades.Vehiculo;

public class Execute {

	public static void main(String[] args) {
		
		Concesionaria con = crearEntidades();
		
		for (Vehiculo ve : con.getListaVehiculos()) {
			ve.Imprimir();
		}
		System.out.println("========================================================================== ");
		System.out.println(String.format("Vehiculo mas caro : %s %s ",con.MostrarMasCaro().getMarca().getNombre(),con.MostrarMasCaro().getModelo().getNombre()));
		System.out.println(String.format("Vehiculo mas barato : %s %s ",con.MostrarMasBarato().getMarca().getNombre(),con.MostrarMasBarato().getModelo().getNombre()));
		for (Vehiculo v : con.ContieneLetraporMarca("Y")) {
			System.out.println(String.format("Vehículo que contiene en el modelo la letra ‘Y’: %s %s  $%g",v.getMarca().getNombre(),v.getModelo().getNombre(),v.getCosto()));
			
		}
		
		System.out.println("==========================================================================");
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
		for (Vehiculo v : con.MostrarDatosOrdenadoPorPrecio()) {
			System.out.println(String.format("%s %s ",v.getMarca().getNombre(),v.getModelo().getNombre()));
			
		}
	}
	
	
	public static Concesionaria crearEntidades() {
		Concesionaria con = new Concesionaria();
		
		Marca yamaha = new Marca("Yamaha");
		Marca peugeot = new Marca("Peugeot");
		Marca honda = new Marca("Honda");
		
		Modelo peugeot1 = new Modelo("206",peugeot);
		Modelo titan = new Modelo("Titan",honda);
		Modelo peugeot2 = new Modelo("208",peugeot);
		Modelo ybr = new Modelo("ybr",yamaha);
		
		
		//relacionamos marca y modelo
		peugeot.addModelo(peugeot2);
		peugeot.addModelo(peugeot1);
		honda.addModelo(titan);
		yamaha.addModelo(ybr);
		
		
		List<Vehiculo> list = new ArrayList<Vehiculo>();
		
		list.add(new Auto(peugeot,peugeot1,4,200000.00));
		list.add(new Moto(honda,titan,125,60000.00));
		list.add(new Auto(peugeot,peugeot2,5,250000.00));
		list.add(new Moto(yamaha,ybr,160,80500.50));
		
		
		con.setListaVehiculos(list);
		
		return con;
	}

}
