package ejercicio01;

import java.util.Comparator;
import java.util.List;

public class Secretaria {

    List<Alumno> listaAlumnos;

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Secretaria(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "listaAlumnos=" + listaAlumnos +
                '}';
    }

    public List<Alumno> filtrarPorCurso(String curso){
        return listaAlumnos.stream().filter(a -> a.getNombreCurso().equalsIgnoreCase(curso)).toList();
    }

    public void mostrarTodosLosAlumnos(){
        listaAlumnos.forEach(alumno -> System.out.println(alumno));
    }

    public List<Alumno> buscarAlumnosPorLetra(String letra){
        return listaAlumnos.stream().filter(a -> a.getNombre().startsWith(letra)).toList();
    }

    public Long tamanioLista(){
        return listaAlumnos.stream().count();
    }

    public List<Alumno> mayorNota(double nota){
        return listaAlumnos.stream().filter(a -> a.getNotaMedia() > nota).toList();
    }

    public List<Alumno> primerosTresAlumnos(){
        return listaAlumnos.stream().limit(3).toList();
    }

    public List<Alumno> alumnosMasPequnios(){
        return listaAlumnos.stream().min(Comparator.comparing(Alumno::getEdad)).stream().toList();
    }

    public Alumno primerAlumno(){
        return listaAlumnos.stream().findFirst().get();
    }

    public List<Alumno> alumnosConElNombreMasLargoDadoPorParametro(int longitud){
       return listaAlumnos.stream().filter(a -> a.getNombre().length()>longitud).toList();
    }

    public List<Alumno> alumnoPorLaLetraPedidaYLongitudDada(int longitud){
        return listaAlumnos.stream().filter(a-> a.getNombre().startsWith("A") && a.getNombre().length()>=longitud).toList();
    }

}
