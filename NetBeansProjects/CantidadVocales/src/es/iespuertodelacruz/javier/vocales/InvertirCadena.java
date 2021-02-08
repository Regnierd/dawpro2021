
package es.iespuertodelacruz.javier.vocales;

/**
 *
 * @author javier
 */
public class InvertirCadena {
    String cadena;
    
    //Constructores
    public InvertirCadena() {
        cadena = "";
    }

    public InvertirCadena(String cadena) {
        this.cadena = cadena;
    }
    //Getter/setters
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    /**
     * Funcion que invierte una cadena y la imprime
     */
    public String invertir(){
        char caracter = ' ';
        System.out.print("La cadena invertida es: ");
        for(int i = cadena.length()-1; i >= 0; i--){
            caracter = cadena.charAt(i);
            System.out.print(caracter);
        }
        return "";
    }
    
}
