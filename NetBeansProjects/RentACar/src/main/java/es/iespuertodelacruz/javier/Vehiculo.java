
package es.iespuertodelacruz.javier;

import static es.iespuertodelacruz.javier.Principal.modificarDatos;
import static es.iespuertodelacruz.javier.Principal.pedirDatos;
import es.iespuertodelacruz.javier.exceptions.DatosException;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Vehiculo{
    
    private final String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double litros;
    static ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public Vehiculo(String matricula, String marca, String modelo, String color, double litros) throws DatosException {
        if(matricula == " " || marca == " " || modelo == " " || color == " " || litros <= 0){
            throw new DatosException("Los valores no pueden ser vacios o los "
                    + "litros ser menor o igual a 0");
        }else{
            this.matricula = matricula;
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.litros = litros;
        }     
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != " "){
            this.marca = marca;
        }   
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != " "){
            this.modelo = modelo;
        }       
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color != " "){
            this.color = color;
        }
        
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        if(litros <= 0){
            this.litros = litros;
        }
       
    }
    
    /**
     * Metodo para agregar vehiculos a la lista de vehiculos
     * @param vehiculo
     */
    public static void addVehiculo(Vehiculo vehiculo) throws DatosException{
        if (vehiculos.isEmpty()) {
            vehiculos.add(vehiculo); 
        }else if(comprobarMatricula(vehiculo.getMatricula()) == false){
            vehiculos.add(vehiculo);
        }else{
            throw new DatosException("El vehiculo ya existe con esa matricula");
        }
    }
    
    /**
     * Metodo para comprobar si existe la matricula y no agregar el nuevo vehiculo
     * @param vehiculo
     */
    public static boolean comprobarMatricula(String matricula) {
        boolean existe = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){               
                existe = true;
            }
        }  
        return existe;
    }
    
    /**
     * Metodo que modifica un vehiculo mediante una matricula dada
     * @param matricula 
     */
    public boolean modificar(String matricula) throws DatosException{
        Vehiculo vehiculo = null;
        String datos[];       
        boolean modificado = false;
        if(comprobarMatricula(matricula)){    
            datos = modificarDatos();
            setMarca(datos[0]);
            setModelo(datos[1]);
            setColor(datos[2]);
            setLitros(Integer.parseInt(datos[3]));
            modificado = true;
        }else{
            throw new DatosException("El vehiculo no se encuentra");
        }

        return modificado;
    }
    
    /**
     * Metodo para eliminar vehiculos de la lista mediante una matricula dada
     * @param matricula 
     */
    public static boolean eliminar(String matricula){        
        boolean eliminado = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equals(matricula)){                    
                vehiculos.remove(i);
                eliminado = true;
            }
        }        
        return eliminado;
    }
    
    /**
     * Metodo para mostrar toda la lista de vehiculos
     */
    public void listar(){
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca +
                ", modelo=" + modelo + ", color=" + color + ", litros=" + litros + '}';
    }
    
    
    
}
