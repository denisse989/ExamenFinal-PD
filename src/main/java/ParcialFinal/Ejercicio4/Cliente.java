package ParcialFinal.Ejercicio4;




public class Cliente {
    public static void main (String[] args){
       Proxy proxy= new Proxy(new Servidor1(),new Servidor2());
        proxy.registrar(2,"JUAN1","123");
        proxy.registrar(4,"JUAN2","123");

        proxy.atender(2,"JUAN1","123");
        proxy.atender(4,"JUAN2","123");



    }
}
