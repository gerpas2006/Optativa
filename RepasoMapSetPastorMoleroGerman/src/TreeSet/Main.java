package TreeSet;

import java.util. Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animales an1 = new Animales(1L, "León", "Felino");
        Animales an2 = new Animales(2L, "Tigre", "Felino");
        Animales an3 = new Animales(3L, "Águila", "Ave");

        TreeSet<Animales> treeSet = new TreeSet<>(Comparator.comparing(Animales::getId));
        GestionAnimales gestion = new GestionAnimales(treeSet);

        treeSet.add(an1);
        treeSet.add(an2);
        treeSet.add(an3);

        int eleccion = 0;
        String nombreAnimal;
        String especieAnimal;
        Long idAnimal;

        do {
            System.out. println("""
                    Elige una opción
                    0. Salir
                    1. Agregar un nuevo animal
                    2. Eliminar un animal por su ID
                    3. Mostrar todos los animales
                    4. Editar un animal
                    5.  Buscar un animal por su ID
                    6. Buscar animales por especie
                    7. Número total de animales
                    """);
            eleccion = Integer.parseInt(sc.nextLine());

            switch (eleccion) {
                case 0:
                    System.out. println("Saliendo....");
                    break;
                case 1:
                    System.out.println("Dime el ID del nuevo animal");
                    idAnimal = Long.parseLong(sc.nextLine());
                    System.out.println("Dime el nombre del nuevo animal");
                    nombreAnimal = sc.nextLine();
                    System.out.println("Dime la especie del animal");
                    especieAnimal = sc.nextLine();
                    Animales animalNuevo = new Animales(idAnimal, nombreAnimal, especieAnimal);
                    gestion.agregarAnimal(animalNuevo);
                    break;
                case 2:
                    System. out.println("Dime el ID del animal que quieres eliminar");
                    idAnimal = Long.parseLong(sc.nextLine());
                    gestion.eliminarAnimal(idAnimal);
                    break;
                case 3:
                    gestion.listarTodos();
                    break;
                case 4:
                    System.out.println("Dime el ID del animal que quieres editar");
                    idAnimal = Long.parseLong(sc.nextLine());
                    System.out.println("Dime su nuevo nombre");
                    nombreAnimal = sc.nextLine();
                    System.out.println("Dime su nueva especie");
                    especieAnimal = sc.nextLine();
                    gestion.actualizarAnimal(idAnimal, nombreAnimal, especieAnimal);
                    break;
                case 5:
                    System.out.println("Dime el ID del animal que quieres buscar");
                    idAnimal = Long.parseLong(sc.nextLine());
                    Animales animalEncontrado = gestion.buscarPorId(idAnimal);
                    if (animalEncontrado != null) {
                        System.out.println(animalEncontrado);
                    } else {
                        System.out.println("Animal no encontrado");
                    }
                    break;
                case 6:
                    System. out.println("Dime la especie que quieres buscar");
                    especieAnimal = sc. nextLine();
                    System.out.println("Estos son los animales de la especie " + especieAnimal);
                    TreeSet<Animales> animalesPorEspecie = gestion.buscarPorEspecie(especieAnimal);
                    for (Animales animal : animalesPorEspecie) {
                        System.out.println(animal);
                    }
                    break;
                case 7:
                    System.out. println("El número total de animales es: " + gestion.numAnimales());
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (eleccion != 0);

        sc.close();
    }
}