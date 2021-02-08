/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.cuentas;

/**
 *
 * @author javier
 */
public class Cuenta {
    String titular;
    double cantidad;

    public Cuenta() {
        
    }

    

    public Cuenta(String titular) {
        this.titular = titular;
        cantidad = 0;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * Funcion para ingresar dinero de la cuenta creada.
     * @param cantidad 
     */
    public void ingresar(double cantidad){
        
        if(cantidad > 0){
            this.cantidad = this.cantidad + cantidad;
        }
        
    }
    
    /**
     * Funcion para retirar dinero de la cuenta creada.
     * @param cantidad 
     */
    public void retirar(double cantidad){
        
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0D;
            System.out.println("No se puede retirar dinero porque tienes 0 euros");
        }else{
            this.cantidad -= cantidad;
        }
        
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
}
