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
    
    public static void main(String[] args){
        // TODO code application logic here
        int cantidadNumeros = 10;
        int numerosPrimos[] = new int [cantidadNumeros+1];
        int sucesionFibo[] = new int [cantidadNumeros+1];
        
        System.out.println("Numeros Primos:");
        getPrimos(numerosPrimos, cantidadNumeros);        
        
        String losFibonacci = getFibonacci(sucesionFibo, cantidadNumeros);
        System.out.println("Sucesion de fibonacci: \n" + losFibonacci);
    }    
    
    //Metodo para sacar los numeros primos
    public static String getPrimos(int numerosPrimos[], int cantidadPrimos) {
        int i,n=4,cont=2;
        String cad="";
        if(cantidadPrimos>2){
            cad="2, 3";
            while(cont<cantidadPrimos){
                i=2;
                while(i<=n){
                    if(i==n){
                    cad=cad+", "+n;
                    cont=cont+1;
                    }else{
                    if(n % i==0){
                    i=n;
                    }
                    }
                    i=i+1;
                }
                n=n+1;
            }
            System.out.println(cad);
        }else{
            if(cantidadPrimos>0){
                if(cantidadPrimos==1){
                    System.out.println("es primo 2");
                }else{
                    System.out.println("es primo 2, 3");
                }
            }else{
                System.out.println("ingresa numeros positivos");
            }
        }
        return cad;
    }      
    

    //Metodo para sacar una sucion de fibonacci de n numeros
    public static String getFibonacci(int sucesionFibo[], int cantidadFibonacci) {
        int fibo1,fibo2,i;
        String cad = "";
        fibo1=1;
        fibo2=1;

        cad = String.valueOf(fibo1);
        for(i=2; i<=cantidadFibonacci ;i++){
            cad = cad + ", "  + String.valueOf(fibo2);
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();     
        return cad;
    }
    
}