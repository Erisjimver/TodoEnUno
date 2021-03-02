package Listas;

import java.util.ArrayList;

public class ArrayListPractica {
    
    ArrayList<Datos> lista = new ArrayList<>();
   
    public void registar(){
        try{
       //     String [] cortarString = linea.split("::");		// Obtengo los datos del partido de futbol
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
    
}
