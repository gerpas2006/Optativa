package ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Calculos {

    List<Producto> listaProductos;
    Cuenta cuenta;
    List<Integer> aleatorios = new ArrayList<>();

    public Calculos(List<Producto> listaProductos, Cuenta cuenta) {
        this.listaProductos = listaProductos;
        this.cuenta = cuenta;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Calculos{" +
                "listaProductos=" + listaProductos +
                ", cuenta=" + cuenta +
                '}';
    }

    public int aleatorio() throws ErrorException {
        int min = 1;
        int max = 2;
        int aleatorioEntero = (int)(Math.random() * (max - min + 1)) + min;

        if (aleatorios.contains(aleatorioEntero)) {
            throw new ErrorException("El número generado ya había salido");
        }

        aleatorios.add(aleatorioEntero);
        return aleatorioEntero;
    }


    public List<Producto> cambiarId(Long idABuscar, Long idNuevo)throws ErrorException {
        for (Producto producto:listaProductos){
            if (producto.getId().equals(idNuevo)){
                throw new ErrorException("Ya hay otro producto con ese ID");
            }
        }
        for (Producto producto:listaProductos){
            if (producto.getId().equals(idABuscar)){
                producto.setId(idNuevo);
            }
        }
        return listaProductos;
    }

    public int lanzarNumero(int numero)throws ErrorException{
        if (numero%2!=0){
            throw new ErrorException("El número que has intrducido es impar");
        }
        return numero;
    }

    public void enviarBizum(double cantEnviar)throws ErrorException{
        if (cantEnviar>cuenta.getSaldo()){
            throw new ErrorException("No puedes enviar esa cantidad de dinero por que no la tienes");
        }
        System.out.println("Bizum enviado");
    }

    public List<Producto> buscarDescuento(double descuento)throws ErrorException{
        List<Producto> lista = listaProductos.stream().filter(p -> p.getDescuento()>descuento).toList();
        if (lista.isEmpty()){
            throw new ErrorException("No hay productos con ese descuento");
        }
        return lista;
    }

    public void agregarDinero(double ingresar)throws ErrorException{
        if (ingresar<0){
            throw new ErrorException("No se pueden ingresar número negativos");
        }
        cuenta.setSaldo(ingresar);
        System.out.println("Dinero ingresado correctamente");
    }




}
