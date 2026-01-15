package ejercicio03;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PlayList {

    private List<Cancion> listaCanciones;

    public PlayList(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "listaCanciones=" + listaCanciones +
                '}';
    }

    public List<Cancion> buscarPorNombre (String nombre){
        return listaCanciones.stream().filter(c -> c.getNombre().equalsIgnoreCase(nombre)).toList();
    }

    public List<Cancion> buscarPorAutor(String autor){
        return listaCanciones.stream().filter(c -> c.getAutor().equalsIgnoreCase(autor)).toList();
    }

    public List<Cancion> buscarPorDuracion (double duracion){
        return listaCanciones.stream().filter(c -> c.getDuracion()==duracion).toList();
    }

    public List<Cancion> buscarPorGenero(Generos genero){
        return listaCanciones.stream().filter(c -> c.getGeneros().equals(genero)).toList();
    }

    public List<Cancion> buscarPorDuracionDada(double duracion){
        return listaCanciones.stream().filter(c -> c.getDuracion()>duracion).toList();
    }
    public Long autoresDistintos(){
        return listaCanciones.stream().map(Cancion::getAutor).distinct().count();
    }
}
