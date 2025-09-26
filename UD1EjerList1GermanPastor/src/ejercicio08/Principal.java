package ejercicio08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean anuncios=true;
       int opcion=0;
       double precio=50.0;
       String nombre;
       double descuento=0;
       Plataforma p;
       Gestion g;


        System.out.println("Bienvenido a mi programa");
        System.out.println("Dime el nombre de la plataforma");
        nombre = sc.nextLine();
        System.out.println("¿Vas a querer anucios en la plataformas?/n1. Si/n2. No");
        opcion = Integer.parseInt(sc.nextLine());
        if(opcion==1){
            anuncios=true;
        }else if (opcion ==2){
            anuncios = false;
        }
        p = new Plataforma(anuncios,descuento,nombre,precio);
        g = new Gestion(p);
        System.out.println("El precio de la plataforma se te queda en "+g.calcularPrecio(descuento,anuncios)+"€");

    }
}
