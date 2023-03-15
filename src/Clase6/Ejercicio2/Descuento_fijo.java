package Clase6.Ejercicio2;

public class Descuento_fijo extends Descuento {

    @Override
    public float obtenerdescuento(float valorbase) {
        return this.getValor();
    }

    @Override
    public float obtenervalorfinal(float valorbase) {
        return valorbase - this.obtenerdescuento(valorbase);
    }
}
