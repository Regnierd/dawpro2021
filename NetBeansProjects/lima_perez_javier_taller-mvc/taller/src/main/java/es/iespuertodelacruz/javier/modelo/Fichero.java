package es.iespuertodelacruz.javier.modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class Fichero {
   private static final String RETORNO_CARRO = "\n";
   private static final String NOMBRE_FICHERO = "Fichero-vehiculos.txt";
   private static final String SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO = "Se ha producido un error en el volcado del fichero";

   /**
    * Metodo encargado de almacenar un vehiculo en el fichero
    * 
    * @param vehiculo a insertar
    * @throws FicheroException mensaje controlado
    */
   public void insertar(Vehiculo vehiculo) throws FicheroException {
      ArrayList<Vehiculo> listado;
      listado = obtenerListado();
      listado.add(vehiculo);
      String cadena = "";
      try {
         for (Vehiculo vehiculo2 : listado) {
            cadena += vehiculo2.getMatricula() + "," + vehiculo2.getMarca() + "\n";
         }
         crear(NOMBRE_FICHERO, cadena);
      } catch (FicheroException e) {
         throw new FicheroException(SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO, e);
      }
   }

   /**
    * Metodo encargado de eliminar un vehiculo del fichero
    * 
    * @param vehiculo
    * @throws FicheroException mensaje controlado
    */
   public void eliminar(Vehiculo vehiculo) throws FicheroException {
      ArrayList<Vehiculo> listado;
      listado = obtenerListado();
      listado.remove(vehiculo);
      String cadena = "";
      try {
         for (Vehiculo vehiculo2 : listado) {
            cadena += vehiculo2.getMatricula() + "," + vehiculo2.getMarca() + "\n";
         }
         crear(NOMBRE_FICHERO, cadena);
      } catch (FicheroException e) {
         throw new FicheroException(SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO, e);
      }

   }

   /**
    * Metodo encargado de modificar un elemento del fichero
    * 
    * @param vehiculoAlmacenado elemento a actualizar
    * @param vehiculo           elemento con la informacion actualizada
    * @throws FicheroException mensaje controlado
    */
   public void modificar(Vehiculo vehiculoAlmacenado, Vehiculo vehiculo) throws FicheroException {
      ArrayList<Vehiculo> listado = obtenerListado();
      int posicion = -1;
      posicion = listado.indexOf(vehiculoAlmacenado);
      listado.remove(posicion);
      listado.add(posicion, vehiculo);
      String cadena = "";
      try {
         for (Vehiculo vehiculo2 : listado) {
            cadena += vehiculo2.getMatricula() + "," + vehiculo2.getMarca() + "\n";
         }
         crear(NOMBRE_FICHERO, cadena);
      } catch (FicheroException e) {
         throw new FicheroException(SE_HA_PRODUCIDO_UN_ERROR_EN_EL_VOLCADO_DEL_FICHERO, e);
      }

   }

   /**
    * Funcion encargada de obtener el listado de vehiculos del fichero
    * 
    * @return listado de vehiculos
    * @throws FicheroException mensaje controlado
    */
   public ArrayList<Vehiculo> obtenerListado() throws FicheroException {
      ArrayList<Vehiculo> lista = new ArrayList<>();
      File fichero = null;
      Scanner scanner = null;
      try {
         fichero = new File(NOMBRE_FICHERO);
         if (validarFichero(fichero) == false) {
            throw new FicheroException("El fichero a leer no existe");
         }
         scanner = new Scanner(fichero);

         while (scanner.hasNextLine()) {
            String linea = scanner.nextLine(); // Guardamos la linea en un String
            if (!linea.isEmpty()) {
               Vehiculo vehiculo = new Vehiculo(linea);
               lista.add(vehiculo);
            }
         }
      } catch (FicheroException e) {
         throw e;
      } catch (Exception e) {
         throw new FicheroException("Se ha producido un error en la lectura del fichero", e);
      } finally {
         if (scanner != null) {
            scanner.close();
         }
      }
      return lista;
   }

   /**
    * Funcion encargada de leer un fichero
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
      } catch (Exception e) {
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
    * 
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
    * 
    * @param fichero que se valida
    * @return true si existe, false si no existe
    */
   public boolean validarFichero(File fichero) {
      return fichero.exists();
   }

   /**
    * Metodo encargado de elimianr un fichero/directorio
    * 
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
    * 
    * @param path de la ruta a validad
    * @return boolean Si/No se trata de un directorio
    */
   public boolean esDirectorio(String path) {
      File fichero = new File(path);
      return fichero.isDirectory();
   }
}
