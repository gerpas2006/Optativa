package ejercicio01;

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
}
