package Principal;

import Listas.ArrayListPractica;
import java.util.ArrayList;


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
    
    listas.registar();
    listas.leer();
        
    }
    
}
