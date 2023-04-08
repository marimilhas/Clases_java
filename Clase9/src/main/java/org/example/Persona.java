package org.example;
import java.time.LocalDateTime;

public class Persona {
    public String nombre;
    public String apellido;
    public LocalDateTime fechanac;

    public Persona(String nombrepers, String apellidopers){
        this.nombre = nombrepers;
        this.apellido = apellidopers;
    }
    public int obtener_edad(){
        return LocalDateTime.now().getYear() - this.fechanac.getYear();
    }
}
