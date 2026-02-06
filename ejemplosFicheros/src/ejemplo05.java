import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejemplo05 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nombre,telefono;
        FileWriter fls = new FileWriter("Agenda.txt");
        BufferedWriter fs = new BufferedWriter(fls);

        try{
            do {
                System.out.println("Pulsa el ENTER si quieres salir");
                System.out.println("Introduce un nombre: ");
                nombre = sc.nextLine();
                if (nombre.length()>0){
                    System.out.println("Telefono: ");
                    telefono = sc.nextLine();
                    fs.write(nombre + ","+ telefono);
                    fs.newLine();
                }
            }while (nombre.length()>0);
        }catch (IOException e){
            System.err.println("Error en el fichero");
        }finally {
            sc.close();
            fs.close();
            System.out.println("Adios");
        }
    }
}
