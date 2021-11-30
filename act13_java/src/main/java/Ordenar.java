
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */

//clase anonima
interface AnonClass {
    public void anonLongitud();
    public void anonAlfabetico();
}

//lambda por longitud
interface lambdaLongitud {
    public void make();
}
//lambda por orden alfabetico
interface lambdaAlfabetico {
    public void make();
}

//Metodos de referencia
interface metodosReferencia {
    void make(ArrayList<String> ListaHambre);
}
class metodo {
    static void referenciaLongitud(ArrayList<String> ListaHambre) {        
        System.out.println("Por longitud utilizando método de referencia:");
        Collections.sort(ListaHambre, (s1, s2) -> s1.length() - s2.length());
        for(int i=0; i<ListaHambre.size(); i++)
            System.out.println(ListaHambre.get(i));   
        System.out.println();
    }
    static void referenciaAlfabetico(ArrayList<String> ListaHambre) {
        System.out.println("Por orden alfabético utilizando método de referencia:");
        Collections.sort(ListaHambre);
        for(int i=0; i<ListaHambre.size(); i++)
            System.out.println(ListaHambre.get(i));
        System.out.println();
    }
}


public class Ordenar {
    
    public static void main(String[] args){
        
        ArrayList<String> ListaHambre = new ArrayList<String>();
        ListaHambre.add("Taquitos");
        ListaHambre.add("Pozole");
        ListaHambre.add("Mole");
        ListaHambre.add("Anvorgesa");
        ListaHambre.add("Cochinita");
        ListaHambre.add("Carne asada");
        ListaHambre.add("Enchiladas");
        ListaHambre.add("Tamales");
        ListaHambre.add("Birria");
        ListaHambre.add("Que rico no antojen");  
        
        
        //Esta es la clase anonima
        AnonClass anon = new AnonClass() {
            public void anonLongitud() {
                System.out.println("Por longitud utilizando clase anónima:");
                Collections.sort(ListaHambre, (s1, s2) -> s1.length() - s2.length());
                for(int i=0; i<ListaHambre.size(); i++)
                    System.out.println(ListaHambre.get(i));  
                System.out.println();
            }
            public void anonAlfabetico() {
                System.out.println("Por orden alfabético utilizando clase anónima:");
                Collections.sort(ListaHambre);
                for(int i=0; i<ListaHambre.size(); i++)
                    System.out.println(ListaHambre.get(i));
                System.out.println();
            }
        };
        anon.anonLongitud();        
        anon.anonAlfabetico();        
        
        
        //Expresión lambda:        
        lambdaLongitud ll = () -> {
            System.out.println("Por longitud utilizando expresión Lambda:");
            Collections.sort(ListaHambre, (s1, s2) -> s1.length() - s2.length());
            for(int i=0; i<ListaHambre.size(); i++)
                System.out.println(ListaHambre.get(i));
            System.out.println();
        };
        ll.make();
        lambdaAlfabetico la = () -> {
            System.out.println("Por orden alfabético utilizando expresión Lambda:");
            Collections.sort(ListaHambre);
            for(int i=0; i<ListaHambre.size(); i++)
                System.out.println(ListaHambre.get(i)); 
            System.out.println();
        };
        la.make();
        
        
        //Metodos de refrerencia
        metodosReferencia referenciaLongitud = metodo::referenciaLongitud;
        metodosReferencia referenciaAlfabetico = metodo::referenciaAlfabetico;
        referenciaLongitud.make(ListaHambre);
        referenciaAlfabetico.make(ListaHambre);
    }
    
}
