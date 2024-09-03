public class Profesor extends Persona{
    private String especialidad ;
    private Aula[] aulas; // uno o mas

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Aula[] getAulas() {
        return aulas;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }

    public Profesor(String nombre, String apellido, String dni, String especialidad,) {
        super(nombre, apellido, dni);
        this.especialidad = especialidad;

    }
}
