package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Alumno al1 = new Alumno(1L,"María",4.5);
        Alumno al2 = new Alumno(2L,"María",4.5);
        Alumno al3 = new Alumno(3L,"María",4.5);
        Set<Alumno> alumnos = new HashSet<>();
        GestionAlumno gestion = new GestionAlumno(alumnos);
        int eleccion = 0;
        alumnos.add(al1);
        alumnos.add(al2);
        alumnos.add(al3);
        String nombreAlumno;
        double notaAlumno;
        Long idAlumno;
        do {
            System.out.println("""
                    Elige una opción
                    0. Salir
                    1. Agregar un nuevo alumno
                    2. Eliminar un alumno por su ID
                    3. Mostrar todos los alumnos
                    4. Editar un alumno
                    5. Buscar un alumnos por su ID
                    6. Alumnos con la nota mas grande
                    7. Nota media de la clase
                    """);
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 0:
                    System.out.println("Saliendo....");
                    break;
                case 1:
                    System.out.println("Dime el ID del nuevo alumno");
                    idAlumno = Long.parseLong(sc.nextLine());
                    System.out.println("Dime el nombre del nuevo alumno");
                    nombreAlumno = sc.nextLine();
                    System.out.println("Dime la nota del alumno");
                    notaAlumno = Double.parseDouble(sc.nextLine());
                    Alumno alumnoNuevo = new Alumno(idAlumno, nombreAlumno, notaAlumno);
                    gestion.agregarAlumno(alumnoNuevo);
                    break;
                case 2:
                    System.out.println("Dime la id del alumno que quieres eliminar");
                    idAlumno = Long.parseLong(sc.nextLine());
                    gestion.eliminarPorId(idAlumno);
                    break;
                case 3:
                    gestion.mostrarTodos();
                    break;
                case 4:
                    System.out.println("Dime la id del alumno que quieres editar");
                    idAlumno = Long.parseLong(sc.nextLine());
                    System.out.println("Dime su nuevo nombre");
                    nombreAlumno = sc.nextLine();
                    System.out.println("Dime su nueva nota");
                    notaAlumno = Double.parseDouble(sc.nextLine());
                    Alumno alumnoEditado = new Alumno(idAlumno,nombreAlumno,notaAlumno);
                    gestion.editarAlumno(idAlumno,alumnoEditado);
                    break;
                case 5:
                    System.out.println("Dime la id del alumno que quieres buscar");
                    idAlumno = Long.parseLong(sc.nextLine());
                    gestion.buscarPorId(idAlumno);
                    break;
                case 6:
                    System.out.println("Estos son los alumnos con las notas mas alta");
                    gestion.alumnosConLaNotaMasAlta();
                    break;
                case 7:
                    System.out.println("La media de las notas de todosm los alumnos es ");
            }
        }while (eleccion!=0);


    }
}
