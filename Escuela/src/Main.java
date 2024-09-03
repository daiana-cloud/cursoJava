import java.util.ArrayList;
import java.util.List;
import java.util.Scanner ;
public class Main {

    private static List<Colegio> colegios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion = 0;

        while (!salir) {
            System.out.println("---- SELECCINAR UNA OPCIÓN ----");
            System.out.println("1. Cargar colegios ");
            System.out.println("2. Agregar colegio ");
            System.out.println("3. Imprimir estadisticas del colegio ");
            System.out.print("4. Salir ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Error, ingresó un numero incorrecto ");
            } catch (Exception x) {
                System.out.println("Error");
            }

            switch (opcion) {
                case 1:
                    cargarColegios();
                    break;
                case 2:
                    agregarColegio();
                    break;
                case 3:
                    imprimirEstadisticasDelColegio();
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    System.out.println("Opción inválida");

            }
        }
    }
    public static void cargarColegios() {

    }
    public static void agregarColegio (){
        Colegio colegio = new Colegio() ;
        System.out.println("Ingresar nombre del colegio : ");
        String nombre = scanner.nextLine();
        colegio.setNombre(nombre);
        System.out.println("Ingresar los datos del Director : ");
        Director director = crearDirector();

        colegio.setDirector(director);

        boolean crearAulas = true;


        while (crearAulas) {
            Aula aula = crearAula();
            colegio.getAulas().add(aula);

            System.out.println("Desea agregar otro aula ? S/N");
            crearAulas = scanner.nextLine().equalsIgnoreCase("s");
        }
        colegios.add(colegio );
        System.out.println(" Colegio Agregado ");

    }
    public static Director crearDirector () {
        System.out.println("Nombre :");
        String nombre = scanner.nextLine();
        System.out.println(" Apellido :");
        String apellido = scanner.nextLine();
        System.out.println(" Número de documento : ");
        String dni = scanner.nextLine();
        System.out.println(" Valoración : ");
        double valoracion = scanner.nextDouble();
        scanner.nextLine();
        return new Director(nombre, apellido, dni, valoracion);


    }
    public static Aula crearAula () {
        System.out.println(" Ingresar ID del aula ");
        String idAula = scanner.nextLine();
        System.out.println(" Ingresar los datos del  Profesor :");
        Profesor profesor = crearProfesor();
        Aula aula = new Aula(idAula, profesor);

        boolean crearAlumnos = true;

        while (crearAlumnos) {
            Alumno alumno = crearAlumno();
            aula.getAlumnos().add(alumno);

            System.out.println(" Desea agregar otro alumno ? S/N ");
            crearAlumnos = scanner.nextLine().equalsIgnoreCase("s");
        }
        return aula;
    }
        public static Alumno crearAlumno(){
            System.out.println(" Nombre del alumno :");
            String nombre = scanner.nextLine();
            System.out.println(" Apellido :");
            String apellido = scanner.nextLine();
            System.out.println(" Nùmero de documento :");
            String dni = scanner.nextLine();
            System.out.println(" curso");
            String curso = scanner.nextLine() ;
            System.out.println(" nota media : ");
            double notaMedia= scanner.nextDouble();
            scanner.nextLine();

            return new Alumno(nombre, apellido, dni, curso, notaMedia );
        }
        public static Profesor crearProfesor (){
            System.out.println("Nombre del profesor :");
            String nombre = scanner.nextLine();
            System.out.println("Apellido :");
            String apellido = scanner.nextLine();
            System.out.println(" DNI :");
            String dni = scanner.nextLine() ;
            System.out.println(" especialidad :");
            String especialidad = scanner.nextLine();

            return new Profesor(nombre , apellido , dni, especialidad );
        }



    public static void imprimirEstadisticasDelColegio (){

    }

}
