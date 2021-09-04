package lab6p2_eduardoaguilar;


public class Creativos {
    private String nombre;
    private String apellido;
    private String correo;
    private String ocupacion;
    private int edad;
    private String usuario;
    private String pass;

    public Creativos() {
    }

    public Creativos(String nombre, String apellido, String correo, String ocupacion, int edad, String usuario, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.usuario = usuario;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Creativos{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
