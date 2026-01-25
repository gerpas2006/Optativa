package ejercicio06.ejercicio01;


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

    public List<Alumno> filtrarPorCurso(String curso) throws AlumnoException{
        List<Alumno>listaAlumnosFiltrado = listaAlumnos.stream().filter(a -> a.getNombreCurso().equalsIgnoreCase(curso)).toList();
        if (listaAlumnosFiltrado.isEmpty()){
            throw new AlumnoException("No se ha encontrado ningún alumno");
        }
        return listaAlumnosFiltrado;
    }

    public void mostrarTodosLosAlumnos(){
        listaAlumnos.forEach(System.out::println);
    }

    public List<Alumno> buscarAlumnosPorLetra(String letra)throws AlumnoException{
        List<Alumno> listaAlumnoFiltrado = listaAlumnos.stream().filter(a -> a.getNombre().startsWith(letra)).toList();
        if (listaAlumnoFiltrado.isEmpty()){
            throw new AlumnoException("No se ha encontrado a ningun alumno");
        }
        return listaAlumnoFiltrado;
    }

    public Long tamanioLista(){
        return listaAlumnos.stream().count();
    }

    public List<Alumno> mayorNota(double nota)throws AlumnoException{
        if (nota>10 || nota<0){
            throw new AlumnoException("Las notas nop pueden se ni mayor de 10 ni menor de 0");
        }
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

    public List<Alumno> alumnosConElNombreMasLargoDadoPorParametro(int longitud)throws AlumnoException{
        if (longitud<0){
            throw new AlumnoException("La longitud no puede ser menor a 0");
        }
        List<Alumno> alumosFiltrados = listaAlumnos.stream().filter(a -> a.getNombre().length()>longitud).toList();
        if (alumosFiltrados.isEmpty()){
            throw new AlumnoException("No se ha encontrado ningun alumno con esa longitud");
        }
        return alumosFiltrados;
    }

    public List<Alumno> alumnoPorLaLetraPedidaYLongitudDada(int longitud)throws AlumnoException{
        if (longitud<0){
            throw new AlumnoException("La longitud del nom nombre del alumno no puede ser menor que 0");
        }
        List<Alumno> alumnoFiltrado = listaAlumnos.stream().filter(a-> a.getNombre().startsWith("A") && a.getNombre().length()>=longitud).toList();
        if (alumnoFiltrado.isEmpty()){
            throw new AlumnoException("No se ha encontrado ningun alumno");
        }
        return alumnoFiltrado;
    }

}

