
package es.iespuertodelacruz.javier.poo.ii.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Planetas extends Astros{
    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelite;
    private ArrayList<Satelites> satelites;

    public Planetas(double distanciaSol, double orbitaSol, boolean tieneSatelite,
            ArrayList<Satelites> satelites, String nombre, double radio, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radio, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelite = tieneSatelite;
        this.satelites = satelites;
    }

    public Planetas(double distanciaSol, double orbitaSol, String nombre, 
            double radio, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radio, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelite = false;
        this.satelites = new ArrayList();
    }
    
    

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelite() {
        return tieneSatelite;
    }

    public void setTieneSatelite(boolean tieneSatelite) {
        this.tieneSatelite = tieneSatelite;
    }

    public ArrayList<Satelites> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelites> satelites) {
        this.satelites = satelites;
    }
    
    /**
     * Metodo para agregar satelites a la lista
     * @param s 
     */
    public void añadirSatelite(Satelites s) {
        satelites.add(s);
        this.tieneSatelite = true;
    }

    
    
    public void muestra() {       
        System.out.println("[Planeta: " + this.getNombre() + " Radio = " + this.getRadio() 
                + " Rotacion eje: " + this.getRotacionEje()+ " Temperatura media: "
                + this.getTemperaturaMedia() + " Gravedad: " + this.getGravedad()
                + " Distancia al sol: " + this.getDistanciaSol() + " Orbita al sol: "
                + this.getOrbitaSol() + " Tiene satelites: " + this.isTieneSatelite()+ "]");
        if (tieneSatelite) {
            for (int i = 0; i < getSatelites().size(); i++) {
                System.out.println("  - Satélite " + i + ": " + this.getSatelites().get(i).getNombre());
            }
        }
    }
  
    

    
}
