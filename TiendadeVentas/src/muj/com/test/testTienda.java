package muj.com.test;

import muj.com.ventas.Orden;
import muj.com.ventas.Producto;

public class testTienda {

	public static void main(String[] args) {
		Orden orden = new Orden();
		Orden orden1 = new Orden();
		Producto producto = new Producto("Papas fritas", 0.25);
		Producto producto2 = new Producto("Coca Cola", 1.25);
		Producto producto3 = new Producto("Lonchis", 2.55);
		Producto producto4 = new Producto("Palomitas", 1.50);
		orden.agregarProducto(producto);
		orden.agregarProducto(producto2);
		orden.agregarProducto(producto3);
		orden.agregarProducto(producto4);
		orden.mostrarOrden();
		orden1.agregarProducto(producto);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(producto3);
		orden1.agregarProducto(producto4);
		orden1.mostrarOrden();

	}

}
