package es.iespuertodelacruz.javier.modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import es.iespuertodelacruz.javier.api.Fruta;
import es.iespuertodelacruz.javier.exception.FicheroException;

public class Fichero {
    private static final String RETORNO_CARRO = "\n";
    private static final String NOMBRE_FICHERO = "Fichero-frutas.txt";
    private static final String SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO = "Se ha producido un error en el volcado del fichero";
    /**
     * Metodo encargado de almacenar una fruta en el fichero
     * @param fruta
    * @throws FicheroException
     */
    public void insertar(Fruta fruta) throws FicheroException{
      //1. obtener la lista de frutas del fichero
      ArrayList<Fruta> listado;
      listado = obtenerListado();
      //2 insertar la fruta al final de la lista
      listado.add(fruta);
      //3. volcar al fichero toda la informacion
      try {
         crear(NOMBRE_FICHERO, listado.toString());
      } catch (FicheroException e) {
         throw new FicheroException(SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO, e);
      }
    }

    /**
     * Metodo encargado de eliminar una fruta del fichero
     * @param fruta
    * @throws FicheroException
     */
    public void eliminar(Fruta fruta) throws FicheroException{
       //1. obtener la lista de frutas del fichero
       ArrayList<Fruta> listado;
       listado = obtenerListado();
       //2 eliminar la fruta al final de la lista
       listado.remove(fruta);
       //3. volcar al fichero toda la informacion

       try {
          crear(NOMBRE_FICHERO, listado.toString());
       } catch (FicheroException e) {
          throw new FicheroException(SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO, e);
       }
      
    }

    /**
    * Metodo encargado de modificar un elemento del fichero
    * @param frutaAlamcenada elemento a actualizar
    * @param fruta elemento con la informacion actualizada
    * @throws FicheroException
    */
   public void modificar (Fruta frutaAlmacenada, Fruta fruta) throws FicheroException {
      ArrayList<Fruta> listado = obtenerListado(); 
      int posicion = -1;
      posicion = listado.indexOf(frutaAlmacenada);
      listado.remove(posicion);
      listado.add(posicion, fruta);
      crear(NOMBRE_FICHERO, listado.toString());
      
   }

    /**
     * Funcion encargada de obtener el listado de frutas del fichero
     * @return listado de frutas
    * @throws FicheroException
     */
    public ArrayList<Fruta> obtenerListado() throws FicheroException{
      ArrayList<Fruta> lista = new ArrayList<>();
      File fichero = null;
      Scanner scanner = null;

      try {
         fichero = new File(NOMBRE_FICHERO);
         if (!validarFichero(fichero)) {
            throw new FicheroException("El fichero a leer no existe");
         }
         scanner = new Scanner(fichero);

         while (scanner.hasNextLine()) {
            String linea = scanner.nextLine(); // Guardamos la linea en un String
            Fruta fruta = new Fruta(linea);
            lista.add(fruta);
         }
      } catch (FicheroException e) {  
            throw e;
      }catch (Exception e) {
            throw new FicheroException("Se ha producido un error en la lectura del fichero", e);
      } finally {
         if (scanner != null) {
            scanner.close();
         }
      }
      return lista; 
    }
   /**
    * Funcion encargada de leer un ficher
    * 
    * @param nombre nombre del fichero a leer
    * @throws FicheroException Error controlado en la lectura del fichero
    */
   public String leer(String nombre) throws FicheroException {
      StringBuilder informacion = null;
      File fichero = null;
      Scanner scanner = null;

      try {
         fichero = new File(nombre);
         if (!validarFichero(fichero)) {
            throw new FicheroException("El fichero a leer no existe");
         }
         informacion = new StringBuilder();
         scanner = new Scanner(fichero);

         while (scanner.hasNextLine()) {
            String linea = scanner.nextLine(); // Guardamos la linea en un String
            informacion.append(linea + RETORNO_CARRO);
         }
      } catch (FicheroException e) {  
            throw e;
      }catch (Exception e) {
            throw new FicheroException("Se ha producido un error en la lectura del fichero", e);
      } finally {
         if (scanner != null) {
            scanner.close();
         }
      }
      return informacion.toString();
   }

   /**
    * Metodo encargado de crear un fichero
    * @param nombre del fichero a crear
    * @throws FicheroException error controlado
    */
   public void crear(String nombre, String cadenaTexto) throws FicheroException {
      FileWriter fichero = null;
      try {
			fichero = new FileWriter(nombre);
         fichero.write(cadenaTexto + "\n");
		} catch (Exception ex) {
			throw new FicheroException("Se ha producido un error en la escritura del fichero", ex);
		} finally {
         if (fichero != null) {
            try {
               fichero.close();
            } catch (IOException e) {
               throw new FicheroException("No ha sido podible cerrar el fichero", e);
            }
         }
      }

   }

   /**
    * Funcion que verifica si el fichero existo
    * @param fichero que se valida
    * @return true si existe, false si no existe
    */
   public boolean validarFichero(File fichero) {
      return fichero.exists();
   }

   /**
    * Metodo encargado de elimianr un fichero/directorio
    * @param nombre del fichero/directorio a elimina
    * @throws FicheroException error controlado
    */
   public void eliminar(String nombre) throws FicheroException {
      File fichero = new File(nombre);
      if (validarFichero(fichero)) {
         fichero.delete();
      } else {
         throw new FicheroException("No se puede eliminar un fichero que no existe");
      }
      
   }
   /**
    * Funcion que verifica si se trata de un directorio no
    * @param path de la ruta a validad
    * @return boolean Si/No se trata de un directorio
    */
   public boolean esDirectorio(String path) {
      File fichero = new File(path);
      return fichero.isDirectory();
   }
}
