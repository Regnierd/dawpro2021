package es.iespuertodelacruz.javier.elementos;

import java.io.File;
import java.util.Scanner;

import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class LecturaFichero extends Fichero {

    private static final String RETORNO_CARRO = "\n";

    /**
     * Funcion encargada de leer un fichero
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
}
