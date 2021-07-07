package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {

	

	
	private String talle;
	private String color;

	
	public Remera(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle = talle;
		this.color = color;
	}
	

	

	@Override
	public String getTalle() {
		return this.talle;
	}

	

	

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	

	
}
