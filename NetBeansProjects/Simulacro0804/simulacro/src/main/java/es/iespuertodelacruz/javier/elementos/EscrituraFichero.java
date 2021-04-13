package es.iespuertodelacruz.javier.elementos;

import java.io.FileWriter;
import java.io.IOException;

import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class EscrituraFichero extends Fichero{
    
    String [] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete"};

     /**
     * Metodo que permite almacenar en un fichero
     * @param nombreFichero nombre del fichero
     * @throws FicheroException
     */
    public void volcarFichero(String nombreFichero) throws FicheroException{            
        String cadena = mostrarLista();
        crear(nombreFichero, cadena);
    }

    /**
     * Metodo para escribir en un fichero 
     * @param nombre del fichero
     * @throws FicheroException error controlado
     */
    public void crear(String nombreFichero, String cadena) throws FicheroException{
        FileWriter ficheroEscribir = null;
        try{
            ficheroEscribir = new FileWriter(nombreFichero);
            ficheroEscribir.write(cadena + "\n");                  
        }catch(IOException e){
            throw new FicheroException("Se ha producido un error en la escritura del fichero", e);
        }finally {
            if (ficheroEscribir != null) {
                try {
                    ficheroEscribir.close();
                } catch (IOException e) {
                    throw new FicheroException("No ha sido podible cerrar el fichero", e);
                }
            }
        }
    }

    

    /**
     * Funcion para mostrar la lista de numeros del array
     * @return string 
     */
    public String mostrarLista(){
        String listar = "";
        for (String linea : lineas) {
            listar += linea;
        }
        return listar;
    }

    
}
