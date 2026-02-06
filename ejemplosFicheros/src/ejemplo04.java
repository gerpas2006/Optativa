import java.io.File;

public class ejemplo04 {
    public static void main(String[] args) {

        File canal = new File("/Users/pastor.moger24_trian/Documents/Optativa/ejemplosFicheros");
        File[] lista = canal.listFiles();

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
