package ejercicio06.ejercicio04;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Administracion {

    private List<Empleado> empleados;

    public Administracion(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Administracion{" +
                "empleados=" + empleados +
                '}';
    }

    public void listarEmpleados(){
        empleados.forEach(System.out::println);
    }

    public double mediaSalario(){
        return empleados.stream().mapToDouble(Empleado::getSalario).average().orElse(0.0);
    }

    public List<Empleado> empleadosActivosYMayorQueLaMedia()throws EmpleadoException{
        List<Empleado> lista = empleados.stream().filter(e -> e.isActivo() && e.getSalario()>mediaSalario()).toList();
        if (lista.isEmpty()){
            throw new EmpleadoException("No se ha encontrado ningun empleado");
        }
        return lista;
    }

    public List<Optional<Empleado>> buscarPorNombre(String nombre){
        return empleados.stream().filter(e -> e.getNombre().equalsIgnoreCase(nombre)).map(Optional::of).collect(Collectors.toList());
    }

    public double calcularSalarioActvos(double anios)throws EmpleadoException{
        if (anios<0){
            throw new EmpleadoException("Los años tienen que ser mayor que 0");
        }
        return empleados.stream().filter(e -> e.isActivo() && e.getAniosAntiguedad()<anios).mapToDouble(Empleado::getSalario).sum();
    }

    public List<Empleado> ranking(){
        return empleados.stream().sorted(Comparator.comparing(Empleado::getSalario)).sorted(Comparator.comparing(Empleado::getAniosAntiguedad).reversed()).toList();
    }
}
