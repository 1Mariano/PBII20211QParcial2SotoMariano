package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	

	
	private Boolean isNoFrost;
	private Integer garantia;
	

	
	public Heladera(Integer codigo, String descripcion, Boolean isNoFrost, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.isNoFrost = isNoFrost;
		this.garantia = garantia;
	}


	@Override
	public Integer getGarantia() {
		return this.garantia;
	}

	public Boolean isNoFrost() {
		return this.isNoFrost;
	}


	
	
	

}
