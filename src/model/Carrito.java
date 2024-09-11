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
public Carrito(int idCarrito, LocalDate fecha, LocalTime hora) {
	super();
	this.idCarrito = idCarrito;
	this.fecha = fecha;
	this.hora = hora;
	this.lstItem = new ArrayList <ItemCarrito>();
}
public boolean agregarItem(Producto producto, int cantidad) {
    boolean flag = false;

    // Recorremos la lista de items para ver si el producto ya está en el carrito
    for (int i = 0; i < lstItem.size(); i++) {
        if (lstItem.get(i).getProducto().equals(producto)) {
            // Si ya existe, actualizamos la cantidad
            lstItem.get(i).setCantidad(lstItem.get(i).getCantidad() + cantidad);
            flag = true;
            break;
        }
    }

    // Si no se encontró el producto, agregamos un nuevo item al carrito
    if (!flag) {
        lstItem.add(new ItemCarrito(1, producto, cantidad));  // Puedes modificar el ID según sea necesario
        flag = true;
    }

    return flag;
}

public ItemCarrito traerItemCarrito(Producto i2) {
    ItemCarrito p = null;

    // Recorremos la lista buscando el producto
    for (int i = 0; i < lstItem.size(); i++) {
        if (lstItem.get(i).getProducto().equals(i2)) {
            p = lstItem.get(i);
            break;
        }
    }

    return p;  // Retornamos el item encontrado o null si no existe
}

public boolean eliminarItem(Producto i2, int cantidad) throws Exception {
    boolean flag = false;
    ItemCarrito it = traerItemCarrito(i2);

    if (it == null) {
        throw new Exception("El producto no existe en el carrito");
    }

    // Si la cantidad es mayor a la cantidad que se desea eliminar, reducimos la cantidad
    if (it.getCantidad() > cantidad) {
        it.setCantidad(it.getCantidad() - cantidad);
        System.out.println(it.getCantidad());
        flag = true;
    }
    // Si la cantidad es igual a la cantidad actual, eliminamos el item del carrito
    else if (it.getCantidad() == cantidad) {
        lstItem.remove(it);
        flag = true;
    }

    return flag;
}
}