package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void obtener_edad() {
        Persona persona = new Persona("Mariana", "Milhas");
        persona.fechanac = LocalDateTime.parse("2003-08-08T00:00" + ":00");
        assertEquals(20, persona.obtener_edad());
    }
}