package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {


	private String fechaElaboracion;
	private String fechaVencimiento;
	
	
	public Galletitas(Integer codigo, String descripcion, String fechaElaboracion, String fechaVencimiento, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	@Override
	public String getFechaDeElaboracion() {
		return this.fechaElaboracion;
	}
	
	@Override
	public String getFechaDeVencimiento() {
		return this.fechaVencimiento;
	}

	

	

	
	
	
}
