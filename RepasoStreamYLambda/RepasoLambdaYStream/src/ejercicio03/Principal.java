package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Crear lista de canciones inicial
        List<Cancion> canciones = new ArrayList<>();
        canciones.add(new Cancion("Bohemian Rhapsody", "Queen", 5.55, Generos.ROCK));
        canciones.add(new Cancion("Imagine", "John Lennon", 3.03, Generos.POP));
        canciones.add(new Cancion("Stairway to Heaven", "Led Zeppelin", 8.02, Generos.ROCK));
        canciones.add(new Cancion("Billie Jean", "Michael Jackson", 4.54, Generos.POP));
        canciones.add(new Cancion("Hotel California", "Eagles", 6.30, Generos.ROCK));

        PlayList playList = new PlayList(canciones);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de PlayList ===");
            System. out.println("1. Mostrar todas las canciones");
            System.out.println("2. Buscar canción por nombre");
            System. out.println("3. Buscar canciones por autor");
            System. out.println("4. Buscar canciones por duración exacta");
            System.out. println("5. Buscar canciones por género");
            System.out.println("6. Buscar canciones mayores a una duración");
            System.out.println("7. Contar autores distintos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Lista de Canciones ---");
                    playList.getListaCanciones().forEach(System.out::println);
                    break;

                case 2:
                    System.out. print("Ingrese el nombre de la canción: ");
                    String nombre = sc.nextLine();
                    System.out.println(playList.buscarPorNombre(nombre));
                    break;

                case 3:
                    System.out. print("Ingrese el nombre del autor: ");
                    String autor = sc.nextLine();
                    System.out.println(playList.buscarPorAutor(autor));
                    break;

                case 4:
                    System.out. print("Ingrese la duración (en minutos, ej:  5.55): ");
                    double duracion = sc.nextDouble();
                    System.out.println(playList.buscarPorDuracion(duracion));
                    break;

                case 5:
                    System.out.println("Géneros disponibles:");
                    for (Generos g :  Generos.values()) {
                        System.out.println("- " + g);
                    }
                    System.out. print("Ingrese el género:  ");
                    String generoStr = sc.nextLine().toUpperCase();
                    Generos genero = Generos.valueOf(generoStr);
                    System.out.println(playList.buscarPorGenero(genero));
                    break;

                case 6:
                    System. out.print("Ingrese la duración mínima:  ");
                    double duracionMin = sc.nextDouble();
                    System.out.println(playList.buscarPorDuracionDada(duracionMin));
                    break;

                case 7:
                    System.out.println("Cantidad de autores distintos: " + playList.autoresDistintos());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}