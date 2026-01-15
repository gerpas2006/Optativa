package ejercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double grados = 0.0;
        Calculos calculos = new Calculos();
        System.out.println("Bienvenidos a mi programa");
        do {
            System.out.println("\nSeñala 0 si quieres salir\nDime los grados que quieres convertir a Fahrenheit");
            grados = Double.parseDouble(sc.nextLine());

            try {
                System.out.printf("El cambio a Celsius es %.2f", calculos.covertirCelsiusAFahrenheit(grados));
            } catch (TemperaturaException e) {
                System.out.println(e.getMessage());
            }
        }while (grados!=0);
    }
}
