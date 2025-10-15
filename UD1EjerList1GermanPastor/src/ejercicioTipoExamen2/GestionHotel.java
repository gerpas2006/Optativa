package ejercicioTipoExamen2;

import java.util.List;

public class GestionHotel {

    List<Habitacion> lista;

    public GestionHotel(List<Habitacion> lista) {
        this.lista = lista;
    }

    public List<Habitacion> getLista() {
        return lista;
    }

    public void setLista(List<Habitacion> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "GestionHotel{" +
                "lista=" + lista +
                '}';
    }

    public Habitacion buscarHabitacion(String nombreCliente){
        for(Habitacion h : lista){
            if(h.getNombreCliente().equalsIgnoreCase(nombreCliente)){
                return h;
            }
        }
        return null;
    }

    public double calcularPrecioElegida(String nombreCliente,double porcentaje,double precioLimpieza){
        Habitacion h= buscarHabitacion(nombreCliente);
        double resul=0.0;
        resul=h.calcularPVP(porcentaje,precioLimpieza);
        return resul;
    }

    public double calcularRecaudado(double porcentaje,double precioLimpieza){
        double resul=0.0;
        for (Habitacion h:lista){
            if(h.isOcupado()){
                resul+=h.calcularPVP(porcentaje,precioLimpieza);
            }
        }
        return resul;
    }

    public void mostrarOcupadas(){
        for (Habitacion h: lista){
            if(!h.isOcupado()){
                System.out.println(h);
            }
        }
    }


}
