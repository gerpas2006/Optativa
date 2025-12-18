package ejercicio02;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Crud {

    private List<String> lista;

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public Crud(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Crud{" +
                "lista=" + lista +
                '}';
    }

    public void devolverTodo(){
        lista.stream().forEach(a -> {
            System.out.println(a);
        });
    }
    public List<String> ordenar(){
        return lista.stream().sorted().toList();
    }

    public List<String> buscarPorNombre(String nombre){
        return lista.stream().filter(a -> a.equalsIgnoreCase(nombre)).toList();
    }

    public String crearString() {
        return lista.stream()
                .map(sc -> String.valueOf(sc.charAt(0)))
                .collect(Collectors.joining());
    }
    
    public void eliminarLasCadenasImpares(){
        lista.removeIf(a -> a.length()%2==0);
    }

    public List<String> pasarMayusculas(){
        return lista.stream().map(a -> a.toUpperCase()).toList();
    }

    public List<String> buscarPorPattern(){
        Pattern patron = Pattern.compile("^[A-C][a-z]*");
        return lista.stream().filter(l -> patron.matcher(l).matches()).collect(Collectors.toList());
    }
}
