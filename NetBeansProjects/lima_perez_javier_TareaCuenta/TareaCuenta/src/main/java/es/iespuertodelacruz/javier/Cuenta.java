
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exceptions.CuentaException;

public class Cuenta {


    private String nombre;
    private String numero;
    private double saldo;
    private double tipoInteres;

    //Constructor por defecto
    public Cuenta(){
    }

    /**
     * Constructor con todos los parametros de la clase
     * @param nombre del usuario
     * @param numero del usuario
     * @param saldo del usuario
     * @param tipoInteres del usuario
     */
    public Cuenta(String nombre, String numero, double saldo, double tipoInteres){
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void asignarNombre(String nombre){
        setNombre(nombre);
    }

    /**
     * Funcion encargada de obtener el nombre del usuario
     * @return String
     */
    public String obtenerNombre(){
        return getNombre();
    }

    /**
     * Funcion encargada de devolver el estado del saldo del usuario
     * @return double
     */
    public double estado(){
        return saldo;
    }

    /**
     * Metodo encargado de ingresar una cantidad a la cuenta del usuario
     * @param cantidad a ingresar
     * @throws CuentaException error controlado
     */
    public void ingresar(double cantidad) throws CuentaException{
        if (cantidad<0){
            throw new CuentaException("No se puede ingresar una cantidad negativa");
        }else{
            this.saldo += cantidad;
        }
        
    }

    /**
     * Metodo encargado de retirar una cantidad de la cuenta del usuario
     * @param cantidad a retirar
     * @throws CuentaException error controlado
     */
    public void retirar(double cantidad) throws CuentaException
    {
        if (cantidad <= 0){
            throw new CuentaException ("No se puede retirar una cantidad negativa");
        }else if(estado()< cantidad){
            throw new CuentaException ("No hay suficiente saldo");
        }else{
            saldo -= cantidad;
        }
          
    }

    /**
     * Funcion encargada de devolver el numero de la cuenta del usuario
     * @return String
     */
    public String obtenerCuenta(){
        return numero;
    }


    
}

