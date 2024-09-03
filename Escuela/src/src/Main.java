import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Orden> ordenes = new ArrayList<>();

    public static void main(String[] args) {


        boolean salir = false;
        int opcion =0;

        while (!salir) {
            System.out.println("1. Crear orden");
            System.out.println("2. Ver órdenes");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n){
                System.out.println("Error, ingresó un numero incorrecto ");
            } catch (Exception x){
                System.out.println("Error");
            }

            switch (opcion) {
                case 1:
                   Orden orden = crearOrden();
                   if (orden != null){
                       ordenes.add(orden);
                   }
                    break;
                case 2:
                    verOrdenes();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static Orden crearOrden() {
        Orden orden = new Orden();
        boolean terminarOrden = false;
        int opcion = 0 ;

        while (!terminarOrden) {
            System.out.println("1. Crear computadora");
            System.out.println("2. Ver computadoras en orden");
            System.out.println("3. Borrar computadora");
            System.out.println("4. Terminar orden");
            System.out.println("5. Imprimir orden");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n){
                System.out.println("Error, ingresó un numero incorrecto ");
            } catch (Exception x){
                System.out.println("Error");
            }


            switch (opcion) {
                case 1:
                    crearComputadora(orden);
                    break;
                case 2:
                    orden.mostrarOrden();
                    break;
                case 3:
                    borrarComputadora(orden);
                    break;
                case 4:
                    terminarOrden = true;
                    break;
                case 5 :
                    orden.imprimirOrden();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        return orden;

    }

        private static void crearComputadora(Orden orden) {
            System.out.print("Nombre de la computadora: ");
            String nombre = scanner.nextLine();

            System.out.print("Marca del monitor: ");
            String marcaMonitor = scanner.nextLine();
            System.out.print("Tamaño del monitor: ");
            float tamanioMonitor = Float.parseFloat(scanner.nextLine());

            Monitor monitor = new Monitor(marcaMonitor, tamanioMonitor);

            System.out.print("Tipo de teclado: ");
            String tipoTeclado = scanner.nextLine();
            System.out.print("Marca del teclado: ");
            String marcaTeclado = scanner.nextLine();
            Teclado teclado = new Teclado(tipoTeclado, marcaTeclado);

            System.out.print("Tipo de mouse: ");
            String tipoMouse = scanner.nextLine();
            System.out.print("Marca del mouse: ");
            String marcaMouse = scanner.nextLine();
            Mouse mouse = new Mouse(tipoMouse, marcaMouse);

            Computadora computadora = new Computadora(nombre, teclado, mouse, monitor);
            orden.agregarComputadora(computadora);
        }

        private static void borrarComputadora(Orden orden) {
            orden.mostrarOrden();
            System.out.print("Introduce el ID de la computadora a borrar: ");
            int idComputadora = scanner.nextInt();
            scanner.nextLine();
            orden.borrarComputadora(idComputadora);
        }

        private static void verOrdenes() {
            if (ordenes.isEmpty()) {
                System.out.println("No hay órdenes disponibles.");
            } else {
                for (Orden orden : ordenes) {
                    orden.mostrarOrden();
                    System.out.println();
                }
            }
        }

    }




