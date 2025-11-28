package Set;

public class Recetas {

    private Long id;
    private String nombreReceta;
    private double tiempoPreparacion;
    private int numeroIngredientes;

    public Recetas(Long id, String nombreReceta, double tiempoPreparacion, int numeroIngredientes) {
        this.id = id;
        this.nombreReceta = nombreReceta;
        this.tiempoPreparacion = tiempoPreparacion;
        this.numeroIngredientes = numeroIngredientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public void setNumeroIngredientes(int numeroIngredientes) {
        this.numeroIngredientes = numeroIngredientes;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    @Override
    public String toString() {
        return "Recetas{" +
                "id=" + id +
                ", nombreReceta='" + nombreReceta + '\'' +
                ", tiempoPreparacion=" + tiempoPreparacion +
                ", numeroIngredientes=" + numeroIngredientes +
                '}';
    }
}
