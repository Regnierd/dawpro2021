
package es.iespuertodelacruz.javier.poo.ii.ejercicio2;

/**
 *
 * @author Javi
 */
public class Satelites extends Astros{
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private Planetas planeta;

    public Satelites(double distanciaPlaneta, double orbitaPlanetaria, Planetas planeta,
            String nombre, double radio, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radio, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planeta = planeta;
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }
    
    
    
    public void muestra() {
        System.out.println("[Satelite: " + getNombre() + " Radio: " + getRadio()
                + " Rotación eje: " + getRotacionEje()+ " Masa: " + getMasa()
                + " Temperatura media: " + getTemperaturaMedia()
                + " Gravedad: " + getGravedad()
                + "Distancia planeta: " + getDistanciaPlaneta() 
                + "Órbita al planeta: " + getOrbitaPlanetaria() 
                + "Pertenece planeta: " + planeta.getNombre());
    }
    
}
