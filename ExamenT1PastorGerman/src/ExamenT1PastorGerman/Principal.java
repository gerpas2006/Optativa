package ExamenT1PastorGerman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        List<Vehiculo> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Vehiculo vehiculo;
        Vehiculo vehiculo1 = new Motos("1234ANG",2,250);
        Vehiculo vehiculo2 = new Furgoneta("5678GPM",5,3);
        Vehiculo vehiculo3 = new Motos("2635QWF",2,150);
        Vehiculo vehiculo4 = new Furgoneta("1254GPT",5,5);
        Parking parking = new Parking("Parking Los Remedios",lista);
        int eleccion;
        lista.add(vehiculo1);
        lista.add(vehiculo2);
        lista.add(vehiculo4);
        lista.add(vehiculo3);
        double precioPorHora=10.0;
        double cantPorMetro=5;
        String matricula;
        double longMax=4;



            System.out.println("Bienvenidos a mi programa");
        do {
            System.out.println("\nQué quieres hacer\n0. Salir\n1. Calcular recaudado de solo las motos\n2. Calcular precio de un vehículo\n3. Mostrar todos los vehículos");
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 0:
                    System.out.println("Saliendo.....");
                    System.out.println("Gracias por utilizar mi programa");
                    break;
                case 1:
                    System.out.printf("Este es el dinero que se ha recaudado solo en las motos: %.2f", parking.calcularRecaudadoMotos(precioPorHora, cantPorMetro));
                    break;
                case 2:
                    System.out.println("Dime la matricula del vehiculo que quieres calcular");
                    matricula = sc.nextLine();
                    if (parking.buscarVehiculo(matricula)==null){
                        System.out.println("No se ha encontardo ese vehiculo");
                    }else{
                        System.out.printf("Este es el precio del vehiculo con la matricula %s es : %.2f", matricula, parking.calcularPrecioUnVehiculo(matricula, precioPorHora, cantPorMetro));
                    }
                    break;
                case 3:
                    parking.mostrarDatos(longMax);
                    break;
                default:
                    System.out.println("Elige una opción correcta");
                    break;
            }
        }while(eleccion!=0);


    }
}
