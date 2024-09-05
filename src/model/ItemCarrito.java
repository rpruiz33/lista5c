package model;

public class ItemCarrito {
private int IdItem;
private Producto producto;
private int cantidad;

public int getIdItem() {
	return IdItem;
}
public void setIdItem(int idItem) {
	IdItem = idItem;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public ItemCarrito(int idItem, Producto producto, int cantidad) {
	super();
	IdItem = idItem;
	this.producto = producto;
	this.cantidad = cantidad;
}



}
