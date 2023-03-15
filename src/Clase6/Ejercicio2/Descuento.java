package Clase6.Ejercicio2;

public abstract class Descuento {
    private float valor;

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public abstract float obtenerdescuento(float valorbase);
    public abstract float obtenervalorfinal(float valorbase);
}
