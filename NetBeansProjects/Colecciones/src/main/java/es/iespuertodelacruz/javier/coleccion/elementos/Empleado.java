/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.coleccion.elementos;

/**
 *
 * @author Javi
 */
public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.sueldo = 2000;
    }

    @Override
    public String toString() {
        return "PruebasMapas{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}'+"\n";
    }
}
