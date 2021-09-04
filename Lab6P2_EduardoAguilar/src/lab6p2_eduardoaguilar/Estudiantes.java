package lab6p2_eduardoaguilar;


public class Estudiantes {
    private String nombre;
    private String apellido;
    private String correo;
    private String carrera;
    private Object anio;
    private String usuario;
    private String pass;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String correo, String carrera, Object anio, String usuario, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.carrera = carrera;
        this.anio = anio;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Object getAnio() {
        return anio;
    }

    public void setAnio(Object anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", carrera=" + carrera + ", anio=" + anio + '}';
    }
    
    
    
}
