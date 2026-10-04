public class Docente extends Usuario {
    private String asignatura;
    private String curso;

    public Docente(String cedula, String nombre_completo, String password, String asignatura, String curso) {
        super(cedula, nombre_completo, password);
        this.asignatura = asignatura;
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}