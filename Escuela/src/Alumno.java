public class Alumno extends Persona {

    private String curso;
    private Double notamedia;
    private Aula aula;// relacion con aula

    public Alumno(String nombre, String apellido, String dni, String curso, Double notamedia) {
        super(nombre, apellido, dni);
        this.curso = curso;
        this.notamedia = notamedia;

    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(Double notamedia) {
        this.notamedia = notamedia;
    }
}
