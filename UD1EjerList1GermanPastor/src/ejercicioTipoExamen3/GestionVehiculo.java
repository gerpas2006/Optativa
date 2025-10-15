package ejercicioTipoExamen3;

import java.util.List;

public class GestionVehiculo {

    List<Vehiculo> lista;

    public GestionVehiculo(List<Vehiculo> lista) {
        this.lista = lista;
    }

    public List<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(List<Vehiculo> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "GestionVehiculo{" +
                "lista=" + lista +
                '}';
    }

    public Vehiculo buscarVehiculo(String matricula){
        for (Vehiculo v:lista){
            if(v.getMatriculo().equalsIgnoreCase(matricula)){
                return v;
            }
        }
        return null;
    }

    public double calcularPVPDeunVehiculo(String matricula,double limite,double porcentaje){
        Vehiculo v = buscarVehiculo(matricula);
        double resul=0.0;
        resul=v.calcularPVP(limite,porcentaje);
        return resul;
    }

    public double calcularTotal(double limite,double porcentaje){
        double resul=0.0;
        for (Vehiculo v : lista){
            resul+=v.calcularPVP(limite,porcentaje);
        }
        return resul;
    }

    public void listarNoOcupados(){
        for(Vehiculo v : lista){
            if(!v.isOcupado()){
                System.out.println(v);
            }
        }
    }


}
