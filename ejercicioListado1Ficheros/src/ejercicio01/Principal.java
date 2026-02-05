package ejercicio01;

import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {

        PrintWriter fichero = null;

        try {
            fichero = new PrintWriter("fichero01.txt");
            fichero.write("Hola, esta es la primera línea del fichero");
            fichero.write("\nHola de nuevo, esta es la segunda línea del fichero");
            fichero.write("\nBuenas, esta es la tercera línea del fichero");
            fichero.write("\nYa terminamos, esta es la cuarta y última fila del fichero");
        }catch (Exception e){
            System.err.println("Algo ha salido mal");
        }finally {
            if (fichero != null){
                fichero.close();
            }
        }
    }
}
