package ejercicio11;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 10.0;
        double incentivo = 1500.0;
        double horasExtras;
        double precioHorasExtras = 15.5;
        int trabajosTerminados;
        double horasTrabajadasJefe;
        double horasTrabajadasProgramador;
        Empresa empresa = new Empresa(sueldo);
        Jefe jefe = new Jefe(sueldo, incentivo);
        Programador programador = new Programador(sueldo, precioHorasExtras);

        int opcion;
        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Calcular sueldo del Jefe");
            System.out.println("2. Calcular sueldo del Programador");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Dime cuantas horas ha trabajado el Jefe:");
                    horasTrabajadasJefe = Double.parseDouble(sc.nextLine());
                    System.out.println("¿Cuántos trabajos ha terminado el Jefe?");
                    trabajosTerminados = Integer.parseInt(sc.nextLine());
                    System.out.printf(
                            "El sueldo del jefe sin contar ningun trabajo es de %.2f€ pero si contamos los %d trabajos terminado se le quedaría un sueldo de %.2f€\n",
                            empresa.calcularSueldo(horasTrabajadasJefe),
                            trabajosTerminados,
                            jefe.calcularSueldo(horasTrabajadasJefe, trabajosTerminados)
                    );
                    break;
                case 2:
                    System.out.println("Dime cuantas horas normales ha trabajado el programador:");
                    horasTrabajadasProgramador = Double.parseDouble(sc.nextLine());
                    System.out.println("¿Cuántas horas extras ha hecho el programador?");
                    horasExtras = Double.parseDouble(sc.nextLine());
                    System.out.printf(
                            "El sueldo del programador sin contar las horas extras es de %.2f€ y contando las %.2f horas extras se le quedaría un sueldo de %.2f€\n",
                            empresa.calcularSueldo(horasTrabajadasProgramador),
                            horasExtras,
                            programador.calcularSueldo(horasTrabajadasProgramador, horasExtras)
                    );
                    break;
                case 3:
                    System.out.println("Gracias por utilizar mi programa");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        sc.close();

    }
}
