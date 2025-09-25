package ejercicio08;

public class Gestion {

    private Plataforma p;

    public Gestion(Plataforma p) {
        this.p = p;
    }

    public Plataforma getP() {
        return p;
    }

    public void setP(Plataforma p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Gestion{" +
                "p=" + p +
                '}';
    }

    public double calcularPrecio(double descuento,boolean anuncios){
        double resultado;
        if(anuncios){
            resultado = getP().getPrecio()-(getP().getPrecio() * descuento)/100;
        }else{
            resultado = (getP().getPrecio()-(getP().getPrecio() * descuento)/100)+5;

        }
        return resultado;
    }

}
