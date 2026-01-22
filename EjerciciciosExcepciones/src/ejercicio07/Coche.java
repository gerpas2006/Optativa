package ejercicio07;

public class Coche {

    private Long id;
    private String marca;
    private String matricula;

    public Coche(Long id, String marca, String matricula) {
        this.id = id;
        this.marca = marca;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
