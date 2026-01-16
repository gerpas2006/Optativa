package ejercicio04;

public class Calculo {

    public double sumarNumeros(double a, double b) throws CalculoException{
        double resul = 0;
        resul = a + b;
        if (resul>10){
            throw new CalculoException("La suma no puede ser mayor que 10");
        }
        return resul;
    }
}
