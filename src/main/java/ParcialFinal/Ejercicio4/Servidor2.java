package ParcialFinal.Ejercicio4;

public class Servidor2 implements ICluster{
    @Override
    public void atender(int id, String nombre, String pwd) {
        System.out.println("*** SERVIDOR 2 *** ");
        System.out.println(" Se esta atendiendo al usuario : "+nombre);
    }
}
