package Clase6.Ejercicio2;

public abstract class Descuento {
    private float valor;

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public abstract float obtener_descuento(float valor_base);
    public abstract float obtener_valor_final(float valor_base);
}
