
package es.iespuertodelacruz.javier.persona;

/**
 *
 * @author javier
 */
public class Persona {
    String nombre;
    int edad;
    String dni;
    char sexo;
    double peso;
    double altura;
    
    //Constructores
    public Persona() {
        nombre = "";
        edad = 0;
        peso = 0;
        altura = 0;
        dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
        this.peso = 0;
        this.altura = 0;
        
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getter/setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return dni;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Funcion para calcular el imc.
     * @return double
     */
    public int imc(){    
        double imc = peso/Math.pow(altura, 2);
        int temporal = 0;
        if(imc < 20){
            temporal = -1;
        }else if(imc >= 20 && imc <= 25){
            temporal =  0;
        }else if(imc > 25){
            temporal = 1;
        }
        return temporal;
    }
    
    /**
     * Funcion para mostrar en pantalla el diagnostico del peso.
     */
    public void diagnostico(){
        if(imc() == -1){
            System.out.println("Esta por debajo de su peso ideal");
        }else if(imc() == 0){
            System.out.println("Estas en el peso ideal");
        }else if(imc() == 1){
            System.out.println("Tiene sobrepeso");
        }
    }
    /**
     * Funcion para saber si es mayor de edad
     * @return boolean
     */
    public boolean esMayorDeEdad(){
        boolean mayorEdad = false; 
        if(edad >= 18){
            mayorEdad = true;
        }
        return mayorEdad;
    }
    
    /**
     * Funcion para comprobar si el sexo introducido es correcto o no, y si no
     * lo es se le asigna H.
     * @return char
     */
    private char comprobarSexo(char sexo) {
        char genero = 'H';
        if (sexo == 'M' || sexo == 'H' || sexo == 'm' || sexo == 'h') {
           genero = sexo;
        } 
        return genero;
    }
    
    /**
     * Funcion para generar un dni aleatorio con su letra correspondiente.
     * @return String
     */
    private String generarDNI(){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";        
        int numeroAleatorio = (int)(Math.random()*100000000+1);
        int resto = numeroAleatorio%23;
        return "" + numeroAleatorio + caracteres.charAt(resto);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
}
