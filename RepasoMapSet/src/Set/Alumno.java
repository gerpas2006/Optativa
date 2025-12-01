package Set;

public class Alumno {

    private Long id;
    private String nombre;
    private double nota;

    public Alumno(Long id, String nombre, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.nota = nota;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
