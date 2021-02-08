
package es.iespuertodelacruz.javier.pagos;

import es.iespuertodelacruz.javier.animales.Diagnostico;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class Factura {
    private final String refFactura;
    private Diagnostico diagnostico;
    private ArrayList<ElementoFactura> elementoFacturas;

    public Factura(Diagnostico diagnostico) {
        this.refFactura = generarRefFactura();
        this.diagnostico = diagnostico;
        this.elementoFacturas = new ArrayList();
    }

    public String getRefFactura() {
        return refFactura;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<ElementoFactura> getElementoFacturas() {
        return elementoFacturas;
    }

    public void setElementoFacturas(ArrayList<ElementoFactura> elementoFacturas) {
        this.elementoFacturas = elementoFacturas;
    }

    @Override
    public String toString() {
        return "Factura{" + "refFactura=" + refFactura + ", diagnostico=" 
                + diagnostico + ", elementoFacturas=" + elementoFacturas + '}';
    }
    
    /**
     * Funcion para generar el refHistorico aleatoriamente.
     * @return String
     */
    public String generarRefFactura(){        
        Random aleatorio = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomRefFactura = "";
        int numero;
        int forma;
        
        //Forma para calcular el codigo
        forma = (int)(aleatorio.nextDouble()*letras.length()-1+0);
        //La cantidad maxima de numeros aleatorios 999 y sumamos 100 para mantener 3 numeros.
        numero = (int)(aleatorio.nextDouble()*999+100);
        //Concatenamos los numeros y letras
        randomRefFactura += letras.charAt(forma)+numero;
        return randomRefFactura;
    }
    
}
