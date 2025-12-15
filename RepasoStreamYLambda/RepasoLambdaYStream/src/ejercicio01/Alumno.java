package ejercicio01;

public class Alumno {

    private Long id;
    private String nombre;
    private String apellido;
    private String nombreCurso;
    private double notaMedia;
    private int edad;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Alumno(Long id, String nombre, String apellido, String nombreCurso, double notaMedia, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCurso = nombreCurso;
        this.notaMedia = notaMedia;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", notaMedia=" + notaMedia +
                ", edad=" + edad +
                '}';
    }
}
