package Listas;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractica {
    
   ArrayList<Datos> lista = new ArrayList<>();
   String [] enviarTabla ={};
    public void registar(){
        try{
            
            Datos productos = new Datos();	// Creo un objeto de la clase "Datos productos"
            
            //agregar atributos del objeto productos//
            productos.setCodigo_producto("1");
            productos.setNombre_producto("cola");
            productos.setPrecio_compra("0.25");
            productos.setPrecio_venta("0.30");
            productos.setStock("30");
            productos.setCantidad_vendida("12");
            
            lista.add(productos);
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public void registarVista(String codigo, String nombre, String precio_compra, String precio_venta, String stock, String cantidad_vendida){
        try{

            Datos productos = new Datos();	// Creo un objeto de la clase "Datos productos"
            
            //agregar atributos del objeto productos//
            productos.setCodigo_producto(codigo);
            productos.setNombre_producto(nombre);
            productos.setPrecio_compra(precio_compra);
            productos.setPrecio_venta(precio_venta);
            productos.setStock(stock);
            productos.setCantidad_vendida(cantidad_vendida);
            
            lista.add(productos);
            
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }   
    public void leer(){
        System.out.println("... Resultados de los productos insertados ...");
        Iterator<Datos> itrPartidos = lista.iterator();
        while(itrPartidos.hasNext()){
	Datos partido = itrPartidos.next();
	System.out.println(partido.getCodigo_producto() + " "
			+ partido.getNombre_producto() + " "
			+ partido.getPrecio_compra() + " "
			+ partido.getPrecio_venta() + " "
                        + partido.getStock() + " "
                        + partido.getCantidad_vendida()); 
        }   
    }
    
    public ArrayList leer3(){
            System.out.println("se eecuta esto");
        Iterator<Datos> itrPartidos = lista.iterator();
        while(itrPartidos.hasNext()){
	Datos partido = itrPartidos.next();
	System.out.println(partido.getCodigo_producto() + " "
			+ partido.getNombre_producto() + " "
			+ partido.getPrecio_compra() + " "
			+ partido.getPrecio_venta() + " "
                        + partido.getStock() + " "
                        + partido.getCantidad_vendida());  
        } 
        return lista;
  
    }
}
