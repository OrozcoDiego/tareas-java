
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
public class Act12Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        AddressBook contactos = new AddressBook();

        while(opcion != 4){
            System.out.println("Elige una opcion:\n"
                    + "1. Lista de contactos\n"
                    + "2. Agregar nuevo contacto\n"
                    + "3. Borrar un contacto\n"
                    + "4. Salir");
            try{
                opcion = Integer.parseInt(br.readLine());
            }catch(Exception e){
                System.out.println("No se selecciono una opcion valida");
            }

            switch(opcion){
                case 1:{
                    contactos.list();
                    break;
                }

                case 2:{
                    System.out.println("Ingresa el nombre del contacto");
                    String nom = br.readLine();
                    System.out.println("Ingresa el telefono del contacto");
                    String tel = br.readLine();
                    contactos.create(tel, nom);
                    System.out.println("Contacto agregado");
                    break;
                }

                case 3:{
                    System.out.println("Ingresa el telefono del contacto a borrar");
                    String tel = br.readLine();
                    contactos.delete(tel);
                    break;
                }

                case 4:{
                    contactos.save();
                    System.out.println("Adios.");
                    break;
                }

                default:{
                    System.out.println("Seleccione una opcion valida");
                }
            }
            System.out.println();
        }
    }
}
