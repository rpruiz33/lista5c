package model;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
private List<Producto> gondola;

public List<Producto> getGondola() {
	return gondola;
}

public void setGondola(List<Producto> gondola) {
	this.gondola = gondola;
}

public Supermercado() {
	super();
	gondola = new ArrayList<Producto>();
}


public boolean agregaarProducto(String producto, float precio) throws Exception {
	int i = 0;
	Producto p = null;
	while (i < gondola.size()&& p==null) {
		if (gondola.get(i).getProducto() == producto) {
			throw new Exception("el producto ya existe");
		} else {
			i++;
		}
	}
	p = new Producto(producto, precio);
	return gondola.add(p);

}

public Producto traerProducto(int idProducto) throws Exception {
	int cont =0;
	Producto p=null;
	while(cont<gondola.size()  ) {
		if(gondola.get(cont).getIdProducto()==idProducto) {
			throw new Exception("el producto ya existe");
		}
		else {
			cont++;	
		}
		}
	
	p=gondola.get(cont);
	return p;
}
public boolean modificarProducto(int idProducto, String producto,double precio) throws Exception {
	Producto p=null;
	boolean flag=false;
	p=traerProducto(idProducto);
	if(p!=null) {
		flag=true;
		p.setPrecio((float)precio);
		p.setProducto(producto);
	}
	return flag;
}
public boolean eliminarProducto(int idProducto)throws Exception {
	Producto p=null;
	boolean flag=false;
	p=traerProducto(idProducto);

	if(p!=null) {
		gondola.remove(p);
		flag=true;

	}

	return flag;

}
}

