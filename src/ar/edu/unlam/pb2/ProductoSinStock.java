package ar.edu.unlam.pb2;

public class ProductoSinStock extends Exception {
	public ProductoSinStock()
	{
		super("Producto Sin Stock");
	}
}
