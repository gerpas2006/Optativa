package ejercicioTipoExamen;

import java.util.ArrayList;
import java.util.List;

public class Ventas {

    private List<Producto> lista;

    public Ventas(List<Producto> lista) {
        this.lista = lista;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "lista=" + lista +
                '}';
    }

    public int cant(){
        int resul=0;
        for (int i = 0; i < lista.size(); i++) {
            resul+=lista.get(i).getCant();
        }
        return resul;
    }

    public double calcularRecaudado(double porcentaje){
        double resul=0.0;
        for (int i = 0; i < lista.size(); i++) {
            resul+=lista.get(i).calcularPVP(porcentaje);
        }
        return resul;
    }

    public void mensaje(){
        for (int i = 0; i < lista.size(); i++) {
            if(lista instanceof EspadaLaser){
                System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
            }else {
                System.out.println(lista);
            }
        }

    }
}
