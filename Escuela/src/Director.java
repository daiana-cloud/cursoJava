public class Director extends Persona{

    private double valoracion;
    private Colegio colegio; // tiene relacion con colegio

    public Director(String nombre, String apellido, String dni, double valoracion) {
        super(nombre, apellido, dni);
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
}
