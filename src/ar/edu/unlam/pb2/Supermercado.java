package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosDisponibles = new ArrayList<>();
		this.productosExistentes = new HashSet<>();
		this.ventasRealizadas = new HashMap<Integer, Venta>();
		this.contadorDeVentas = 0;
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto		
		this.productosExistentes.add(nuevo);
		this.productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer contador = 0;

		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigo))
			{
				contador++;
			}
		}
		return contador;
	}
	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		for (Producto producto : productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return true;
			}
		}
		throw new ProductoInexistente();
		
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		for (Producto producto : productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return producto;
			}
		}
		return null;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio

	}

	public Set<Producto> queSeObtengaProductosComestibles() {
		
		for (Producto producto : productosExistentes) {
			if(this.getOfertaDeProductos() instanceof Comestible)
			{
				return (Set<Producto>) producto;
			}
		}
		return null;
	}
	
	
	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		
		
		if(productoExiste(codigoDeProducto))
			throw new ProductoInexistente();
		
		if(getStock(codigoDeProducto)==0)
			throw new ProductoSinStock();
		
		this.ventasRealizadas.put(numeroDeVenta, getVenta(numeroDeVenta));
	}
	

}
