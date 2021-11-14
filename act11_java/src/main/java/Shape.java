
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public interface Shape {
    public static final int lado = 5, radio = 3;
    public void getArea();
    public void getPerimeter();
    public void getAtributos();
}

//clase del rectangulo
class Square implements Shape {
    public void getAtributos(){        
        System.out.println("El cuadrado tiene 4 lados y miden " + lado + " cm\n");
    }
    
    public void getArea(){        
        System.out.println("El area del cuadrado es: " + lado*lado + " cm^2\n");
    }
    
    public void getPerimeter(){        
        System.out.println("El perimetro del cuadrado es: " + lado*4 + " cm\n");
    }
}

//clase del triangulo EQUILATERO
class Triangle implements Shape {
    public void getAtributos(){
        System.out.println("El triangulo tiene 3 lados y miden " + lado + " cm\n");
    }
    
    public void getArea(){
        System.out.println("El area del triangulo es: " + (sqrt(3)/4)*(lado*lado) + " cm^2\n");
    }
    
    public void getPerimeter(){
        System.out.println("El perimetro del triangulo es: " + lado*3 + " cm\n");
    }
}

//clase del triangulo EQUILATERO
class Circle implements Shape {
    public void getAtributos(){
        System.out.println("El radio del circulo mide: " + radio  + " cm\n");
    }
    
    public void getArea(){
        System.out.println("El area del circulo es: " + 3.1416*(radio*radio) + " cm^2\n");
    }
    
    public void getPerimeter(){
        System.out.println("El perimetro del circulo es: " + 2*3.1416*radio + " cm\n");
    }
}

class interfazMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        
        int figuraElegida = 1234567890;
        int propiedad = 1234567890;
        int opcion;

        do{
            System.out.println("Ingrese la opcion que desea realizar:\n"
                    + "1) Seleccionar propiedad a calcular\n"
                    + "2) Seleccionar la figura\n"
                    + "3) Solicitar los atributos de la figura\n"
                    + "4) Imprimir en pantalla el resultado de los cálculos\n"
                    + "5) Salir");
            opcion = Integer.parseInt(br.readLine());            
            
            switch(opcion){
                case 1: do{
                            System.out.println("¿Que propiedad quieres calcular?\n"
                                    + "1) Area\n"
                                    + "2) Perimetro");
                            propiedad = Integer.parseInt(br.readLine());

                            //Revisar la valides del dato
                            if(propiedad!=1 && propiedad!=2){
                                System.out.println("Opcion no valida");
                            }
                        } while(propiedad!=1 && propiedad!=2 && propiedad!=1234567890);
                        break;

                case 2: do{
                            System.out.println("Eliga el numero de la figura que quiere:\n"
                            + "1) Rectangulo\n"
                            + "2) Triangulo equilatero\n"
                            + "3) Circulo");
                            figuraElegida = Integer.parseInt(br.readLine());

                            //Revisar la valides del dato
                            if(figuraElegida!=1 && figuraElegida!=2 && figuraElegida!=3){
                                System.out.println("Opcion no valida");
                            }
                        } while(figuraElegida!=1 && figuraElegida!=2 && figuraElegida!=3);
                        break;
                
                case 3: if(figuraElegida == 1234567890){
                            System.out.println("No ha seleccionado ninguna figura\n");
                            break;                        
                        } else if(figuraElegida == 1){
                            square.getAtributos();
                        } else if(figuraElegida == 2){
                            triangle.getAtributos();
                        } else if(figuraElegida == 3){
                            circle.getAtributos();
                        }
                        break;

                case 4: if(figuraElegida == 1234567890){
                            System.out.println("No ha seleccionado ninguna figura\n");
                            break;         
                        }
                        if(propiedad == 1234567890){
                            System.out.println("No ha seleccionado ninguna propiedad\n");
                            break;
                        
                        //Seccion del cuadrado
                        } else if(figuraElegida == 1){
                            if(propiedad==1){
                                square.getArea();
                            } else{
                                square.getPerimeter();
                            }
                            
                        //Seccion del triangulo 
                        } else if(figuraElegida == 2){
                            if(propiedad==1){
                                triangle.getArea();
                            } else{
                                triangle.getPerimeter();
                            }
                        
                        //Seccion del circulo 
                        } else if(figuraElegida == 3){
                            if(propiedad==1){
                                circle.getArea();
                            } else{
                                circle.getPerimeter();
                            }
                        }
                        break;
                case 5: System.out.println("Adios");;break;
                
                default: System.out.println("Opcion no valida\n"); break;
            }
            
        } while (opcion != 5);
        
    }
    
}