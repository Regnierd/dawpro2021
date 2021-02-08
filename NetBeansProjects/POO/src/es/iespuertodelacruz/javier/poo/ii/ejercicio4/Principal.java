
package es.iespuertodelacruz.javier.poo.ii.ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList cuentas = new ArrayList();
        
        CuentaCorriente cuenta1 = new CuentaCorriente("ES20 65465432165458", 2500);
        CuentaAhorro cuenta2 = new CuentaAhorro(800, "ES20 45132878965465", 2000);
        CuentaCorriente cuenta3 = new CuentaCorriente("ES20 32146879865487", 5200);
        CuentaAhorro cuenta4 = new CuentaAhorro(900, "ES20 82163548351865", 7000);
        
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        
        mostrarCuentas(cuentas);
        
        System.out.println("Vamos a ingresar dinero en la cuenta 2");        
        cuenta2.ingresar(800);
        mostrarCuentas(cuentas);
        
        System.out.println("Vamos a retirar dinero de la cuenta 3");
        cuenta3.retirar(200);
        mostrarCuentas(cuentas);
        
        System.out.println("Vamos a realizar un traspaso de la cuenta 4 a la cuenta 1");
        cuenta4.traspasar(cuenta1, 1500);
        mostrarCuentas(cuentas);
        
    }
    
    public static void mostrarCuentas(ArrayList cuentas){
        for(int i = 0; i<cuentas.size();i++){
            System.out.println(cuentas.get(i));
        }
    }
}
