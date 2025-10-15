package ejercicioTipoExamen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Habitacion> listaHabitaciones = new ArrayList<>();
        listaHabitaciones.add(new Habitacion(100, true, "Alice", 3, 2));
        Habitacion h = new Apartamento(150, false, "Bob", 2, 4, true);
        listaHabitaciones.add(h);
        listaHabitaciones.add(new Suite(200, true, "Charlie", 5, 2, 50, 300));

        GestionHotel hotel = new GestionHotel(listaHabitaciones);

        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombreCliente;
        String nombreCliente2;
        Habitacion habitacion;

        do {
            System.out.println("Elige opción:\n1. Buscar habitación\n2. Calcular precio elegida\n3. Calcular recaudado\n4. Mostrar NO ocupadas\n5. Calcular PVP de todas");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del cliente:");
                    nombreCliente = sc.nextLine();
                    habitacion = hotel.buscarHabitacion(nombreCliente);
                    System.out.println(habitacion != null ? habitacion : "No encontrada");
                    break;
                case 2:
                    System.out.println("Introduce el nombre del cliente:");
                    nombreCliente2 = sc.nextLine();
                    System.out.println("Precio: " + hotel.calcularPrecioElegida(nombreCliente2, 10.0, 20.0));
                    break;
                case 3:
                    System.out.println("Total recaudado: " + hotel.calcularRecaudado(10.0, 20.0));
                    break;
                case 4:
                    System.out.println("Habitaciones NO ocupadas:");
                    hotel.mostrarOcupadas();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while(opcion!=0);
        sc.close();
    }
}
