
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.excepciones.LongitudException;
import es.iespuertodelacruz.javier.excepciones.MailException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class CompruebaEmail {

    static int arroba = 0;		
    static boolean punto = false;
    
    public static void main(String[] args) throws LongitudException, MailException {
        String email = JOptionPane.showInputDialog("Introduce email");

        if (arroba == 1 && punto) {
            System.out.println("El email es correcto");

        } else {
            evaluarError(arroba, punto);
        }
        
    
    }
    
    /**
     * Metodo para evaluar cual es el error del mail.
     * @param arroba numero de @ encontrados en la cadena
     * @param punto devuelve true o false
     * @throws MailException 
     */
    private static void evaluarError(int arroba, boolean punto) throws MailException{
        String mensaje = "";
        if(arroba > 1 || arroba < 0){
            mensaje = "Tiene que tener un @";
        }
        if(punto == false){
            mensaje += "Tiene que tener punto";
        }
        
        throw new MailException(mensaje);
    }
    
    private static void evaluarMail(String email){
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                    arroba++;
            }else if(email.charAt(i) == '.'){
                    punto = true;
            }
        }
    }
    
}
