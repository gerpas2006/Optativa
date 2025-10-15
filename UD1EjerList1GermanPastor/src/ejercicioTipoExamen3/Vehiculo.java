package ejercicioTipoExamen3;

public class Vehiculo {

    private String matriculo;
    private double precioBaseDia;
    private boolean ocupado;
    private String nombre;
    private int diasAlquiler;
    private int numeroOcupantes;

    public Vehiculo(String matriculo, double precioBaseDia, String nombre, boolean ocupado, int diasAlquiler, int numeroOcupantes) {
        this.matriculo = matriculo;
        this.precioBaseDia = precioBaseDia;
        this.nombre = nombre;
        this.ocupado = ocupado;
        this.diasAlquiler = diasAlquiler;
        this.numeroOcupantes = numeroOcupantes;
    }

    public String getMatriculo() {
        return matriculo;
    }

    public void setMatriculo(String matriculo) {
        this.matriculo = matriculo;
    }

    public double getPrecioBaseDia() {
        return precioBaseDia;
    }

    public void setPrecioBaseDia(double precioBaseDia) {
        this.precioBaseDia = precioBaseDia;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matriculo='" + matriculo + '\'' +
                ", precioBaseDia=" + precioBaseDia +
                ", ocupado=" + ocupado +
                ", nombre='" + nombre + '\'' +
                ", diasAlquiler=" + diasAlquiler +
                ", numeroOcupantes=" + numeroOcupantes +
                '}';
    }

    public double calcularPVP(double limite,double porcentaje){
        double resul=0.0;
        resul= precioBaseDia*diasAlquiler;
        return resul;
    }


}
