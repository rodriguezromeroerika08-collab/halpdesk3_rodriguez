
package modelo;

public class Tecnico {
    private int id;
    private String nombre;
    private String apellido;
    private String ci;
    private String telefono;
    private String correo;
    private String especialidad;
    private String estado;

    public Tecnico() {
    }

    // Constructor para REGISTRAR (sin id, autoincremental en la BD)
    public Tecnico(String nombre, String apellido, String ci, String telefono, String correo, String especialidad, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    // Constructor completo (para MODIFICAR / traer datos desde la BD)
    public Tecnico(int id, String nombre, String apellido, String ci, String telefono, String correo, String especialidad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
