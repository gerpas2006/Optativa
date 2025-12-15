package TreeSet;

public class Animales {

    private Long id;
    private String nombreAnimal;
    private String especie;

    public Animales(Long id, String nombreAnimal, String especie) {
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "id=" + id +
                ", nombreAnimal='" + nombreAnimal + '\'' +
                ", especie='" + especie + '\'' +
                '}';
    }
}
