package ar.com.concesionaria.entidades;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	Integer id;
	String Nombre;
	List<Modelo> modelo;
	
	
	
	public Marca( String nombre) {
		super();
		Nombre = nombre;
		this.modelo=new ArrayList<Modelo>();
		init();
	}
	public Marca( String nombre, List<Modelo> modelo) {
		super();
		Nombre = nombre;
		this.modelo = modelo;
		this.modelo=new ArrayList<Modelo>();
		init();
	}
	
	
	public List<Modelo> getModelo() {
		return modelo;
	}
	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Modelo removeModelo(Modelo modelo) {
		
		if(this.modelo.remove(modelo)) {
			return modelo;
			}
		else {
			return null;
		}
	}
	public boolean addModelo(Modelo modelo) {
		if(modelo.getIdMarca().equals(this.id)) {
			this.modelo.add(modelo);
			return true;
		}
		return false;
	}
	
	private void init() {
		this.id=ModeloID;
		ModeloID++;
	}
	private static int ModeloID = 1;	

}
