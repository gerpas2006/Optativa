package ejercicio09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        int maxFrecuencia= 0;
        for (int i = 0; i < 6; i++) {
            if(numero[i]> maxFrecuencia){
                maxFrecuencia=numero[i];
            }

        }
        return maxFrecuencia;
    }

    public List<Integer> buscarMasRepetido(int maxFrecuencia){
        List<Integer> masRepetido = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if(numero[i]== maxFrecuencia){
                masRepetido.add(i +1);
            }
        }
        return masRepetido;
    }

}
