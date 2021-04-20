package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exceptions.CuentaException;

public class Principal {
    public static void main(String[] args) throws CuentaException {
        Cuenta cuenta = new Cuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        System.out.println("El saldo actual es"+ cuenta.getSaldo());
        gestionCuenta(cuenta);
   
    }

    /**
     * Metodo para gestionar la cuenta, ingresar y retirar dinero 
     * @param cuenta del usuario
     * @throws CuentaException error controlado
     */
    public static void gestionCuenta(Cuenta cuenta) throws CuentaException{     
        try {
            System.out.println("Retira en cuenta");
            cuenta.retirar(2300);
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (CuentaException e) {
            throw new CuentaException("Error a la hora de gestionar la cuenta ");
        }
    }
}
