package es.iespuertodelacruz.javier.controlador;

import es.iespuertodelacruz.javier.api.Operacion;
import es.iespuertodelacruz.javier.exception.OperacionException;
import es.iespuertodelacruz.javier.modelo.OperacionModelo;

public class OperacionController {
    
    private static final char SUMA = '+';
    private static final char RESTA = '-';
    private static final char MULTIPLICACION = '*';
    private static final char DIVISION = '/';
    OperacionModelo operacionModelo;

    public OperacionController(){
        operacionModelo = new OperacionModelo();
    }

    /**
     * Merodo encargado de validar el objeto de operacion
     * @param operacion a validar
     * @throws OperacionException error controlado
     */
    public void validar(Operacion operacion) throws OperacionException{
        String mensaje = "";
        if(operacion == null){
            mensaje = "No se puede realizar la operacion con un objeto null";
            throw new OperacionException(mensaje);
        }
        if(operacion.getNumero1() < 0 ){
            mensaje = "El numero 1 deber de ser mayor o igual a 0";
        }
        if(operacion.getNumero2() < 0 ){
            mensaje = "El numero 1 deber de ser mayor o igual a 0";
        }
        if(String.valueOf(operacion.getOperando()).isEmpty()){
            mensaje = "El operador debe de estar relleno";
        }
        if(!mensaje.isEmpty()){
            throw new OperacionException(mensaje);
        }
    }

    /**
     * Funcion encargada de sumar dos numeros
     * @param operacion objeto a sumar 
     * @return double 
     * @throws OperacionException error controlado
     */
    public void operaciones(Operacion operacion, char operando) throws OperacionException{
        validar(operacion);
        if(operacion.getOperando() != operando){
            throw new OperacionException("Se esta intentando realizar una operacion incorrecto que no es " + operando);
        }
        
    }

    /**
     * Funcion encargada de sumar dos numeros
     * @param operacion objeto a sumar 
     * @return double 
     * @throws OperacionException error controlado
     */
    public double sumar(Operacion operacion) throws OperacionException{
        operaciones(operacion, SUMA);
        operacion.setResultado(operacion.getNumero1() + operacion.getNumero2());    
        return operacion.getResultado();
    }

    /**
     * Funcion encargada de restar dos numeros
     * @param operacion objeto a restar 
     * @return double 
     * @throws OperacionException error controlado
     */
    public double restar(Operacion operacion) throws OperacionException{
        operaciones(operacion, RESTA);
        operacion.setResultado(operacion.getNumero1() - operacion.getNumero2());     
        return operacion.getResultado();
    }

    /**
     * Funcion encargada de multiplicar dos numeros
     * @param operacion objeto a multiplicar 
     * @return double 
     * @throws OperacionException error controlado
     */
    public double multiplicar(Operacion operacion) throws OperacionException{
        operaciones(operacion, MULTIPLICACION);
        operacion.setResultado(operacion.getNumero1() * operacion.getNumero2());     
        return operacion.getResultado();
    }

    /**
     * Funcion encargada de dividr dos numeros
     * @param operacion objeto a dividr 
     * @return double 
     * @throws OperacionException error controlado
     */
    public double dividir(Operacion operacion) throws OperacionException{
        operaciones(operacion, DIVISION);
        if(operacion.getNumero2() == 0){
            throw new OperacionException("No se puede dividir por 0");
        }
        operacion.setResultado(operacion.getNumero1() / operacion.getNumero2());     
        return operacion.getResultado();
    }
}
