
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.libros.Libro;

/**
 *
 * @author javier
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("Prueba 1", "Pedro Hernandez", 20, 3);
        System.out.println("Se va a hacer un prestamo del libro: " + libro.getTitulo());
        libro.prestar();
        libro.prestar();
        System.out.println(libro.toString());
        System.out.println("\nSe va a devolver un libro de: " + libro.getTitulo());
        libro.devolver();
        libro.devolver();
        libro.devolver();
        System.out.println(libro.toString());
        
        Libro libro1 = new Libro("Prueba 2", "Pepe Gonzalez", 50, 10);
        System.out.println("\nSe va a hacer un prestamo del libro: " + libro1.getTitulo());
        libro1.prestar();
        System.out.println(libro1.toString());
        System.out.println("\nSe va a devolver un libro de: " + libro1.getTitulo());
        libro1.devolver();
        System.out.println(libro1.toString());
    }
    
}
