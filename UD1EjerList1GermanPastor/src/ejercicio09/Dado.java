package ejercicio09;

import java.util.Arrays;
import java.util.Random;

public class Dado {

    private int[] numero = new int [10];

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

    public int[] generarAleatorio(){
        int min = 1, max = 6;
        Random rnd = new Random(System.nanoTime());
        for(int i=0;i<numero.length;i++){
            numero[i] = rnd.nextInt(max-min+1)+min;
        }
        return numero;
    }
}
