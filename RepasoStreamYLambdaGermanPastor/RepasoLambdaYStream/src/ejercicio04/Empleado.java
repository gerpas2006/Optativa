package ejercicio04;

import java.time.LocalDate;

public class Empleado {

    private Long id;
    private String nombre;
    private String departamento;
    private double salario;
    private boolean activo;
    private double aniosAntiguedad;

    public Empleado(Long id, String nombre, double salario, String departamento, boolean activo, double aniosAntiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.activo = activo;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(double aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", activo=" + activo +
                ", aniosAntiguedad=" + aniosAntiguedad +
                '}';
    }
}
