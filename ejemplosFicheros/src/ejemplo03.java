import java.io.File;

public class ejemplo03 {
    public static void main(String[] args) {

        //Obtener todas las raices del sistema de archivos
        File[] lista = File.listRoots();

        for (File root:lista){
            System.out.println("Raíz: "+root.getAbsolutePath());
        }
    }
}
