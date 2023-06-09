package Clase6.Ejercicio1;

public class Rectangulo extends Figura implements Dibujable{
    private double lado_a;
    private double lado_b;

    public double getLado_a() {
        return lado_a;
    }
    public void setLado_a(double lado_a) {
        this.lado_a = lado_a;
    }

    public double getLado_b() {
        return lado_b;
    }
    public void setLado_b(double lado_b) {
        this.lado_b = lado_b;
    }

    @Override
    public double calcularArea() {
        return lado_a * lado_b;
    }

    @Override
    public double calcularPerimetro() {
        return lado_a * 2 + lado_b * 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un rectángulo.");
    }
}
