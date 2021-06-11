package elecciones.dto;

public class Estamento {
	int id;
	int eleccion;
	String descripcion;
	public Estamento(int id, int eleccion, String descripcion) {
		this.id = id;
		this.eleccion = eleccion;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEleccion() {
		return eleccion;
	}
	public void setEleccion(int eleccion) {
		this.eleccion = eleccion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	

}
