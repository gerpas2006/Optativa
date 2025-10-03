package ejercicio10;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double area, double volumen, double radio) {
        super(area, volumen);
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
        double area = super.getArea(),pi=3.14;
        area=pi*Math.pow(radio,2);
        return area;
    }

}
