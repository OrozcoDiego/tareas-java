
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Deck {
            
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> deck1 = new ArrayList<>();
        String opcion;
        
        deck1.add("treboles, negro, 2");
        deck1.add("treboles, negro, 3");
        deck1.add("treboles, negro, 4");
        deck1.add("treboles, negro, 5");
        deck1.add("treboles, negro, 6");
        deck1.add("treboles, negro, 7");
        deck1.add("treboles, negro, 8");
        deck1.add("treboles, negro, 9");
        deck1.add("treboles, negro, 10");
        deck1.add("treboles, negro, A");
        deck1.add("treboles, negro, J");
        deck1.add("treboles, negro, Q");
        deck1.add("treboles, negro, K");
        
        deck1.add("corazones, rojo, 2");
        deck1.add("corazones, rojo, 3");
        deck1.add("corazones, rojo, 4");
        deck1.add("corazones, rojo, 5");
        deck1.add("corazones, rojo, 6");
        deck1.add("corazones, rojo, 7");
        deck1.add("corazones, rojo, 8");
        deck1.add("corazones, rojo, 9");
        deck1.add("corazones, rojo, 10");
        deck1.add("corazones, rojo, A");
        deck1.add("corazones, rojo, J");
        deck1.add("corazones, rojo, Q");
        deck1.add("corazones, rojo, K");
        
        deck1.add("picas, negro, 2");
        deck1.add("picas, negro, 3");
        deck1.add("picas, negro, 4");
        deck1.add("picas, negro, 5");
        deck1.add("picas, negro, 6");
        deck1.add("picas, negro, 7");
        deck1.add("picas, negro, 8");
        deck1.add("picas, negro, 9");
        deck1.add("picas, negro, 10");
        deck1.add("picas, negro, A");
        deck1.add("picas, negro, J");
        deck1.add("picas, negro, Q");
        deck1.add("picas, negro, K");
        
        deck1.add("diamantes, rojo, 2");
        deck1.add("diamantes, rojo, 3");
        deck1.add("diamantes, rojo, 4");
        deck1.add("diamantes, rojo, 5");
        deck1.add("diamantes, rojo, 6");
        deck1.add("diamantes, rojo, 7");
        deck1.add("diamantes, rojo, 8");
        deck1.add("diamantes, rojo, 9");
        deck1.add("diamantes, rojo, 10");
        deck1.add("diamantes, rojo, A");
        deck1.add("diamantes, rojo, J");
        deck1.add("diamantes, rojo, Q");
        deck1.add("diamantes, rojo, K");  
        
        do{
            System.out.println("Elige una opcion:"
                + "\n a) shuffle: mezclar el deck"
                + "\n b) head: mostrar la primera carta del deck"
                + "\n c) pick: seleccionar una carta al azar"
                + "\n d) hand: regresará un arreglo de cinco cartas del deck"
                + "\n e) salir");
            opcion = br.readLine();
            
            switch(opcion){
                case "a": deck1 = shuffle(deck1); break;
                case "b": deck1 = head(deck1); break;
                case "c": deck1 = pick(deck1); break;
                case "d": deck1 = hand(deck1); break;
                case "e": System.out.println("Adios"); break;
                default: System.out.println("Esa opcion no existe"); break;
            }
            System.out.println();
            
        } while (!opcion.equals("e"));
             
    }
    
    //Metodo para revolver las cartas del deck
    public static List<String> shuffle(List<String> deck1) {
        Collections.shuffle(deck1);
        System.out.println("Se mezcló el Deck");
        return deck1;
    }
    
    public static List<String> head (List<String> deck1) {        
        System.out.println(deck1.get(0) + "\nQuedan " + (deck1.size()-1));
        deck1.remove(0);
        return deck1;
    }
    
    //Metodo para tomar un a carta al azar y eliminarla despues
    public static List<String> pick (List<String> deck1) {        
        int aleatorio = (int)(Math.random()*(deck1.size()-1+1)+1); 
        System.out.println(deck1.get(aleatorio) + "\nQuedan " + (deck1.size()-1));
        deck1.remove(aleatorio);
        return deck1;
    }
    
    public static List<String> hand (List<String> deck1) {        
        for(int i = 0; i <= 4; i++){
            System.out.println(deck1.get(0));
            deck1.remove(0);
        }
        System.out.println("Quedan " + deck1.size());
        return deck1;
    }
    
}