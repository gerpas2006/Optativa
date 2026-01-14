package ejercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        double resultado = 0, num1 = 0, num2 = 0;
        int eleccion = 0;
        String entrada1,entrada2;
        String letras = "qwertyuiopasdfghjklñzxcvbnm";
        System.out.println("Biemvenidos al programa");
        do {
            System.out.println("""
                    \nElige lo que quieres hacer
                    0. Salir
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Raíz cuadradada
                    """);
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("Dime el primer número");
                    entrada1 = sc.nextLine();
                    if (!esNumero(entrada1)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    System.out.println("Dime el segundo número");
                    entrada2 = sc.nextLine();
                    if (!esNumero(entrada2)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    num1 = Double.parseDouble(entrada1);
                    num2 = Double.parseDouble(entrada2);
                    resultado = num1 + num2;
                    System.out.println("La suma de los dos número es " + resultado);
                    break;
                case 2:
                    System.out.println("Dime el primer número");
                    entrada1 = sc.nextLine();
                    if (!esNumero(entrada1)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    System.out.println("Dime el segundo número");
                    entrada2 = sc.nextLine();
                    if (!esNumero(entrada2)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    num1 = Double.parseDouble(entrada1);
                    num2 = Double.parseDouble(entrada2);
                    resultado = num1 - num2;
                    System.out.printf("La suma de los dos número es %s", resultado);
                    break;
                case 3:
                    System.out.println("Dime el primer número");
                    entrada1 = sc.nextLine();
                    if (!esNumero(entrada1)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    System.out.println("Dime el segundo número");
                    entrada2 = sc.nextLine();
                    if (!esNumero(entrada2)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    num1 = Double.parseDouble(entrada1);
                    num2 = Double.parseDouble(entrada2);
                    resultado = num1 * num2;
                    System.out.printf("La suma de los dos número es %s", resultado);
                    break;
                case 4:
                    System.out.println("Dime el divisor");
                    entrada1 = sc.nextLine();
                    if (!esNumero(entrada1)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    System.out.println("Dime el dividendo");
                    entrada2 = sc.nextLine();
                    if (!esNumero(entrada2)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }else if (entrada2.equalsIgnoreCase("0")){
                        throw new RuntimeException("No se puede dividir entre 0");
                    }
                    num1 = Double.parseDouble(entrada1);
                    num2 = Double.parseDouble(entrada2);
                    resultado = num1 - num2;
                    System.out.printf("La suma de los dos número es %s", resultado);
                    break;
                case 5:
                    System.out.println("Dime el número");
                    entrada1 = sc.nextLine();
                    if (!esNumero(entrada1)) {
                        throw new RuntimeException("No se pueden introducir numero negativos");
                    }
                    num1 = Double.parseDouble(String.valueOf(num1));
                    if (num1<0){
                        throw new RuntimeException("No se puede hacer una raiz cuandrada negativa");
                    }
                    resultado = Math.sqrt(num1);
                    System.out.printf("La suma de los dos número es %s", resultado);
                    break;
                default:
                    System.out.println("Elige una opción correcta");
                    break;
            }
        }while (eleccion!=0);
    }

    public static boolean esNumero(String texto) {
        return texto.matches("-?\\d+(\\.\\d+)?");
    }
}
