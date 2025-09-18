package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int nuevaContrasena;
		int intentos = 0;
		int contrasena;

		System.out.println("Introduce la contraseña que le quieres poner a la caja");
		nuevaContrasena = Integer.parseInt(sc.nextLine());
		do {
			System.out.println("Introduce la contraseña para sacar la llave de la casa");
			contrasena = Integer.parseInt(sc.nextLine());
			 if(contrasena != nuevaContrasena) {
				intentos++;
				System.out.println("Contraseña incorrecta");
			}
		} while (contrasena != nuevaContrasena || intentos <=5);

		if (contrasena == nuevaContrasena) {
			System.out.println("Aqui tienes sus llaves");
			
		}
		if (intentos <=5) {
			System.out.println("Ya lo has intentado muchas veces");
		}

	}

}
