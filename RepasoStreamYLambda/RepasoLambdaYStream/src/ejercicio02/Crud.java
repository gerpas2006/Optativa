package ejercicio02;

import java.util.List;
import java.util.stream.Collectors;

public class Crud {

    List<Cadenas> lista;

    public Crud(List<Cadenas> lista) {
        this.lista = lista;
    }

    public List<Cadenas> getLista() {
        return lista;
    }

    public void setLista(List<Cadenas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Crud{" +
                "lista=" + lista +
                '}';
    }

    public List<Cadenas> ordenar(){
        return lista.stream().sorted().toList();
    }

    public List<Cadenas> buscarPorNombre(String nombre){
        return lista.stream().filter(a -> a.getCadena().equalsIgnoreCase(nombre)).toList();
    }

    public String crearString() {
        return lista.stream()
                .map(sc -> String.valueOf(sc.getCadena().charAt(0)))
                .collect(Collectors.joining());
    }
    
    public void eliminarLasCadenasImpares(){
        lista.removeIf(a -> a.getCadena().length()%2==0);
    }

    public List<String> pasarMayusculas(){
        return lista.stream().map(a -> a.getCadena().toUpperCase()).toList();
    }
}
