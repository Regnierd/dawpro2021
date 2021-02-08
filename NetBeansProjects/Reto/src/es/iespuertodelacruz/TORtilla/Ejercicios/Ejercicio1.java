/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.TORtilla.Ejercicios;

/**
 *
 * @author Javi
 */
public class Ejercicio1 {
    int numero;

    public Ejercicio1() {
    }

    
    public Ejercicio1(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
   public static String calcularPrimos(int numero){
        int primo = 2;
        try{
            if(numero == 1){
                System.out.println("1 = 1");//Si numero es 1 el resultado es 1
            } else if(numero <= 0){
                System.out.println("No se puede factorizar un numero menor que 0 o el 0.");
            }else{
                System.out.print(numero + " = ");
                while (numero != primo){
                    if (numero%primo == 0){
                        numero = numero / primo;
                        System.out.print(primo + " x ");
                    }else {
                        primo++;
                    }
                }
                System.out.println(primo); //Añade el ultimo numero primo porque sale del bucle sin visualizarlo.
            }
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Se ha ejecutado todo correctamente.");
        }
        return "";
    }
}
