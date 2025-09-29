package ejercicio09;

import java.util.Arrays;
import java.util.Random;

public class Dado {

    private int[] numero = new int[10];

    public Dado(int[] numero) {
        this.numero = numero;
    }

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "numero=" + Arrays.toString(numero) +
                '}';
    }

    public int[] generarAleatorio() {
        int min = 1, max = 6;
        Random rnd = new Random(System.nanoTime());
        for (int i = 0; i < numero.length; i++) {
            numero[i] = rnd.nextInt(max - min + 1) + min;
        }
        return numero;
    }

    public int numeroMayor() {
        int mayor = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (mayor < numero[i]) {
                mayor = numero[i];
            }
        }
        return mayor;
    }

    public int numeroMenor(){
        int menor = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (menor>numero[i]) {
                menor= numero[i];
            }
        }
        return menor;
    }

    public int numeroMasRepetido() {
        generarAleatorio();
        int numeroRepetido = numero[0];
        int maxFrecuencia = 0;

        for (int i = 0; i < numero.length; i++) {
            int contador = 0;
            for (int j = 0; j < numero.length; j++) {
                if (numero[i] == numero[j]) {
                    contador++;
                }
            }

            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                numeroRepetido = numero[i];
            }
        }

        return numeroRepetido;
    }

}
