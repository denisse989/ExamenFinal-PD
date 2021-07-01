package ParcialFinal.Ejercicio4;
import java.util.ArrayList;
import  java.util.List;

public class Proxy implements ICluster{
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<Usuario>usuarios;

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
        usuarios = new ArrayList<>();
    }
    public void registrar(int id,String nombre,String pwd){
        usuarios.add(new Usuario(id,nombre,pwd));

    }

    @Override
    public void atender(int id, String nombre, String pwd) {
        for (Usuario user :usuarios) {
            if (login(user,pwd)&&esprimo(id)){
                servidor1.atender(id,nombre,pwd);
                user.showInfo();
            }else{
                servidor2.atender(id,nombre,pwd);
                user.showInfo();
            }
        }

    }

    private boolean esprimo(int id) {
        int contador=2;
        boolean primo=true;
        while ((primo)&&(contador!=id)) {
           if (id%contador==0){
               primo=false;
               contador++;
           }
        }
        return primo;
    }

    private boolean login(Usuario user, String pwd) {
        if(pwd)
    }
}
