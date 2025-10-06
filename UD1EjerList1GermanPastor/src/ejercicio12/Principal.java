package ejercicio12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> listAlumnos = new ArrayList<>();
        listAlumnos.add("Pedro");
        listAlumnos.add("Germán");
        listAlumnos.add("Antonio");

        Collections.sort(listAlumnos);

        System.out.printf("Estos son los alumnos que hay en la lista ordenados en orden alfabeticos %s",listAlumnos);
    }
}
