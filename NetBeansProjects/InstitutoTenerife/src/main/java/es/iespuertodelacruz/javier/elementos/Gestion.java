package es.iespuertodelacruz.javier.elementos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import es.iespuertodelacruz.javier.exceptions.ExceptionAula;
import es.iespuertodelacruz.javier.exceptions.ExceptionNota;
import es.iespuertodelacruz.javier.exceptions.ExceptionPersona;
import es.iespuertodelacruz.javier.exceptions.FicheroException;




public class Gestion {
    private HashMap<String, Alumno> alumnos;
    private HashMap<String, Profesor> profesores;
    private ArrayList<Aula> aulas;

    /**
     * Constructor por defecto
     */
    public Gestion() {
        this.alumnos = new HashMap<>();
        this.profesores = new HashMap<>();
        this.aulas = new ArrayList<>();
    }

    public HashMap<String,Alumno> getAlumnos() {
        return this.alumnos;
    }   

    public HashMap<String,Profesor> getProfesores() {
        return this.profesores;
    }

    public ArrayList<Aula> getAulas() {
        return this.aulas;
    }

    /**
     * Metodo para insertar alumnos a la lista alumnos
     * @param alumno que se va a insertar en la lista
     * @throws ExceptionPersona error controlado
     */
    public void insertar(Alumno alumno) throws ExceptionPersona{
        if(!existe(alumno)){
            alumnos.put(alumno.getDni(), alumno);
        }else{
            throw new ExceptionPersona("No se puede agregar el alumno a la lista porque ya existe");
        }
    }

    /**
     * Metodo para insertar profesores en la lista de profesores
     * @param profesor que se va a insertar en la lista
     * @throws ExceptionPersona error controlado
     */
    public void insertar(Profesor profesor) throws ExceptionPersona{
        if(!existe(profesor)){
            profesores.put(profesor.getDni(), profesor);
        }else{
            throw new ExceptionPersona("No se puede agregar el profesor a la lista porque ya existe");
        }
    }

    /**
     * Metodo para insertar aulas en la lista de aulas
     * @param aula que se va a insertar en la lista
     * @throws ExceptionAula error controlado
     */
    public void insertar(Aula aula) throws ExceptionAula{
        if(!existe(aula)){
            aulas.add(aula);
        }else{
            throw new ExceptionAula("No se puede agregar el aula en la lista porque ya existe");
        }
    }

    /**
     * Funcion que verifica si existe el alumno o no en la lista
     * @param alumno a verificar
     * @return true si existe, false si no existe en la lista
     */
    public boolean existe(Alumno alumno){
        return alumnos.containsKey(alumno.getDni());
    }

    /**
     * Funcion que verifica si existe el profesor o no en la lista
     * @param profesor a verificar
     * @return true si existe, false si no existe en la lista
     */
    public boolean existe(Profesor profesor){
        return profesores.containsKey(profesor.getDni());
    }

    /**
     * Funcion que verifica si existe el aula en la lista
     * @param aula a verificar
     * @return true si existe, false si no existe en la lista
     */
    public boolean existe(Aula aula){
        return aulas.contains(aula);
    }

    /**
     * Funcion que verifica si existe una nota de un alumno en la lista de alumnos 
     * @param alumno que verificar
     * @param nota que verificar
     * @return true si existe, false si no existe
     */
    public boolean existe(Alumno alumno, Nota nota){       
        boolean existe = false;
        if(alumno.getNotas().contains(nota)){
            existe = true;
        }
        return existe;
    }

    /**
     * Funcion que verifica si existe el aula en la lista del profesor
     * @param profesor que verificar
     * @param aula que verificar
     * @return true si existe, false si no existe
     */
    public boolean existe(Profesor profesor, Aula aula){       
        boolean existe = false;
        if(profesor.getAulas().contains(aula)){
            existe = true;
        }
        return existe;
    }

    /**
     * Metodo para asignarle un aula al profesor
     * @param profesor que se le va a asignar el aula
     * @param aula a asignar
     * @throws ExceptionAula
     */
    public void insertarAulaProfesor(Profesor profesor, Aula aula) throws ExceptionAula{       
        if(!existe(profesor, aula)){
            profesor.getAulas().add(aula);
        }else{
            throw new ExceptionAula("El aula ya esta asignada al profesor");
        }
        
    }

    /**
     * Metodo para asignarle una nota a un alumno
     * @param alumno que se le va asignar la nota
     * @param nota que asignar
     * @throws ExceptionNota
     */
    public void insertarNotaAlumno(Alumno alumno, Nota nota) throws ExceptionNota{
        if(!existe(alumno, nota)){
           alumno.getNotas().add(nota);
        }else{
            throw new ExceptionNota("La nota ya esta asignada al alumno");
        }
    }

    /**
     * Funcion para listar todos las notas de todos los alumnos
     * @return String
     */
    public String listarNotas(){
        StringBuilder lista = new StringBuilder();     
        for(Alumno alumno : alumnos.values()){          
            lista.append(alumno.getNombre() + ", " + alumno.getApellidos() + " ; " + alumno.getNotas().toString());
        }
        return lista.toString();
    }

    /**
     * Metodo para volcar a un fichero todas las notas de todos los alumnos
     * @param nombreFichero del fichero a crear
     * @throws FicheroException error controlado
     * @throws ExceptionPersona error controlado
     */
    public void volcarNotas(String nombreFichero) throws FicheroException{
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(nombreFichero);
            fichero.write(listarNotas());
        } catch (IOException e) {
            throw new FicheroException("Ha habido un error al volcar el alumno", e);
        } finally{
            if(fichero != null){
                try {
                    fichero.close();
                } catch (IOException ex) {
                    throw new FicheroException("Error al cerrar el fichero", ex);
                }
            }
        }
    }

    /**
     * Funcion para listar todas las notas de un solo alumno
     * @param dni del alumno a mostrar
     * @return String
     * @throws ExceptionPersona error controlado
     */
    public String listarNotas(String dni) throws ExceptionPersona{
        StringBuilder lista = new StringBuilder();        
        for(Alumno alumno : alumnos.values()){
            if(alumno.getDni().equals(dni)){
                lista.append(alumno.getNombre() + ", " + alumno.getApellidos() + " ; " + alumno.getNotas().toString());
            }else{
                throw new ExceptionPersona("El alumno con dni: " + dni + " no existe. ");
            }
            
        }
        return lista.toString();
    }

    /**
     * Metodo para volcar a un fichero todas las notas de todos los alumnos
     * @param nombreFichero del fichero a crear
     * @throws FicheroException error controlado
     * @throws ExceptionPersona error controlado
     * @throws IOException
     */
    public void volcarNotasPersona(String dni) throws FicheroException, IOException, ExceptionPersona{
        FileWriter fichero = null;
        try {
            for(Alumno alumno : alumnos.values()){
                if(alumno.getDni().equals(dni)){
                    fichero = new FileWriter(alumno.getNombre()+"_"+alumno.getApellidos()+".txt");//A SONARLINT NO LE GUSTA EL TRY-CATCH
                    fichero.write(listarNotas(dni));
                }else{
                    throw new FicheroException("El alumno con dni: " + dni + "no existe");
                }
            }        
        } catch (IOException e) {
            throw new FicheroException("Ha habido un error al volcar el alumno", e);
        } finally{
            if(fichero != null){
                try {
                    fichero.close();
                } catch (IOException ex) {
                    throw new FicheroException("Error al cerrar el fichero", ex);
                }
            }
        }
    }

    /**
     * Funcion para listar todas las notas por materia
     * @return un arraylist
     */
    public ArrayList<Nota> listadoNotasMateria(){
        ArrayList<Nota> listadoNotas = new ArrayList<>();
        for (Alumno alumno : alumnos.values()) {
            for(int i = 0; i<= alumno.getNotas().size()-1; i++){
                listadoNotas.add(alumno.getNotas().get(i)) ;
            }
        }
        return listadoNotas;
    }

    /**
     * Funcion que verifica si el fichero existe
     * @param file fichero que vamos a verificar
     * @return true si existe, false si no existe
     */
    public boolean validarFichero(File file){
        return file.exists();
    }   

}
