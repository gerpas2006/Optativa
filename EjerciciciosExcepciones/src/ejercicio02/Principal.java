package ejercicio02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double grados = 0.0;
        Calculos calculos = new Calculos();
        System.out.println("Bienvenidos a mi programa");

            do {
                try {
                    System.out.println("\nSeñala 0 si quieres salir\nDime los grados que quieres convertir a Fahrenheit");
                    grados = Double.parseDouble(sc.nextLine());
                    System.out.printf("El cambio a Celsius es %.2f Fahrenheit", calculos.covertirCelsiusAFahrenheit(grados));
                } catch (TemperaturaException e) {
                    System.err.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.err.println("Solo se pueden introducir números");
                } catch (Exception e) {
                    System.err.println("Error");
                }
            }while(grados!=0);

    }
}
