package ejercicio10;

public class Figura {

    private double area;
    private double volumen;

    public Figura(double area, double volumen) {
        this.area = area;
        this.volumen = volumen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "area=" + area +
                ", volumen=" + volumen +
                '}';
    }


}
