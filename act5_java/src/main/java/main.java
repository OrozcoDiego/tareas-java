
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
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, rSuma, rResta, rMultiplicacion, rDivision, rModulo;
        
        System.out.println("Escribe el valor de X: ");
        x = Integer.parseInt(br.readLine());        
        System.out.println("Escribe el valor de Y: ");
        y = Integer.parseInt(br.readLine());
        
        rSuma = x + y;
        rResta = x - y;
        rMultiplicacion = x * y;
        rDivision = x / y;
        rModulo = x % y;
        
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Suma: " + rSuma);
        System.out.println("Resta: " + rResta);
        System.out.println("Multiplicacion: " + rMultiplicacion);
        System.out.println("Division: " + rDivision);
        System.out.println("Modulo: " + rModulo);
    }
    
}
