package ejercicio11;

public class Programador extends Empresa{

    private double precioHorasExtras;

    public Programador(double sueldo, double precioHorasExtras) {
        super(sueldo);
        this.precioHorasExtras = precioHorasExtras;
    }

    public double getHorasEstras() {
        return precioHorasExtras;
    }

    public void setHorasEstras(double horasEstras) {
        this.precioHorasExtras = horasEstras;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "horasEstras=" + precioHorasExtras +
                '}';
    }

    public double calcularSueldo(double horasTrabajadas,double horasExtras){
        double resultado=0;
        resultado = super.calcularSueldo(horasTrabajadas)+(horasExtras*precioHorasExtras);
        return resultado;
    }
}
