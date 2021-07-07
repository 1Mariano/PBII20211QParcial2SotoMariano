package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	

	private String fechaElaboracion;
	private String fechaVencimiento;
	private Double peso;

	public Carne(Integer codigo, String descripcion, String fechaElaboracion, String fechaVencimiento, Double peso, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
		this.peso = peso;
	}
	

	@Override
	public String getFechaDeElaboracion() {
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return this.fechaVencimiento;
	}


	public Double getKilos() {
		return this.peso;
	}

	
	

	
}
