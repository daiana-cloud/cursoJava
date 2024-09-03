import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Orden {
    private int idOrden;
    private ArrayList<Computadora> computadoras;
    private static int contadorOrdenes = 0;
    private static final int MAX_COMPUTADORAS = 3;


    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new ArrayList<>();
    }

    public void mostrarOrden() { //metodos
        System.out.println("Orden ID: " + idOrden);
        if (computadoras.isEmpty()) {
            System.out.println("No hay computadoras en esta orden");
        } else {
            for (Computadora computadora : computadoras) {
                System.out.println(computadora);
            }
        }
    }

    public void agregarComputadora(Computadora computadora) {

        if (computadoras.size() < MAX_COMPUTADORAS) { // verifico si la lista es menor
            computadoras.add(computadora);
            System.out.println("Computadora añadida :  " + computadora );// añado y muestro msj
        } else {
            System.out.println("Capacidad máxima alcanzada, no se pueden agragar mas computadoras ");
        }
    }

    public boolean borrarComputadora(int idComputadora) {

        for (Computadora c : computadoras ){
            if (c.getIdComputadora() == idComputadora ){
                computadoras.remove(c);
                return true;
            }
        }

        return false;


    }

    public void imprimirOrden () {

        String nombreArchivo = "Ordenes" + idOrden  + ".txt";


        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            escritor.write("Hora de ejecucion: " + LocalDateTime.now()+ "\n");
            if (computadoras.isEmpty()) {
                System.out.println("No hay computadoras en esta orden");
                return;
            } else {
                for (Computadora computadora : computadoras) {
                    System.out.println(computadora);
                    escritor.write("Computadora " + computadora.toString() + "\n");
                }
            }

            escritor.close();
            System.out.println("Orden guardada en el archivo : \n" + nombreArchivo);
        } catch (IOException e) {
            System.err.println("No se pudo escribir el archivo");
        }
    }
    public List<Computadora> getComputadoras() {
        return  computadoras;
    }
}

