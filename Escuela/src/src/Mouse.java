public class Mouse extends DispositivoDeEntrada {

    private int idMouse =0;
    private static int contMouse;

    public Mouse(String marca, String tipoDeEntrada) {
        super(marca, tipoDeEntrada);
        this.idMouse = ++contMouse ;
    }

    public int getIdMouse() {
        return idMouse;
    }

    public void setIdMouse(int idMouse) {
        this.idMouse = idMouse;
    }

    public static int getContMouse() {
        return contMouse;
    }

    public static void setContMouse(int contMouse) {
        Mouse.contMouse = contMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                '}';
    }
}
