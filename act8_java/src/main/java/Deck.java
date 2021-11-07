
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
        List<String> deck1 = new ArrayList<>();
        String opcion;
             
        String[] palo = {"Pica, ", "Corazon, ", "Diamante, ", "Trebol, "};
        String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Integer cont = 0;
        
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < valor.length; j++) {
                deck1.add(cont, (palo[i] + getColor(palo[i]) + valor[j]));
                cont = cont + 1;
            }
        }
        
        do{
            opcion = showMenu();
            switch(opcion){
                case "a": deck1 = shuffle(deck1); break;
                case "b":   try {
                                deck1 = head(deck1);
                            }catch (IndexOutOfBoundsException e){
                                System.out.println("Se han agotado las cartas");
                                opcion = "e";
                            }
                            break;                    
                case "c":   try {
                                deck1 = pick(deck1);
                            }catch (IndexOutOfBoundsException e){
                                System.out.println("Se han agotado las cartas");
                                opcion = "e";
                            }
                            break;
                case "d":   try {
                                deck1 = hand(deck1);
                            }catch (IndexOutOfBoundsException e){
                                System.out.println("Se han agotado las cartas");
                                opcion = "e";
                            }
                            break;
                case "e": System.out.println("Adios"); break;
                default: System.out.println("Opcion no valida"); break;
            }            
            System.out.println(); 
        } while (!opcion.equals("e"));
        
    }
        
    public static String showMenu() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion;          
        System.out.println("Elige una opcion:"
            + "\n a) shuffle: mezclar el deck"
            + "\n b) head: mostrar la primera carta del deck"
            + "\n c) pick: seleccionar una carta al azar"
            + "\n d) hand: regresará un arreglo de cinco cartas del deck"
            + "\n e) salir");
        opcion = br.readLine();   
        return opcion;
    }
        
    public static String getColor(String palo) {
        if (palo.toLowerCase().equals("pica, ") || palo.toLowerCase().equals("trebol, ")) {
            return "negro, ";
        }
        if (palo.toLowerCase().equals("corazon, ") || palo.toLowerCase().equals("diamante, ")) {
            return "rojo, ";
        }
        return null;
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