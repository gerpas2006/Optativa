package PastorMoleroGerman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eleccion = -1,edad =0;
        String nombre, email;
        Usuario usuario1 = new Usuario("Pedro","pedro@gmail.com",21);
        Usuario usuario2 = new Usuario("Jesús","jesus@gmail.com",20);
        Usuario usuario3 = new Usuario("Antonio","antonio@gmail.com",19);
        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(usuario1);
        listaUsuario.add(usuario2);
        listaUsuario.add(usuario3);
        GestionUsuario gs = new GestionUsuario(listaUsuario);


        System.out.println("Bienvenidos a mi programa");
        do {
            System.out.println("Que quieres hacer");
            System.out.println("""
                    0. Salir
                    1. Agregar un Usuario
                    2. Listar Usuarios
                    """);
            try {
                eleccion = Integer.parseInt(sc.nextLine());
                switch (eleccion){
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    case 1:
                        System.out.println("Introduce el nombre del usuario");
                        nombre = sc.nextLine();
                        gs.validarNombre(nombre);
                        System.out.println("Dime el email del usuario");
                        email = sc.nextLine();
                        gs.validarEmail(email);
                        System.out.println("Dime la edad del usuario");
                        edad = Integer.parseInt(sc.nextLine());
                        if (nombre.length()<3 || !email.contains("@") || edad<18){
                            System.out.println("No se ha podido agregar al usuario ya que algunos datos no son validos");
                        }else {
                            Usuario usuario = new Usuario(nombre,email,edad);
                            gs.agregarUsuario(usuario);
                        }
                        break;
                    case 2:
                        gs.listarUsuario();
                        break;
                    default:
                        System.out.println("Introduce un número de los que hay en el menú");
                        break;
                }
            }catch (NumberFormatException n){
                System.err.println("Introduce un número");
            }catch (TextoInvalidoException t){
                System.err.println(t.getMessage());
            }catch (CalculoInvalidoException c){
                System.out.println(c.getMessage());
            }catch (Exception e){
                System.err.println("Error");
            }
        }while (eleccion!=0);
        sc.close();

    }
}
