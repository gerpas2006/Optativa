package ExamenT1PastorGerman;

import java.util.List;

public class Parking {

    private String direccion;
    private List<Vehiculo> lista;

    public Parking(String direccion, List<Vehiculo> lista) {
        this.direccion = direccion;
        this.lista = lista;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(List<Vehiculo> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "direccion='" + direccion + '\'' +
                ", lista=" + lista +
                '}';
    }


    public void comprobarTamanyo(double longMax){
        for(Vehiculo v : lista){
            if(v instanceof Furgoneta){
                ((Furgoneta) v).avisarLongitud(longMax);
            }
        }
    }

    public double calcularRecaudadoMotos(double precio,double cantPorMetro){
        double resul=0.0;
        for (Vehiculo v : lista){
            if(v instanceof Motos){
                resul+=v.calcularPVP(precio,cantPorMetro);
            }
        }
        return resul;
    }

    public Vehiculo buscarVehiculo(String matricula){
        for (Vehiculo v : lista){
            if(v.getMatricula().equalsIgnoreCase(matricula)){
                return v;
            }
        }
        return null;
    }

    public double calcularPrecioUnVehiculo(String matricula,double precio,double cantPorMetro){
       Vehiculo v = buscarVehiculo(matricula);
        double resul=0.0;
        resul = v.calcularPVP(precio,cantPorMetro);
        return resul;
    }

    public void mostrarDatos(double longMax){
        for (Vehiculo v : lista){
            if (v instanceof Furgoneta){
                ((Furgoneta) v).avisarLongitud(longMax);
            }
            System.out.println(v);

        }
    }
}
