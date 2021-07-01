package ParcialFinal.Ejercicio5;

public interface ICelular {
    int getRam();
    int getCpu();
    int getAlmacenamiento();
    int precio();

    void showInfo();

    void setRam(int ram);

    void setCpu(int cpu);

    void setAlmacenamiento(int almacenamiento);

    void setPrecio(int precio);
}
