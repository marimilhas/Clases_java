package org.example;
import lombok.*;

@Data
public class Persona {
    @NonNull
    private String nombre;
    @NonNull
    private int edad;
    @NonNull
    private int dni;

}
