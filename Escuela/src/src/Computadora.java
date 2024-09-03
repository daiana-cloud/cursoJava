public class Computadora {
    private int idComputadora;
    private static int cantComputadoras =0 ;
    private String nombre;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;


    public Computadora(String nombre, Teclado teclado, Mouse mouse, Monitor monitor) {
        this.idComputadora = ++cantComputadoras ;
        this.nombre = nombre;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public static int getCantComputadoras() {
        return cantComputadoras;
    }

    public static void setCantComputadoras(int cantComputadoras) {
        Computadora.cantComputadoras = cantComputadoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
