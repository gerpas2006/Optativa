package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int contrasena=1234;
        int intentos=0;
        int codigo;

        do {
            System.out.println("Introduce la contraseña para sacar las llaves");
            codigo = Integer.parseInt(sc.nextLine());
            if (codigo != contrasena) {
                intentos++;
                System.out.println("Contraseña Incorrecta");
            }else{
                System.out.println("Aqui tienes tus llaves");
            }
        }while(codigo!=contrasena && intentos<3);

        if(intentos>2){
            System.out.println("Ya lo has intentado muchas veces");
        }



	}

}
