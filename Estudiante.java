package modelo;

/**
 *
 * @author José Barra
 */
public class Estudiante {
    
    //Atributos
    String nombre;
    String matricula;
    String carrera;
    String correo;
    
    //Constructor vacío
    public Estudiante() {
    }
    
    //Constructor lleno
    public Estudiante(String nombre, String matricula, String carrera, String correo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.correo = correo;
    }
    
    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
}
