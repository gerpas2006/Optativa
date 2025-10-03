package ejercicio09;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        /* Crea una clase dado con algun metodo como lanzar que devuelva un numero alatorio entra 1 y 6.
         * Simula 10 tiradas y muestra la puntuacion mayor, la menor y que numero se ha repetido mas veces*/

        int min=1,max=6,num=3;
        ArrayList<Integer> lista=new ArrayList<>();
        Dado d = new Dado(lista);

        System.out.println("Estos son los numero generados "+d.numAleatorio(min,max));
        System.out.println("Este es el número mas grande generado "+d.numMayor());
        System.out.println("Este es el número mas pequeño generado "+d.numMenor());
        System.out.println("El número mas repetido es "+d.numeroMasRepetido());
        System.out.println("La suma de todos los números generados es "+d.sumarNumeros());
        System.out.printf("El %d se ha repetido %d veces",num,d.contarNumero(num));
    }
}
