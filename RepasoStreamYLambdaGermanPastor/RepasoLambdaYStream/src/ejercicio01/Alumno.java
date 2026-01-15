package ejercicio01;

public class Alumno {
    int id;
    private String nombre;
    private String apellido;
    private String nombreCurso;
    private double notaMedia;
    private int edad;

    public Alumno(String nombre, String apellido, String nombreCurso, double notaMedia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCurso = nombreCurso;
        this.notaMedia = notaMedia;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
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
