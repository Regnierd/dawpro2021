/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author Javi
 */
public class Figura {
    float base, altura;

    /**
     * Constructor vacio.
     */
    public Figura() {
        base = 0;
        altura = 0;
    }

    /**
     * Constructor con los parametros.
     * @param base
     * @param altura 
     */
    public Figura(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getter/setter
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Metodo para calcular el area.
     * @return 
     */
    public float area(){
        return base*altura;
    }
    
    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
