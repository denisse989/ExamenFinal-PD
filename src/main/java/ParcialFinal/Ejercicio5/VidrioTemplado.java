package ParcialFinal.Ejercicio5;

public class VidrioTemplado implements ICelular{
    ICelular celular;
    int aumento;

    public VidrioTemplado(ICelular celular, int aumento) {
        System.out.println("Se incorporó un vidrio templado");
        System.out.println(" ");
        this.celular = celular;
        this.aumento = aumento;
        this.setPrecio(this.celular.precio() + aumento);
    }

    @Override
    public void showInfo() {
        celular.showInfo();

    }

    @Override
    public int getRam() {
        return celular.getRam();
    }

    @Override
    public void setRam(int ram) {
        celular.setRam(ram);

    }

    @Override
    public int getCpu() {
        return celular.getCpu();
    }

    @Override
    public void setCpu(int cpu) {
        celular.setCpu(cpu);

    }

    @Override
    public int getAlmacenamiento() {
        return celular.getAlmacenamiento();
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        celular.setAlmacenamiento(almacenamiento);

    }

    @Override
    public int precio() {

        return celular.precio();
    }

    @Override
    public void setPrecio(int precio) {
        celular.setPrecio(precio);

    }
}
