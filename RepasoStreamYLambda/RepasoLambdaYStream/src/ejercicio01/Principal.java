package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ana", "García", "2DAM", 8.5, 20));
        alumnos.add(new Alumno("Pedro", "López", "1DAM", 7.0, 22));
        alumnos.add(new Alumno("Lucía", "Martínez", "2DAM", 9.0, 19));
        alumnos.add(new Alumno("Carlos", "Pérez", "1DAM", 6.5, 21));
        alumnos.add(new Alumno("Alicia", "Sánchez", "1DAM", 8.0, 18));

        Secretaria secretaria = new Secretaria(alumnos);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de opciones ===");
            System.out.println("1. Mostrar todos los alumnos");
            System.out.println("2. Filtrar alumnos por curso");
            System.out.println("3. Buscar alumnos por letra inicial");
            System.out.println("4. Contar alumnos");
            System.out.println("5. Alumnos con nota mayor a un valor");
            System.out.println("6. Mostrar los primeros tres alumnos");
            System.out.println("7. Alumno más pequeño");
            System.out.println("8. Alumnos con nombre más largo que un valor");
            System.out.println("9. Alumnos cuyo nombre empieza con 'A' y longitud dada");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    secretaria.mostrarTodosLosAlumnos();
                    break;
                case 2:
                    System.out.print("Ingrese el curso a filtrar: ");
                    String curso = sc.nextLine();
                    System.out.println(secretaria.filtrarPorCurso(curso));
                    break;
                case 3:
                    System.out.print("Ingrese la letra inicial: ");
                    String letra = sc.nextLine();
                    System.out.println(secretaria.buscarAlumnosPorLetra(letra));
                    break;
                case 4:
                    System.out.println("Cantidad de alumnos: " + secretaria.tamanioLista());
                    break;
                case 5:
                    System.out.print("Ingrese la nota mínima: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(secretaria.mayorNota(nota));
                    break;
                case 6:
                    System.out.println(secretaria.primerosTresAlumnos());
                    break;
                case 7:
                    System.out.println(secretaria.alumnosMasPequnios());
                    break;
                case 8:
                    System.out.print("Ingrese la longitud mínima del nombre: ");
                    int longitud = sc.nextInt();
                    sc.nextLine();
                    System.out.println(secretaria.alumnosConElNombreMasLargoDadoPorParametro(longitud));
                    break;
                case 9:
                    System.out.print("Ingrese la longitud mínima del nombre: ");
                    int longitud2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(secretaria.alumnoPorLaLetraPedidaYLongitudDada(longitud2));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        sc.close();
    }
}