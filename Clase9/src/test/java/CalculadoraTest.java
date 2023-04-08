import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar() {
        Calculadora calcu = new Calculadora();
        assertEquals(4, calcu.sumar(2, 2));
    }

    @Test
    void multiplicar() {
        Calculadora calcu = new Calculadora();
        assertEquals(10, calcu.multiplicar(5, 2));
    }

    @Test
    void multiplicarVarios(){
        Calculadora calcu = new Calculadora();
        assertAll(() -> assertEquals(10, calcu.multiplicar(5, 2)),
                () -> assertEquals(15, calcu.multiplicar(5, 3)));
    }
}