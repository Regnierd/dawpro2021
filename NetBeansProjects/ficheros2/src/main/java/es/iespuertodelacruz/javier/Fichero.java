package es.iespuertodelacruz.javier;

import java.io.*;
import java.util.Scanner;

import es.iespuertodelacruz.javier.exception.FicheroException;


public class Fichero {
    
    private static final String RETORNO_CARRO = "\n";
    /**
     * Funcion para leer un fichero
     * @param nombre nombre del fichero a leer
     * @throws error controlado
     */
    public String leer(String nombre) throws FicheroException{
        StringBuilder informacion = null;
        File file = null;
        Scanner scanner = null;
        try {           
            file = new File(nombre);
            scanner = new Scanner(file);
            informacion = new StringBuilder();
            if(!file.exists()){              
                throw new FicheroException("El fichero a leer no existe.");
            }
            
            while(scanner.hasNextLine()){
                String linea = scanner.nextLine();
                informacion.append(linea + RETORNO_CARRO);
                
            }
        } catch (FicheroException e) {
            throw e;
        }catch(Exception e){
            throw new FicheroException("Se ha producido un error en la lectura del fichero", e);
        }finally{
            if(scanner != null){
                scanner.close();
            }
        }
        return informacion.toString();
    }

    /**
     * Metodo encargado para crear y escribir en un fichero
     * @param nombre del fichero a crear
     * @param cadenaTexto que contendra el fichero
     * @throws FicheroException 
     */
    public void crear(String nombre, String cadenaTexto) throws FicheroException{
        FileWriter file = null;
        try {
            file = new FileWriter(nombre);
            file.write(cadenaTexto + "\n");
        } catch (Exception e) {
            throw new FicheroException("Se ha producido un error en la escritura del fichero", e);
        }finally{
            if(file != null){
                try {
                    file.close();
                } catch (IOException e) {
                    throw new FicheroException("No ha sido posible cerrar el fichero", e);
                }
               
            }
        }
    }

    /**
     * Funcion que verifica si el fichero existe
     * @param file fichero que vamos a verificar
     * @return true si existe, false si no existe
     */
    public boolean validarFichero(File file){
        return file.exists();
    }

    /**
     * Metodo para eliminar un fichero
     * @param nombre del fichero
     * @throws FicheroException error controlado
     */
    public void eliminar(String nombre) throws FicheroException{
        File file = new File(nombre);
        if(validarFichero(file)){
            file.delete();
        }else{
            throw new FicheroException("No se puede eliminar un fichero que no existe");
        }
    }

    /**
     * Funcion que verifica si se trata de un directorio o no
     * @param path de la ruta a validar
     * @return true si es un directorio, false si no lo es
     */
    public boolean esDirectorio(String path){
        File file = new File(path);
        return file.isDirectory();
    }


}
