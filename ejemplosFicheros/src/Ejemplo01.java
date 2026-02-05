import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo01 {
    public static void main(String[] args) {

        File file1 = new File("fichero.txt");

        System.out.printf("Nombre del fichero: %s",file1.getName());
        System.out.printf("\nEsta es la ruta absoluta del fichero es: %s",file1.getPath());
        System.out.printf("\nEsta es la ruta relativa del fichero: %s",file1.getAbsolutePath());
        System.out.printf("\nEsta es la última modificación del fichero: %s",file1.lastModified());

    }
}