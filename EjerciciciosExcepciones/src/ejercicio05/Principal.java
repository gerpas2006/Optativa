package ejercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int eleccion = 0, numero = 0;
        Long idNuevo = 0L, idBuscar = 0L;
        double dineroEnviar = 0, descuento =0, ingresar = 0;
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(1L,256.63);
        List<Producto> listaProducto = new ArrayList<>();
        Producto p = new Producto(1L,15.3,5);
        Producto p2 = new Producto(2L,18.6,9);
        Producto p3 = new Producto(3L,25.4,8);

        listaProducto.add(p);
        listaProducto.add(p2);
        listaProducto.add(p3);

        Calculos calculos = new Calculos(listaProducto,cuenta);

        System.out.println("Bienvenidos a mi programa\n");
        do {
            System.out.println("""
                    \n0. Salir
                    1. Generar número aleatorio
                    2. Cambiar Id
                    3. Introducir un número
                    4. Enviar bizum
                    5. Buscar productos por descuento
                    6. Ingresar dinero
                    """);
            eleccion = Integer.parseInt(sc.nextLine());
            try {
                switch (eleccion) {
                    case 0:
                        System.out.println("Saliendo....");
                        break;
                    case 1:
                        try {
                            System.out.printf("El número generado es %d", calculos.aleatorio());
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Dime el ID del producto que quieres cambiar");
                            idBuscar = Long.parseLong(sc.nextLine());
                            System.out.println("Dime su nuevo ID");
                            idNuevo = Long.parseLong(sc.nextLine());
                            calculos.cambiarId(idBuscar, idNuevo);
                        } catch (NumberFormatException e) {
                            System.err.println("Los id solo pueden ser número");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Dime un número");
                            numero = Integer.parseInt(sc.nextLine());
                            System.out.println(calculos.lanzarNumero(numero));
                        } catch (NumberFormatException e) {
                            System.err.println("Solo se pueden introducir números");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Dime cuánto sinero quieres enviar");
                            dineroEnviar = Double.parseDouble(sc.nextLine());
                            calculos.enviarBizum(dineroEnviar);
                        } catch (NumberFormatException e) {
                            System.err.println("Solo se puede introducir números");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("Dime el descuento");
                            descuento = Double.parseDouble(sc.nextLine());
                            System.out.println(calculos.buscarDescuento(descuento));
                        } catch (NumberFormatException e) {
                            System.err.println("Para los descuentos solo puedes introducir números");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Dime cuánto dinero quieres ingresar");
                            ingresar = Double.parseDouble(sc.nextLine());
                            calculos.agregarDinero(ingresar);
                        } catch (NumberFormatException e) {
                            System.err.println("Solo se pueden introducir número");
                        } catch (Exception e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Introduce un número válido");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Solo se pueden introducir númeror");
            } catch (Exception e) {
                System.err.println("Error");
            }
        }while (eleccion!=0);

    }
}
