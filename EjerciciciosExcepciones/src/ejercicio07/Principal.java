package ejercicio07;

import ejercicio05.ErrorException;

import java.util.*;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Coche c = new Coche(1L,"Peugeot","ABC1234");
        Coche c2 = new Coche(2L,"Renault","DEF5678");
        Coche c3 = new Coche(3L,"Ferrari","GHI9123");

        int eleccion = -1;
        long id = 0L;
        String marcaCoche,matricula;
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(c);
        listaCoches.add(c2);
        listaCoches.add(c3);
        GestionCoche gestion = new GestionCoche(listaCoches);

        System.out.println("Bienvenido al programa\n");
        do {
            System.out.println("""
                    0. Salir
                    1. Agregar Coche
                    2. Listar todos los coches
                    """);
            try {
                eleccion = Integer.parseInt(sc.nextLine());
                switch (eleccion) {
                    case 0:
                        System.out.println("Saliendo....");
                        break;
                    case 1:
                        System.out.println("Dime el ID del coche");
                        id = Long.parseLong(sc.nextLine());
                        System.out.println("Dime la marca del coche");
                        marcaCoche = sc.nextLine();
                        System.out.println("Dime la matrula del coche");
                        matricula = sc.nextLine();
                        Coche c4 = new Coche(id, marcaCoche, matricula);
                        gestion.agregarCoche(c4);
                        break;
                    case 2:
                        System.out.println(gestion.listaCoches);
                        break;
                    default:
                        System.out.println("Elige una opción correcta");
                        break;
                }
            }catch (NumberFormatException e){
                System.err.println("Introduce un número NO LETRAS");
            }catch (ErrorException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println("ERROR");
            }
        }while (eleccion!=0);
    }
}
