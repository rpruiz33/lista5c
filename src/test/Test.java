package test;

import model.ItemCarrito;
import model.Producto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Producto p=new Producto( "cafe", 23.2f) ;
		 ItemCarrito i= new ItemCarrito(1, p, 22);
	}

}
