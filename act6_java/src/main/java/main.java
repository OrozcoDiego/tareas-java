
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class main {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double calificaciones[] = new double [6];
        String nombre;
        double promedio = 0;
        
        System.out.println("Cual es el nombre del alumno?");
        nombre = br.readLine();
             
        for(int i=1; i<=5; i++){
            System.out.println("Inserta la calificacion " + i + ": ");
            calificaciones[i] = Integer.parseInt(br.readLine());
            
            //comprobar que las calificaciones sean menores a 100
            if (calificaciones[i] > 100){
                System.out.println("La calificacion debe ser un NUMERO menor o igual a 100 ");
                i = i - 1;
            }
        }    
        double prom = getPromedio(calificaciones, promedio);
        String cal = calificacionEnLetra(prom);
        imprimirResultados(nombre, calificaciones, prom, cal);      
    }
    
    
    //Metodo para sacar el promedio
    public static double getPromedio(double calificaciones[], double promedio) {
        for(int i=1; i<=5; i++){
            promedio = promedio + calificaciones[i];
        }        
        return promedio/5;
    }

    //Metodo para asignar una calificacion en numero
    public static String calificacionEnLetra(double promedio) {
        String calificacionNumero;
        if(promedio <= 50){
            calificacionNumero = "F";
        } else if (promedio <= 60) {
            calificacionNumero = "E";
        } else if (promedio <= 70) {
            calificacionNumero = "D";
        } else if (promedio <= 80) {
            calificacionNumero = "C";
        } else if (promedio <= 90) {
            calificacionNumero = "B";
        } else {
            calificacionNumero = "A";
        }        
        return calificacionNumero;        
    }
    
    //Metodo en el que se imprimen los resultados
    public static void imprimirResultados(String nombre,double calificaciones[], double prom, String cal){
        System.out.println("Nombre del estudiante: " + nombre
                + "\nCalificacion 1: " + calificaciones[1]
                + "\nCalificacion 2: " + calificaciones[2]
                + "\nCalificacion 3: " + calificaciones[3]
                + "\nCalificacion 4: " + calificaciones[4]
                + "\nCalificacion 5: " + calificaciones[5]
                + "\nPromedio: " + prom 
                + "\nCalificacion: " + cal);
    }
    
}
