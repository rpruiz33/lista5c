package model;

public class Producto {
private int idProducto;
private String producto;
private float precio;
private static int contador=1;

public int getIdProducto() {
	return idProducto;
}
public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public float getPrecio() {
	return precio;
}
public void setPrecio(float precio) {
	this.precio = precio;
}

public Producto( String producto, float precio) {
	super();
	this.idProducto = contador++;
	this.producto = producto;
	this.precio = precio;
}







}
