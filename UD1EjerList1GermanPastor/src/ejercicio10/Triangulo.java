package ejercicio10;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(double area, double volumen, double base, double altura) {
        super(area, volumen);
        this.base = base;
        this.altura = altura;
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

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double calcuarArea(){
        double area = getArea();
        area=(base*altura)/2;
        return area;
    }

    public double calcularVolumen(){
        double volumen = super.getVolumen();
        volumen= this.calcuarArea()*altura;
        return volumen;
    }
}
