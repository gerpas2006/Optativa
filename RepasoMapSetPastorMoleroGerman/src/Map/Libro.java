package Map;

public class Libro {

    private Long id;
    private String nombreLibro;
    private int numPaginas;

    public Libro(Long id, String nombreLibro, int numPaginas) {
        this.id = id;
        this.nombreLibro = nombreLibro;
        this.numPaginas = numPaginas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
