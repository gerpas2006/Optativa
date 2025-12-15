package Map;

import java.util.HashMap;
import java.util.Map;

public class GestionLibro {

    private Map<Long, Libro> libros;

    public GestionLibro() {
        this.libros = new HashMap<>();
    }

    public GestionLibro(Map<Long, Libro> libros) {
        this.libros = libros;
    }

    public Map<Long, Libro> getLibros() {
        return libros;
    }

    public void setLibros(Map<Long, Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "GestionLibro{" +
                "libros=" + libros +
                '}';
    }


    public void agregarLibro(Libro libro) {
        libros.put(libro.getId(), libro);
    }

    public void mostrarLibros() {
        for (Map.Entry<Long, Libro> entry : libros. entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public Libro buscarPorId(Long id) {
        return libros.get(id);
    }

    public void buscarPorNombre(String nombre) {
        for (Libro libro : libros.values()) {
            if (libro.getNombreLibro().equalsIgnoreCase(nombre)) {
                System.out.println(libro);
            }
        }
    }

    public void actualizarLibro(Libro libro) {
        libros.put(libro.getId(), libro);
    }

    public void eliminarPorId(Long id) {
        libros.remove(id);
    }

    public int contarLibros() {
        return libros.size();
    }

    public Libro obtenerLibroConMasPaginas() {
        Libro libroMaxPaginas = null;
        int maxPaginas = 0;

        for (Libro libro : libros.values()) {
            if (libro.getNumPaginas() > maxPaginas) {
                maxPaginas = libro. getNumPaginas();
                libroMaxPaginas = libro;
            }
        }

        return libroMaxPaginas;
    }


}