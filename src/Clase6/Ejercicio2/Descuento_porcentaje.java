package Clase6.Ejercicio2;

public class Descuento_porcentaje extends Descuento {
    @Override
    public float obtenerdescuento(float valorbase) {
        return this.getValor() * valorbase ;
    }

    @Override
    public float obtenervalorfinal(float valorbase) {
        return valorbase - this.obtenerdescuento(valorbase);
    }
}
