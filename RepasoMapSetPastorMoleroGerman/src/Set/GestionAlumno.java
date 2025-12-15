package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class GestionAlumno {

    private Set<Alumno> alumno;

    public GestionAlumno(Set<Alumno> alumno) {
        this.alumno = (Set<Alumno>) alumno;
    }

    public Set<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(Set<Alumno> alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "GestionAlumno{" +
                "alumno=" + alumno +
                '}';
    }

    public void mostrarTodos(){
        for (Alumno al: alumno){
            System.out.println(al);
        }
    }

    public void agregarAlumno(Alumno al){
        alumno.add(al);
    }

    public Alumno buscarPorId(Long id){
        for (Alumno al: alumno){
            if (al.getId()==id){
                return al;
            }
        }
        return null;
    }

    public void eliminarPorId(Long id){
        Alumno alumnoBuscado = buscarPorId(id);
        alumno.remove(alumnoBuscado);
    }

    public void editarAlumno(Long id,Alumno alumnoNuevo){
            Alumno alumnoBuscado = buscarPorId(id);
            alumnoBuscado.setId(alumnoNuevo.getId());
            alumnoBuscado.setNota(alumnoNuevo.getNota());
            alumnoBuscado.setNombre(alumnoNuevo.getNombre());
    }

    public double mediaDeNotas(){
        double suma =0;
        for (Alumno al: alumno){
            suma += al.getNota();
        }
        return suma / alumno.size();
    }

    public Set<Alumno> alumnosConLaNotaMasAlta(){
        Set<Alumno> alumnosConNotaMasBuena= new HashSet<>();
        double notaMasAlta=0;
        notaMasAlta = alumno.stream().mapToDouble(Alumno::getNota).max().orElse(0.0);
        for (Alumno al: alumno){
            if (al.getNota()==notaMasAlta){
                alumnosConNotaMasBuena.add(al);
            }
        }
        return alumnosConNotaMasBuena;

    }




}
