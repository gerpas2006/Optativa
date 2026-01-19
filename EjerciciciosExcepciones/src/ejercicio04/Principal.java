package ejercicio04;

import ejercicio02.Calculos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Calculo c = new Calculo();
        double a = 0,b = 0;
        int eleccion = 0;
        System.out.println("Bienvenido a mi programa");
        do {
            try {
                System.out.println("Dale a 0 si quires salir y si no dale a cualquier otro número");
                eleccion = Integer.parseInt(sc.nextLine());
                System.out.println("Dime el primer número");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Dime el segundo número");
                b = Double.parseDouble(sc.nextLine());
                System.out.printf("La suma de los dos números es: %.2f", c.sumarNumeros(a, b));
            } catch (CalculoException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Introduce un número, SOLO NÚMEROS");
            } catch (Exception e) {
                System.err.println("Error");
            }
        }while (eleccion!=0);
    }
}
