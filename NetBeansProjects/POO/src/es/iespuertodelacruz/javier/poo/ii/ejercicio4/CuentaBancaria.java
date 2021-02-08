
package es.iespuertodelacruz.javier.poo.ii.ejercicio4;

/**
 *
 * @author Javi
 */
public abstract class CuentaBancaria {
    private String iban;
    private double saldo;
    private final int INTERESANUALBASICO = 3;

    public CuentaBancaria(String iban, double saldo) {
        if(iban == ""){
            System.out.println("Error. Ingrese un iban correcto");
        }else if(saldo < 0){
            System.out.println("Error. No puede tener un saldo menor a 0 ");
        }else{
            this.iban = iban;
            this.saldo = saldo;
        }    
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        if(iban == ""){
            System.out.println("Error. Ingrese un iban correcto");
        }else{
            this.iban = iban;
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            System.out.println("Error. No puede tener un saldo menor a 0");
        }else{
            this.saldo = saldo;
        }
        
    }

    public int getINTERESANUALBASICO() {
        return INTERESANUALBASICO;
    }
    
    public abstract double calcularIntereses();
    
    /**
     * Metodo para ingresar dinero a la cuenta
     * @param saldo
     * @return double
     */
    public void ingresar(double saldo){    
        if(saldo>0){
            setSaldo(getSaldo()+saldo);
        }
       
    }
    
    /**
     * Metodo para retirar dinero a la cuenta
     * @param saldo
     * @return double
     */
    public void retirar(double saldo){       
        if(saldo>0){
            setSaldo(getSaldo()-saldo);
        }
        
    }
    
    /**
     * Metodo para traspasar dinero a otra cuenta
     * @param cuenta
     * @param saldo 
     */
    public void traspasar(CuentaBancaria cuenta, double saldo){
        if(this.saldo <= saldo){
            System.out.println("Saldo insuficiente para traspasar a otra cuenta");
        }else{
            retirar(saldo);
            cuenta.ingresar(saldo);
        }
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "iban=" + iban + ", saldo=" + saldo + '}';
    }
    
    
}
