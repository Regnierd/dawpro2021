/*
 *  6.- Diseña un programa Java que cree un tipo enumerado para los meses del año. El programa debe realizar las siguientes operaciones:
 *   Crear una variable m del tipo enumerado y asignarle el mes de marzo. Mostrar por pantalla su valor.
 *   Asignar a la variable m, la cadena de texto "MARZO". Mostrar por pantalla el valor de la variable de tipo enumerado tras realizar la asignación.
 */
package Tarea1;


/**
 *
 * @author javier
 */
public class Ejercicio6 {
    
    //Enumerado de los meses.
    enum Meses {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
    }
    
    /**
     * Metodo principal donde se mostrara el enumerado de la variable mes.
     * @param args 
     */
    public static void main(String[] args){
        Meses mes = Meses.MARZO;
        System.out.println(mes);
    }
}
