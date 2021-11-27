
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class AddressBook {
    
    HashMap<String, String> contactos = new HashMap<String, String>();
    File archivo = new File("Contactos.csv");
    
    public AddressBook() throws FileNotFoundException, IOException{
        this.load();
    }
    
    
    public void list(){
        System.out.println("Contactos:");
        for (String i : contactos.keySet()) {
            String contacto = i + " : " + contactos.get(i);
            System.out.println(contacto);
        }
    }
    
    public void create(String tel, String nom){
        contactos.put(tel, nom);
    }
    
    public void delete(String tel){
        try{
            contactos.remove(tel);
            System.out.println("Contacto eliminado");
        }catch(Exception e){
            System.out.println("No se encontro un contacto con ese numero");
        }
    }
    
    public void load() throws FileNotFoundException, IOException{
        if(archivo.isFile()){
            Scanner lector = new Scanner(archivo);
            lector.useDelimiter(",");
            while(lector.hasNext()){
                String[] datos = lector.nextLine().split(",");
                this.create(datos[0], datos[1]);
            }
            lector.close();
        }else{
            System.out.println("No hay registros, se creara un nuevo archivo de contactos\n");
        }
    }
    
    public void save() throws IOException{
        FileWriter escritor = new FileWriter("Contactos.csv");
        for (String i : contactos.keySet()) {
            String insertar = i + "," + contactos.get(i) + "\n";
            escritor.write(insertar);
            escritor.flush();
        }
        escritor.close();
    }
        
}
