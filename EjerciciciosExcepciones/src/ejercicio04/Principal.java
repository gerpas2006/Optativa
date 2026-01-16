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
            System.out.println("Dale a 0 si quires salir y si no dale a 1");
            eleccion = Integer.parseInt(sc.nextLine());

            try {
                System.out.println("Dime el primer número");
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Dime el segundo número");
                b = Double.parseDouble(sc.nextLine());
                System.out.printf("La suma de los dos números es: %.2f", c.sumarNumeros(a, b));
            } catch (CalculoException e) {
                System.out.println(e.getMessage());
            } catch (Exception n) {
                System.out.println("Introduce un número, SOLO NÚMEROS");
            }
        }while (eleccion!=0);
    }
}
