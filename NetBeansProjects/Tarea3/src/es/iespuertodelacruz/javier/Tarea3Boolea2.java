
package es.iespuertodelacruz.javier;

/**
 *
 * @author javier
 */
public class Tarea3Boolea2 {
    /**
     * Función principal. 
     * @param args 
     */
     public static void main(String[] args) {
        //cambiar b por mostrar.
        boolean mostrar;

        mostrar=false;
        System.out.println("b es: "+mostrar);

        mostrar=true;
        System.out.println("b es: "+mostrar);

        //Un valor booleano puede contralar la sentencia if
        //Tabular el bloque if.
        if (mostrar){
         System.out.println("Esto si ejecutará.");
         }
        
        mostrar=false;
        if(mostrar == false){
             System.out.println("Esto no se ejecutará.");
         }
        
        //El resultado de un operador relacional es un valor booleano
        System.out.printf("10 > 9 es "+ (10 > 9));
    }
     /**
      * Se a cambiado la variable b por mostrar y mejoramos la estructura del if en bloque,
      * ya que estaba en una sola linea y puede ser dificil de entender.
      */
}
