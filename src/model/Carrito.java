package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
private int idCarrito;
private LocalDate fecha;
private LocalTime hora;
private List<ItemCarrito>lstItem;
public int getIdCarrito() {
	return idCarrito;
}
public void setIdCarrito(int idCarrito) {
	this.idCarrito = idCarrito;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public LocalTime getHora() {
	return hora;
}
public void setHora(LocalTime hora) {
	this.hora = hora;
}
public List<ItemCarrito> getLstItem() {
	return lstItem;
}
public void setLstItem(List<ItemCarrito> lstItem) {
	this.lstItem = lstItem;
}
public Carrito(int idCarrito, LocalDate fecha, LocalTime hora, List<ItemCarrito> lstItem) {
	super();
	this.idCarrito = idCarrito;
	this.fecha = fecha;
	this.hora = hora;
	this.lstItem = new ArrayList <ItemCarrito>();
}
public boolean agregarItem(Producto producto, int cantidad) {
	int i=0;
	int id=0;
	boolean flag=false;
	ItemCarrito it=null;
	while(i<lstItem.size()&& lstItem!=null ) {
		if(lstItem.get(i).getProducto().equals(producto)) {
			lstItem.get(i).setCantidad(cantidad);
			flag= true;
		}
		i++;
	}
	return flag;
}

public boolean eliminarItem(Producto producto, int cantidad)throws Exception  {
	int i=0;
	int id=0;
	boolean flag=false;
	
	while(i<lstItem.size()&& lstItem!=null ) {
		if(lstItem.get(i).getProducto().equals(producto) && lstItem.get(i).getCantidad()==cantidad) {
			lstItem.remove(lstItem.get(i));
			flag=true;
		}
		if(lstItem.get(i).getProducto().equals(producto) && lstItem.get(i).getCantidad()>cantidad) {
			lstItem.get(i).setCantidad(lstItem.get(i).getCantidad()-cantidad);
		}
		if(!lstItem.get(i).getProducto().equals(producto)) {
			throw new Exception("el producto no ya existe");	
		}
		i++;			
		}
		return flag;
	
}
}