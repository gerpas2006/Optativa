package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Cadenas> cadenas = new ArrayList<>();

        Crud crud = new Crud(cadenas);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de opciones ===");
            System.out.println("1. Mostrar todas las cadenas");
            System.out.println("2. Ordenar cadenas");
            System.out.println("3. Buscar cadena por nombre");
            System.out.println("4. Crear string con iniciales");
            System.out.println("5. Eliminar cadenas con longitud par");
            System.out.println("6. Pasar cadenas a mayúsculas");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(crud.getLista());
                    break;
                case 2:
                    System.out.println(crud.ordenar());
                    break;
                case 3:
                    System.out.print("Ingrese la cadena a buscar: ");
                    String nombre = sc.nextLine();
                    System.out.println(crud.buscarPorNombre(nombre));
                    break;
                case 4:
                    System.out.println("String con iniciales: " + crud.crearString());
                    break;
                case 5:
                    crud.eliminarLasCadenasImpares();
                    System.out.println("Cadenas impares eliminadas. Lista actual: " + crud.getLista());
                    break;
                case 6:
                    System.out.println("Cadenas en mayúsculas: " + crud.pasarMayusculas());
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

