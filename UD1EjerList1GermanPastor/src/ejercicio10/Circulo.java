package ejercicio10;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public double calcularArea(){
        double area =0,pi=3.14;
        area=pi*Math.pow(radio,2);
        return area;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }

}
