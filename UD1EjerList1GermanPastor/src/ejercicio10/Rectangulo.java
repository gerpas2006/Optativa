package ejercicio10;

public class Rectangulo extends Figura{

    private double base;
    private double altura;
    private double largo;

    public Rectangulo(double area, double volumen, double base, double altura, double largo) {
        super(area, volumen);
        this.base = base;
        this.altura = altura;
        this.largo = largo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", largo=" + largo +
                '}';
    }

    public double calcularArea(){
        double area=super.getArea();
        area=base*altura;
        return area;
    }

    public double calcularVolumen(){
        double volumen = super.getVolumen();
        volumen=largo*base*altura;
        return volumen;
    }


}
