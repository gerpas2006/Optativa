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


        System.out.println("Bienvenidos al programa");
        System.out.println("Dime cuantas horas ha trabajado el Jefe");
        horasTrabajadasJefe = Double.parseDouble(sc.nextLine());
        System.out.println("Para calcular el suldo del Jefe de la empresa necesito saber cuántos trabajos ha terminado");
        trabajosTerminados = Integer.parseInt(sc.nextLine());
        System.out.printf("El sueldo del jefe sin contar ningun trabajo es de %.2f€ pero si contamos los %d trabajos terminado se le quedaria un sueldo de %.2f€", empresa.calcularSueldo(horasTrabajadasJefe),trabajosTerminados, jefe.calcularSueldo(horasTrabajadasJefe,trabajosTerminados));
        System.out.println("\nDime cuantas horas normales ha trabajado el programador");
        horasTrabajadasProgramador = Double.parseDouble(sc.nextLine());
        System.out.println("Para calcular el sueldo del programador necesito saber las horas extras que ha hechado");
        horasExtras = Double.parseDouble(sc.nextLine());
        System.out.printf("\nEl sueldo del programador sin contar las horas extras es de %.2f y contando las %.2f horas extras se le quedaria un sueldo de %.2f€",empresa.calcularSueldo(horasTrabajadasProgramador),horasExtras,programador.calcularSueldo(horasTrabajadasProgramador,horasExtras));
        System.out.println("\nGracias por utilizar mi programa");

    }
}
