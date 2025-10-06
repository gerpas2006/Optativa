package ejercicio10;

public class Cuadrado extends Figura {

    private int numLados;
    private double longPorLado;

    public Cuadrado(int numLados, double longPorLado) {

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
       double area=0;
        area =numLados+longPorLado;
        return area;
    }

    public double calcularVolumen(){
        double volumen = 0;
        volumen = Math.pow(longPorLado,3);
        return volumen;
    }
}
