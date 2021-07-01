package ParcialFinal.Ejercicio2;
import java.util.Random;
public class GasolinaEspecial implements ICuadratrack{
    int capacidad;

    @Override
    public void llenarGasolina(int capacidad) {
        this.capacidad=capacidad;
        System.out.println("Nueva capacidad gasolina especial: "+this.capacidad);
        System.out.println(" ");
    }

    @Override
    public int estadoCombustible() {
        Random rd = new Random();
        int numero = rd.nextInt(49)+1;
        System.out.println("Estado de combustible de Cuadratrack de gasolina especial: "+numero);
        System.out.println(" ");
        return numero;
    }
}
