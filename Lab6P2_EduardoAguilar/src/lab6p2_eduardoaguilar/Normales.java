package lab6p2_eduardoaguilar;


public class Normales {
    private String nombre;
    private String apellido;
    private String correo;
    private String hobbie;
    private String intereses;
    private String usuario;
    private String pass;

    public Normales() {
    }

    public Normales(String nombre, String apellido, String correo, String hobbie, String intereses, String usuario, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.hobbie = hobbie;
        this.intereses = intereses;
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

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
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
        return "Normales{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", hobbie=" + hobbie + ", intereses=" + intereses + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
}
