package muj.com.ventas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	public Date FyH = new Date();
	private int contadorProductos;
	private final static int MAX_PRODUCTOS  = 10;
	
	
	public Orden(){
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	public void agregarProducto(Producto producto){
		if (this.contadorProductos < Orden.MAX_PRODUCTOS){
			this.productos[this.contadorProductos++] = producto;
		}else{
			System.out.println("Se supero el maximo de productos : " + Orden.MAX_PRODUCTOS);
		}
	}
	
	public double calcularTotal(){
		double total=0;
		for (int i = 0; i < this.contadorProductos; i++) {
			total += productos[i].getPrecio();
		}
		return total;
	}
	
	public void mostrarOrden(){
		this.imprimirEntrada();
		System.out.println("Id Orden : " + this.idOrden);
		System.out.println("Total Orden: " + this.calcularTotal());
		System.out.println("Productos de la Orden : ");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
		
	}
	public void imprimirEntrada(){
		System.out.println("\n");
		System.out.println("****************Tienda Demo***************");
		System.out.println("********Realizada por Magali Urgiles******");
		System.out.println("*************2021 - Naranjal Ecuador******");
		System.out.println("**************Telf: 0986775246************");
		System.out.println("___________________________________________");
		System.out.println("***********FACTURA SIMPLIFICADA***********");
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		System.out.println("           "+hourdateFormat.format(FyH)+"            ");
		
	}
	
}
