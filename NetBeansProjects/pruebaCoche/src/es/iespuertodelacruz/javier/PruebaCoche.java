package es.iespuertodelacruz.javier;

/**
 *
 * @author javier
 */
public class PruebaCoche {

    /**
     * Metodo principal para crear objetos de coche y llamar a los metodos de la clase coche.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensajeRespuesta;
        Coche cochePedro = new Coche("Pedro");
        System.out.println("Intentamos arrancar el coche");
        mensajeRespuesta=cochePedro.arrancar();
        System.out.println(mensajeRespuesta);
        
        System.out.println("Intentamos bajar el freno de mano");
        mensajeRespuesta=cochePedro.bajarFrenoDeMano();
        System.out.println(mensajeRespuesta);
   
        System.out.println("Intentamos mover el coche a la izquierda");
        mensajeRespuesta=cochePedro.moverIzquierda(3);
        System.out.println(mensajeRespuesta);
        
        System.out.println("Intentamos mover el coche a la derecha");
        mensajeRespuesta=cochePedro.moverDerecha(5);
        System.out.println(mensajeRespuesta);

        System.out.println(cochePedro.datosCoche());
        
        System.out.println("---------------------------------------");
        
        Coche cocheJose = new Coche("Jose");
        System.out.println("Intentamos arrancar el coche");
        mensajeRespuesta=cocheJose.arrancar();
        System.out.println(mensajeRespuesta);
        
        System.out.println("Intentamos bajar el freno de mano");
        mensajeRespuesta=cocheJose.bajarFrenoDeMano();
        System.out.println(mensajeRespuesta);
   
        
        System.out.println("Intentamos mover el coche a la derecha");
        mensajeRespuesta=cocheJose.moverDerecha(3);
        System.out.println(mensajeRespuesta);
        System.out.println(cocheJose.datosCoche());
        
    }
    
}
