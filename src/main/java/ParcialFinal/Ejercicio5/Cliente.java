package ParcialFinal.Ejercicio5;


public class Cliente {
    public static  void main(String[]ags){
        ICelular apple = new Apple(5, 9, 32, 1000);

        ICelular samsung = new Samsung(8, 10, 16, 1000);

        ICelular xiaomi = new Xiaomi(3, 8, 32, 1000);

        apple.showInfo();
        samsung.showInfo();
        xiaomi.showInfo();

        apple = new Carcasa(apple, 50);
        samsung = new VidrioTemplado(samsung, 20);
        xiaomi = new Memoria(xiaomi, 64, 100);

        apple.showInfo();
        samsung.showInfo();
        xiaomi.showInfo();

    }

}
