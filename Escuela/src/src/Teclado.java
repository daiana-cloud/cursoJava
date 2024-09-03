public class Teclado extends DispositivoDeEntrada {
    private int idTeclado = 0;
    private static int contTeclados;

    public Teclado(String marca, String tipoDeEntrada) {
        super(marca, tipoDeEntrada);
        this.idTeclado = ++contTeclados;

    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContTeclados() {
        return contTeclados;
    }

    public static void setContTeclados(int contTeclados) {
        Teclado.contTeclados = contTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
