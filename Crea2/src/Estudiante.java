public class Estudiante extends Usuario {
    private String curso;

    public Estudiante(String cedula, String nombre_completo, String password, String curso) {
        super(cedula, nombre_completo, password);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}