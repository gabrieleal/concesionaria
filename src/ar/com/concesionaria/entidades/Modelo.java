package ar.com.concesionaria.entidades;


public class Modelo {
	private Integer id;
	private Integer idMarca;
	private String nombre;
	private String version;
	

	public Modelo() {}
	
	public Modelo(String nombre,Marca m) {
		super();
		this.nombre = nombre;
		this.idMarca=m.getId();
		init();
	}
	public Modelo(String nombre, String version) {
		super();
		this.nombre = nombre;
		this.version = version;
		init();
	}
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	
	private void init() {
		this.id=MarcaID;
		MarcaID++;
	}
	
	private static int MarcaID = 1;	
}
