package ejercicio11;

public class Empresa {

    private double sueldo;

    public Empresa(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "sueldo=" + sueldo +
                '}';
    }

    public double calcularSueldo(double horasTrabajadas){
        return sueldo*horasTrabajadas;
    }
}
