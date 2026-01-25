package ejercicio06.ejercicio04;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L, "Juan Pérez", 35000.0, "Ventas", true, 5.0));
        empleados. add(new Empleado(2L, "María García", 45000.0, "IT", true, 8.0));
        empleados. add(new Empleado(3L, "Carlos López", 28000.0, "Recursos Humanos", false, 3.0));
        empleados.add(new Empleado(4L, "Ana Martínez", 52000.0, "IT", true, 10.0));
        empleados. add(new Empleado(5L, "Pedro Rodríguez", 38000.0, "Ventas", true, 6.0));
        empleados. add(new Empleado(6L, "Laura Fernández", 42000.0, "Marketing", true, 7.0));
        empleados. add(new Empleado(7L, "Miguel Sánchez", 31000.0, "Recursos Humanos", false, 4.0));

        Administracion admin = new Administracion(empleados);

        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        String nombre;
        double anios = 0.0;

        do {
            System.out.println("\n=== Menú de Administración ===");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Calcular media de salarios");
            System.out.println("3. Empleados activos con salario mayor a la media");
            System.out. println("4. Buscar empleado por nombre");
            System.out.println("5. Calcular salario total de activos con menos años de antigüedad");
            System.out.println("6. Mostrar ranking de empleados");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción:  ");
            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- Lista de Empleados ---");
                        admin.listarEmpleados();
                        break;

                    case 2:
                        System.out.println("Media de salarios: " + admin. mediaSalario() + "€");
                        break;

                    case 3:
                        System.out.println("\n--- Empleados activos con salario mayor a la media ---");
                        System.out.println(admin.empleadosActivosYMayorQueLaMedia());
                        break;

                    case 4:
                        System.out.print("Ingrese el nombre del empleado: ");
                        nombre = sc. nextLine();
                        System.out.println(admin.buscarPorNombre(nombre));
                        break;

                    case 5:
                        System.out.print("Ingrese los años de antigüedad: ");
                        anios = Double.parseDouble(sc.nextLine());
                        System.out.println("Salario total de empleados activos con menos de " + anios + " años:  " + admin.calcularSalarioActvos(anios) + "€");
                        break;

                    case 6:
                        System.out.println("\n--- Ranking de Empleados ---");
                        System.out.println(admin.ranking());
                        break;

                    case 0:
                        System.out.println("Saliendo.. .");
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            }catch (NumberFormatException e){
                System.err.println("Tienes que introducir un número NO LETRAS");
            }catch (EmpleadoException e) {
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println("ERROR");
            }
        }while (opcion != 0);

        sc.close();
    }
}
