package es.iespuertodelacruz.javier;
import java.util.ArrayList;


public class EjercicioArrays {
    static ArrayList<Float> aprobados;
    static ArrayList<Float> suspensos;
    static ArrayList<Float> calificaciones;
    static ArrayList<Float> listaClase;
    static ArrayList<Float> notas;
    static ArrayList<Float> practicas;
    static ArrayList<Float> estadistica;
    
    static int numeroAlumnos = 40;
    
    public static void main(String[] args) {    

        //Comprobamos el resultado del ejercicio   
        System.out.println("Lista de clase :" + crearListaAlumnos());
        System.out.println("Array de Notas :" + notas);
        
    }

    

    /**
     * Funcion que busca la nota mayor de la lista
     * @param maxNota a buscar
     * @return int
     * */
    public static float buscarNotaMayor(ArrayList<Float> control){
        float postEval = 0;
        float maxNota = 0;
        for(int i=0; i<control.size(); i++){
            float preEval = control.get(i);
            if (preEval >= postEval){
                maxNota = preEval;       
                postEval = maxNota;
            }
        }
        return postEval;
    }

    /**
     * Funcion que busca la nota menor de la lista
     * @param minNota a buscar
     * @return int
     */
    public static float buscarNotaMenor(ArrayList<Float> control){
        float postEval = 11;
        float minNota = 0;  
        for(int i=0; i<control.size(); i++){
            float preEval = control.get(i);
            if (preEval < postEval){
                minNota = preEval;
                postEval = minNota;
            }
        }
        return postEval;
    }

    /**
     * Metodo para crear la lista de alumnos desde el 1 al 40
     * @param numeroAlumnos de la lista
     */
    public static ArrayList<Float> crearListaAlumnos(){
        listaClase = new ArrayList<>();
        int contador = 0;
        for (int i = 0; i < numeroAlumnos; i++){
            contador = i+1;
            listaClase.add((float) contador);
        }
        return listaClase;
    }

    /**
     * Funcion para facilitar el indice minimo de las notas
     * @return int
     */
    public static int indiceMinimo(ArrayList<Float> control){       
        notas = control;
        int indMinNota = notas.indexOf(buscarNotaMenor(control));
        return indMinNota;
    }

    /**
     * Funcion para facilitar el indice maximo de las notas
     * @return int
     */
    public static int indiceMaximo(ArrayList<Float> control){
        notas = control;
        int indMaxNota = notas.indexOf(buscarNotaMayor(control));
        return indMaxNota;
    }

    /**
     * Metodo encargado para crear el vector de calificaciones
     */
    public static ArrayList<Float> vectores(ArrayList<Float> control, ArrayList<Float> practicas){
        calificaciones = new ArrayList<>();
        for(int i = 0; i<control.size(); i++){
            float vector = (((float) control.get(i) + (float) practicas.get(i)) / 2);
            calificaciones.add(vector);
        }
        return calificaciones;
        //System.out.println("Prácticas      :" + practicas.toString());
        //System.out.println("Calificaciones :" + calificaciones.toString());
    }

    /**
     * Metodo encargado de agregar a la lista las estadisticas de las calificaciones
     * @param control
     */
    public static String estadisticas(ArrayList<Float> calificaciones, ArrayList<Float> control){ 
        estadistica = new ArrayList<>();
        double solucion = 0;
        String tramo = "";
        int i;
        for (i=0; i<10; i++){
            float contador = 0;
            float suma = 0;
            for (int j=0; j<control.size(); j++){
                if ((i < calificaciones.get(j)) && ((i+1) >= calificaciones.get(j) )) {
                    suma += calificaciones.get(j);
                    contador += 1;
                }
            }
            if (contador != 0){
                float resultado = ( (float)contador / control.size());
                estadistica.add(resultado);
            }else{ 
                estadistica.add(0f);
            }
            solucion = (Math.round(estadistica.get(i) * 10000.0)) / 100.0;
            tramo += "Estadística nota tramo <=" + (i+1) + " = " + solucion + "%" + "\n";
        }
        return tramo;
    }

    /**
     * Metodo encargado de separar los aprobados en una listas sin 0
     * @param listaAprobados
     */
    public static ArrayList<Float> resumenAprobados(ArrayList<Float> listaAprobados){
        int i = 0;      
        ArrayList<Float> resumenAprobados = new ArrayList<>();
    
        while(i < listaAprobados.size()){
            if(listaAprobados.get(i) != 0){
                resumenAprobados.add(listaAprobados.get(i));               
                i++;           
            }else{
                i++; 
            }
        }   
    
        return resumenAprobados;
    }

    /**
     * Metodo encargado de separar los suspendidos en una listas sin 0
     * @param listaAprobados
     */
    public static ArrayList<Float> resumenSuspendidos(ArrayList<Float> listaSuspendidos){
        int i = 0;
        ArrayList<Float> resumenSuspensos = new ArrayList<>();
        while(i < listaSuspendidos.size()){
            if(listaSuspendidos.get(i) != 0){
                resumenSuspensos.add(listaSuspendidos.get(i));              
                i++;              
            }else{ 
                i++;
            }
        }
        
        return resumenSuspensos;
    }

    /**
     * Metodo que crea una lista con 40 alumnos, se agregan solo 31 notas
     * y hay que insertar un nueva nota en la posicion 4 de la lista
     */
    public static void insertarNuevaCalificacionPosicionCuatro(ArrayList<Float> calificaciones){      
        for (int j=0; j<31; j++){
            float numeroAleatorio = (int)(Math.random()*11);
            calificaciones.add(numeroAleatorio);
            
        }
        System.out.println("Nota antigua alumno nº4: " + calificaciones.get(3)); 
        calificaciones.set(3, (float) 6);
        System.out.println("Nota nueva alumno nº4: " + calificaciones.get(3));
    }

    /**
     * Metodo para listar las notas de los aprobados
     * por numero de lista
     */
    public static void listarAprobados(ArrayList<Float> notas){
        //Aprobados y suspensos
        calificaciones = notas;
        aprobados = new ArrayList<>();

        for (int i=0; i<notas.size(); i++){
            if (calificaciones.get(i) >= 5){
                aprobados.add((float) calificaciones.indexOf(i));            
            }else{ 
                aprobados.add(0f);              
            }
        }    

        System.out.println("Relación de aprobados por nº de lista: " 
                + aprobados.toString());
        
    }

    /**
     * Metodo para listar las notas de los suspendidos
     * por numero de lista
     */
    public static void listarSuspendidos(ArrayList<Float> notas){
        //Aprobados y suspensos
        calificaciones = notas;
        suspensos = new ArrayList<>();
        
        for (int i=0; i<notas.size(); i++){
            if (calificaciones.get(i) < 5){
                suspensos.add((float)calificaciones.indexOf(i));            
            }else{ 
                suspensos.add(0f);              
            }
        }           
        System.out.println("Relación de suspensos por nº de lista: " 
                + suspensos.toString());
    }

    

    /**
     * Metodo encargado para crear la lista de notas practicas
     */
    public static ArrayList<Float> crearNotasPracticas(){
        //creamos el array de notas "practicas"
        practicas = new ArrayList<>();
        for(int i=0; i < numeroAlumnos; i++){
            float numeroAleatorio = (int)(Math.random()*11);
            practicas.add(numeroAleatorio);
        }
        return practicas; 
    }


}