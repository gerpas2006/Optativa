package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro lib1 = new Libro(1L, "Cien años de soledad", 471);
        Libro lib2 = new Libro(2L, "Don Quijote", 863);
        Libro lib3 = new Libro(3L, "1984", 328);

        Map<Long, Libro> libros = new HashMap<>();
        GestionLibro gestion = new GestionLibro(libros);

        int eleccion = 0;

        gestion.agregarLibro(lib1);
        gestion.agregarLibro(lib2);
        gestion.agregarLibro(lib3);

        String nombreLibro;
        int numPaginas;
        Long idLibro;

        do {
            System.out.println("""
                    Elige una opción
                    0.  Salir
                    1.  Agregar un nuevo libro
                    2. Eliminar un libro por su ID
                    3.  Mostrar todos los libros
                    4. Editar un libro
                    5. Buscar un libro por su ID
                    6. Libro con más páginas
                    7. Contar libros
                    """);
            eleccion = Integer. parseInt(sc.nextLine());

            switch (eleccion) {
                case 0:
                    System.out.println("Saliendo....");
                    break;

                case 1:
                    System.out.println("Dime el ID del nuevo libro");
                    idLibro = Long.parseLong(sc.nextLine());
                    System.out.println("Dime el nombre del nuevo libro");
                    nombreLibro = sc.nextLine();
                    System.out.println("Dime el número de páginas del libro");
                    numPaginas = Integer.parseInt(sc.nextLine());
                    Libro libroNuevo = new Libro(idLibro, nombreLibro, numPaginas);
                    gestion.agregarLibro(libroNuevo);
                    System.out.println("Libro agregado correctamente");
                    break;

                case 2:
                    System.out.println("Dime el ID del libro que quieres eliminar");
                    idLibro = Long. parseLong(sc.nextLine());
                    gestion.eliminarPorId(idLibro);
                    System.out. println("Libro eliminado");
                    break;

                case 3:
                    gestion.mostrarLibros();
                    break;

                case 4:
                    System.out.println("Dime el ID del libro que quieres editar");
                    idLibro = Long. parseLong(sc.nextLine());
                    System.out. println("Dime su nuevo nombre");
                    nombreLibro = sc.nextLine();
                    System.out.println("Dime su nuevo número de páginas");
                    numPaginas = Integer.parseInt(sc.nextLine());
                    Libro libroEditado = new Libro(idLibro, nombreLibro, numPaginas);
                    gestion.actualizarLibro(libroEditado);
                    System.out.println("Libro actualizado");
                    break;

                case 5:
                    System.out.println("Dime el ID del libro que quieres buscar");
                    idLibro = Long. parseLong(sc.nextLine());
                    Libro libroEncontrado = gestion.buscarPorId(idLibro);
                    System.out.println(libroEncontrado);
                    break;

                case 6:
                    System. out.println("Este es el libro con más páginas:");
                    gestion.obtenerLibroConMasPaginas();
                    break;

                case 7:
                    System.out.println("Total de libros: " + gestion.contarLibros());
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (eleccion != 0);

        sc.close();
    }
}