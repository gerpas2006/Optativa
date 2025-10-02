package ejercicio09;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        /* Crea una clase dado con algun metodo como lanzar que devuelva un numero alatorio entra 1 y 6.
         * Simula 10 tiradas y muestra la puntuacion mayor, la menor y que numero se ha repetido mas veces*/

        int []numero=new int [10];
        Dado d = new Dado(numero);
        System.out.println(("Estos son los 10 números aleatorios "+Arrays.toString(d.generarAleatorio())));
        System.out.println("El numero más grande de los generados es "+d.numeroMayor());
        System.out.println("El número mas chico de los generados es "+d.numeroMenor());
        System.out.println("El numero mas repetido es "+ d.buscarMasRepetido(d.numeroMasRepetido()));
    }
}
