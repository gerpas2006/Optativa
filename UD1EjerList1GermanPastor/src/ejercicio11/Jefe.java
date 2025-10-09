package ejercicio11;

public class Jefe extends Empresa{

    private double incentivo;

    public Jefe(double sueldo, double incentivo) {
        super(sueldo);
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "incentivo=" + incentivo +
                '}';
    }

    public double calcularSueldo(double horasTrabajadas,int trabajosTerminados){
        double resultado=0;
        resultado = super.calcularSueldo(horasTrabajadas)+(incentivo*trabajosTerminados);
        return resultado;

    }
}
