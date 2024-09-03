public class Monitor {
    private int idMonitor;
    private String marca;
    private float tamanio;
    private static int contMonitores =0 ;


    public Monitor(String marca, float tamanio) {
        this.idMonitor = ++contMonitores ;
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public static int getContMonitores() {
        return contMonitores;
    }

    public static void setContMonitores(int contMonitores) {
        Monitor.contMonitores = contMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                '}';
    }
}
