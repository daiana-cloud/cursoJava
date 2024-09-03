import java.util.ArrayList;

public class Colegio {
    private ArrayList <Aula> aulas;
    private String nombre;
    private Director director;

    public Colegio() {

    }

    public ArrayList <Aula>getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList <Aula> aulas ) {
        this.aulas = aulas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getNotaMedia() {


        double cantAlumnos = 0;
        int sumaNotas = 0;

        for (Aula aula : aulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                sumaNotas += alumno.getNotamedia();
                cantAlumnos++;
            }
        }
        if (cantAlumnos > 0) {
            return sumaNotas / cantAlumnos;
        } else {
            return 0;
        }
    }

    public Alumno getMejorAlumno() {

        Alumno mejorAlumno = null;

        for (Aula aula : aulas) { // recorro las aulas
            for (Alumno alumno : aula.getAlumnos()) {
                if (mejorAlumno == null || alumno.getNotamedia() > mejorAlumno.getNotamedia()) {
                    mejorAlumno = alumno;
                }
            }
        }
        if (mejorAlumno != null) {
            System.out.println("Mejor alumno : " + mejorAlumno.getNombre() + " " + mejorAlumno.getApellido());
            System.out.println(" Nota : " + mejorAlumno.getNotamedia());
        } else System.out.println("No se ha encontrado Alumnos");
        return mejorAlumno;
    }

}

