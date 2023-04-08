package Clase6.Ejercicio2;

public class DescuentoCero extends Descuento{
    @Override
    public float obtener_descuento(float valor_base) {
        return 0;
    }
    @Override
    public float obtener_valor_final(float valor_base) {
        return valor_base;
    }
}
