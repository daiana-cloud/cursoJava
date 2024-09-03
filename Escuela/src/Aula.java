import java.util.ArrayList;

public class Aula {
   // private Alumno [] alumno; // agregacion con alumno o más .
    private ArrayList<Alumno> alumnos;
    private Profesor profesor ; // composicion con pf
    private String idAula;

    public Aula(String idAula ,Profesor prof ) {
        this.idAula = idAula;
    }



    public ArrayList<Alumno> getAlumnos() {

        return alumnos;
    }

    public void setAlumno( ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor j) {
        this.profesor = j;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }
}
