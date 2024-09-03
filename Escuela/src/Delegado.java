public class Delegado extends Alumno {

    private double valoracion;

    public Delegado(String nombre, String apellido, String dni, String curso, Double notamedia, double valoracion) {
        super(nombre, apellido, dni, curso, notamedia);
        this.valoracion = valoracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}
