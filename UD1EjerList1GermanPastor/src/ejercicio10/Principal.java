package ejercicio10;

import java.awt.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        ArrayList<Figura> list =new ArrayList<>();
        Figura figura=new Figura();
        Cuadrado cuadrado=new Cuadrado(4,4);
        Rectangulo rectangulo = new Rectangulo(2,4,5);
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(2,5);
        list.add(cuadrado);
        list.add(circulo);
        list.add(triangulo);
        list.add(rectangulo);


        System.out.printf("El area del circulo es %.2f y el volumen es %.2f",circulo.calcularArea(),circulo.calcularVolumen());
        System.out.printf("\nEl area del triangulo es %.2f y el volumen es %.2f",triangulo.calcularArea(),triangulo.calcularVolumen());
        System.out.printf("\nEl area del rectangulo es %.2f y el volumen es %.2f",rectangulo.calcularArea(),rectangulo.calcularVolumen());
        System.out.printf("\nEl area del cuadrado es %.2f y el volumen es %.2f",cuadrado.calcularArea(),cuadrado.calcularVolumen());
        System.out.printf("\nLa media de todas las areas de las figuras es %.2f ",figura.calcularMediaDeLasAreas(list));

    }
}
