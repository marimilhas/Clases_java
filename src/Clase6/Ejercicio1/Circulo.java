package Clase6.Ejercicio1;

public class Circulo extends Figura implements Dibujable{
    private double radio;

    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un círculo.");
    }
}
