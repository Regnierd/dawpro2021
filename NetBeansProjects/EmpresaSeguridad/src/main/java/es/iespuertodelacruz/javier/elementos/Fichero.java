
package es.iespuertodelacruz.javier.elementos;

import es.iespuertodelacruz.javier.exceptions.ExceptionPropia;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Fichero{
    private String patron = "^[A-Z,a-z]+|[A-Z-a-z]+.[a-z]{3}$";
//    private String patron = "^[A-Z,a-z]+.[a-z]{3}$";
    Pattern pattern;
    Matcher matcher;
    /**
     * Metodo para crear un fichero
     * @param nombre nombre que va a tener el fichero
     * @throws ExceptionPropia error indicando que ya existe el fichero a crear
     */
    public void crear(String nombre) throws ExceptionPropia{
        File file = new File(nombre);
        try{
            if(existe(file)){
                throw new ExceptionPropia("El fichero " + nombre + "ya existe");
            }else{
                file.createNewFile();
            }
       }catch(IOException ex){
           throw new ExceptionPropia("Se ha producido un error trabajando con"
                   + "el fichero: ");
       }
    }
    
    /**
     * Metodo para eliminar un fichero.
     * @param nombre nombre que se le pasa al metodo
     * @throws ExceptionPropia error indicando que no existe el fichero a eliminar
     */
    public void eliminar(String nombre) throws ExceptionPropia{
        File file = new File(nombre);
        if(existe(file)){
            file.delete();
        }else{
            throw new ExceptionPropia("El fichero " + nombre + " no existe");
        }
    }
    
    /**
     * Funcion para verificar el path o nombre del fichero
     * @param file file que contiene el nombre
     * @return boolean
     * @throws FicheroException 
     */
     public boolean existe(File file) throws ExceptionPropia{              
        return file.exists();
    }
     
    /**
     * Funcion para verificar si es un directorio o un fichero
     * @param file 
     * @return true si es un fichero o false si es un directorio
     */
     public boolean verificarDirectorio(File file) throws ExceptionPropia, Exception{
         if(existe(file)){       
             return true;
         }else if(validar(file.getName())){
             return false;
         }else{
             throw new ExceptionPropia("Error al comprobar si es un fichero o directorio");
         }         
     }
     
  
     
     /**
     * Metodo encargado de crear un directorio
     * @param nombre del directorio a crear
     * @throws FicheroException error en la creacion del directorio
     */
    public void crearDirectorio(String nombre) throws ExceptionPropia, Exception {
        File file;
        file = new File(nombre);
        if (existe(file)) {
            throw new ExceptionPropia("El directorio/fichero " + nombre + ", ya existe.");
        } else if (!validar(nombre)){
            file.mkdir();
        } else {
            throw new ExceptionPropia("Esta intentando crear un directorio " + nombre + ".");
        }
    }
     
     /**
      * Metodo para mostrar los datos del fichero o directorio
      * @param file
      * @throws Exception 
      */
     public void mostrarDatos(File file) throws Exception{
         if(verificarDirectorio(file)){
             System.out.println("Nombre : " + file.getName() + 
                     "Peso del fichero: " +file.length() +
                     "Permisos de lectura: " + file.canRead() +
                     "Permiso de escritura: " + file.canWrite() +
                     "Ruta absoluta: " + file.getAbsolutePath());
         }else{
             System.out.println("Nombre: " + file.getName()+
                    "Ruta completa: " + file.getAbsolutePath());
         }
     }
     
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validar(String valor) throws Exception{
        boolean resultado = false;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(valor);
        resultado =  matcher.find();
        
        if(!resultado){
            throw new Exception("El dni:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
}
