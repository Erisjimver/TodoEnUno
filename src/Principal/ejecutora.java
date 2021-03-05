package Principal;

import Listas.ArrayListPractica;
import Listas.Datos;
import java.util.ArrayList;
import java.util.Iterator;


public class ejecutora {


    public static void main(String[] args) {
        ArrayListPractica listas= new ArrayListPractica();
    /*
    ArrayList<String> lista = new ArrayList<>();
    
    lista.add("hola");
    lista.add("Solange");
    lista.add("tal");
    lista.add("estas");
    lista.add("hoy");
    
    for (int i=0;i<lista.size();i++) {
      
      System.out.println(lista.get(i));
    }
            */
    ArrayList<Datos> lista = new ArrayList<>();
    listas.registar();
    listas.leer();
    lista = listas.leer3();
    


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
    
    
}
    
    

