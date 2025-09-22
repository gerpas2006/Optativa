package ejercicio02;

public class Principal {
    public static void main(String[] args) {

        Random rnd = new Random(System.nanoTime());
        double notas[];
        double hasta = 10;
        double des

        System.out.println("Bienvenido a mi programa");
        notas = new double [10];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rnd.nextInt(10 - 0 + 1) + 10;
        }


    }
}
