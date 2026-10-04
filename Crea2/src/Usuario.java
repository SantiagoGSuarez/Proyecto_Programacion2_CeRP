abstract class Usuario {
	private String cedula;
	private String nombre_completo;
	private String password;


    public Usuario(String cedula, String nombre_completo, String password) {
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public getRol() {
        // logica de rol
    }

    public verificarLogin() {
        // logica de login
    }


}


