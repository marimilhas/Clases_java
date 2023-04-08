package Clase7.EjercicioCarrito;

public class DescuentoPorcentaje extends Descuento{
    @Override
    public float obtener_valor_descuento(float valor_compra) {
        return this.getValor_descuento() * valor_compra / 100;
    }
    @Override
    public float obtener_valor_compra_final(float valor_compra) {
        return valor_compra - this.obtener_valor_descuento(valor_compra);
    }
}
