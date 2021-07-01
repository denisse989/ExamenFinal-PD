package ParcialFinal.Ejercicio2;
import java.util.Random;
public class Gasolina implements ICuadratrack{
    int capacidad;
    @Override
    public void llenarGasolina(int capacidad) {
        this.capacidad=capacidad;
        System.out.println("Nueva capacidad gasolina: "+this.capacidad);
        System.out.println(" ");
    }

    @Override
    public int estadoCombustible() {
        Random rd = new Random();
        int numero = rd.nextInt(49)+1;
        System.out.println("Estado de combustible de Cuadratrack de Gasolina: "+numero);
        System.out.println(" ");
        return numero;
    }


}
