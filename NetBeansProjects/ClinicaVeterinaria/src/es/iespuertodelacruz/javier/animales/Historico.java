
package es.iespuertodelacruz.javier.animales;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class Historico {
    private final String refHistorico;
    private Animal animal;
    private ArrayList<ElementoHistorico> elementosHistoricos;

    public Historico(Animal animal) {       
        this.refHistorico = generarRefHistorico();
        this.animal = animal;
        this.elementosHistoricos = new ArrayList();     
    }

    public String getRefHistorico() {
        return refHistorico;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public ArrayList<ElementoHistorico> getElementosHistoricos() {
        return elementosHistoricos;
    }

    public void setElementosHistoricos(ArrayList<ElementoHistorico> elementosHistoricos) {
        this.elementosHistoricos = elementosHistoricos;
    }

    @Override
    public String toString() {
        return "Historico{" + "refHistorico=" + refHistorico + "\n animal=" +
                animal + " elementosHistoricos=" + elementosHistoricos + '}';
    }
    
    /**
     * Funcion para generar el refHistorico aleatoriamente.
     * @return String
     */
    public String generarRefHistorico(){        
        Random aleatorio = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomRefHistorico = "";
        int numero;
        int forma;
        
        //Forma para calcular el codigo
        forma = (int)(aleatorio.nextDouble()*letras.length()-1+0);
        //La cantidad maxima de numeros aleatorios 999 y sumamos 100 para mantener 3 numeros.
        numero = (int)(aleatorio.nextDouble()*999+100);
        //Concatenamos los numeros y letras
        randomRefHistorico += letras.charAt(forma)+numero;
        return randomRefHistorico;
    }

    
    
    
    
    
}
