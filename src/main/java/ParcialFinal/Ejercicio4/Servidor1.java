package ParcialFinal.Ejercicio4;

public class Servidor1 implements ICluster{
    @Override
    public void atender(int id, String nombre, String pwd) {
        System.out.println("*** SERVIDOR 1 *** ");
        System.out.println(" Se esta atendiendo al usuario : "+nombre);
    }
}
