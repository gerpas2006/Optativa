package PastorMoleroGerman;

import java.util.List;

public class GestionUsuario {

    private List<Usuario> listaUsuarios;

    public GestionUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "GestionUsuario{" +
                "listaUsuarios=" + listaUsuarios +
                '}';
    }

    public void validarNombre(String nombre)throws TextoInvalidoException{
        if (nombre.length()<3){
            throw new TextoInvalidoException("El nombre tiene que tener más de 3 caracteres");
        }
    }

    public void validarEmail(String email)throws TextoInvalidoException{
        if (!email.contains("@")){
            throw new TextoInvalidoException("El email del usuario debe contener el @");
        }
    }

    public void calcularEdad(int edad)throws CalculoInvalidoException{
        if (edad<18){
            throw new CalculoInvalidoException("El usuario es menor de edad");
        }
    }

    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public void listarUsuario(){
        listaUsuarios.forEach(System.out::println);
    }
}
