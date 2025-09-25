package ejercicio02;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        Random rnd = new Random(System.nanoTime());
        double notas[];
        double hasta = 10, min = 0;


        System.out.println("Bienvenido a mi programa");
        notas = new double [10];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rnd.nextDouble(hasta - min + 1) + min;
            System.out.println(notas[i]);
        }


    }
}
