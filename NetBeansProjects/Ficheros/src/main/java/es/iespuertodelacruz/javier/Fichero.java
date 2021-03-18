
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exception.FicheroException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class Fichero {
    
    /**
     * Metodo para crear un fichero
     * @param nombre nombre que va a tener el fichero
     * @throws FicheroException error indicando que ya existe el fichero a crear
     */
    public void crear(String nombre) throws FicheroException{
       File file;
       file = new File(nombre);
       try{
            if(existe(file)){
                throw new FicheroException("El fichero " + nombre + "ya existe", null);
            }else{
                file.createNewFile();
            }
       }catch(IOException ex){
           throw new FicheroException("Se ha producido un error trabajando con"
                   + "el fichero: ", null);
       }
       
    }
    
//    public void escribir(String nombre) throws FicheroException{
//        File file = new File(nombre);
//        try{
//            if(file.exists()){
//                FileWriter myWriter = new FileWriter(nombre);
//                myWriter.write("Hola mundo");
//                myWriter.close();
//            }else{
//                crear(nombre);
//            }  
//        }catch(IOException ex){
//            throw new FicheroException("El fichero " + nombre + " no existe", null);
//        }
//    }
    
    public void leer(String nombre){
        Scanner myReader = new Scanner(System.in);
        File file = new File(nombre);
        try{
            if(file.exists()){
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                }
            }
        }catch(IOException ex){
            System.out.println("Error a la hora de leer el fichero" + ex.getMessage());
        }finally{
            if(myReader != null){
                myReader.close();
            }
            
        }
        
        myReader.close();
        
    }
    /**
     * Metodo para eliminar un fichero
     * @param nombre nombre que lleva el file
     * @throws FicheroException error indicando que no existe el fichero a eliminar
     */
    public void eliminar(String nombre) throws FicheroException{
        File file = new File(nombre);
        if(existe(file)){
            file.delete();
        }else{
            throw new FicheroException("El fichero " + nombre + " no existe" , null);
        }
    }
    
    /**
     * Funcion para verificar el path o nombre del fichero
     * @param file file que contiene el nombre
     * @return boolean
     * @throws FicheroException 
     */
     public boolean existe(File file) throws FicheroException{              
        return file.exists();
    }
    
}
