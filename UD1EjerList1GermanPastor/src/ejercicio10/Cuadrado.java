package ejercicio10;

public class Cuadrado extends Figura {

    private int numLados;
    private double longPorLado;

    public Cuadrado(double area, double volumen, int numLados, double longPorLado) {
        super(area, volumen);
        this.numLados = numLados;
        this.longPorLado = longPorLado;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public double getLongPorLado() {
        return longPorLado;
    }

    public void setLongPorLado(double longPorLado) {
        this.longPorLado = longPorLado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "numLados=" + numLados +
                ", longPorLado=" + longPorLado +
                '}';
    }

    public double calcularArea(){
       double area=super.getArea();
        area =numLados+longPorLado;
        return area;
    }

    public double calcularVolumen(){
        double volumen = super.getVolumen();
        volumen = Math.pow(longPorLado,3);
        return volumen;
    }
}
