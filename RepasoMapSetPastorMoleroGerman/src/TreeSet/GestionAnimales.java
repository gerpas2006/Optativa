package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class GestionAnimales {

    TreeSet<Animales> animales;

    public GestionAnimales(TreeSet<Animales> animales) {
        this.animales = animales;
    }

    public TreeSet<Animales> getAnimales() {
        return animales;
    }

    public void setAnimales(TreeSet<Animales> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "GestionAnimales{" +
                "animales=" + animales +
                '}';
    }

    public void agregarAnimal(Animales animal) {
        animales. add(animal);
    }

    public Animales buscarPorId(Long id) {
        for (Animales animal : animales) {
            if (animal. getId().equals(id)) {
                return animal;
            }
        }
        return null;
    }

    public void listarTodos() {
        for (Animales animal : animales) {
            System.out. println(animal);
        }
    }

    public void actualizarAnimal(Long id, String nuevoNombre, String nuevaEspecie) {
        Animales animal = buscarPorId(id);
        animal.setNombreAnimal(nuevoNombre);
        animal.setEspecie(nuevaEspecie);
    }

    public void eliminarAnimal(Long id) {
        Animales animal = buscarPorId(id);
        animales.remove(animal);
    }

    public TreeSet<Animales> buscarPorEspecie(String especie) {
        TreeSet<Animales> resultado = new TreeSet<>(Comparator. comparing(Animales::getId));
        for (Animales animal : animales) {
            if (animal.getEspecie(). equalsIgnoreCase(especie)) {
                resultado.add(animal);
            }
        }
        return resultado;
    }

    public Long numAnimales(){
        return animales.stream().count();
    }


}
