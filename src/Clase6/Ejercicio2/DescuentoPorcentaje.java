package Clase6.Ejercicio2;

public class DescuentoPorcentaje extends Descuento{

    @Override
    public float obtener_descuento(float valor_base) {
        return this.getValor() * valor_base / 100;
    }

    @Override
    public float obtener_valor_final(float valor_base) {
        return valor_base - this.obtener_descuento(valor_base);
    }
}
