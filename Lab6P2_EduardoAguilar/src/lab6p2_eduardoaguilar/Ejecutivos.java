package lab6p2_eduardoaguilar;

public class Ejecutivos {
    private String nombre;
    private String apellido;
    private String correo;
    private String cargo;
    private String empresa;
    private String Tuniversitario;
    private String Tmaestria;
    private String usuario;
    private String pass;

    public Ejecutivos() {
    }

    public Ejecutivos(String nombre, String apellido, String correo, String cargo, String empresa, String Tuniversitario, String Tmaestria, String usuario, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cargo = cargo;
        this.empresa = empresa;
        this.Tuniversitario = Tuniversitario;
        this.Tmaestria = Tmaestria;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTuniversitario() {
        return Tuniversitario;
    }

    public void setTuniversitario(String Tuniversitario) {
        this.Tuniversitario = Tuniversitario;
    }

    public String getTmaestria() {
        return Tmaestria;
    }

    public void setTmaestria(String Tmaestria) {
        this.Tmaestria = Tmaestria;
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
        return "Ejecutivos{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", cargo=" + cargo + ", empresa=" + empresa + ", Tuniversitario=" + Tuniversitario + ", Tmaestria=" + Tmaestria + ", usuario=" + usuario + ", pass=" + pass + '}';
    }
    
    
    
}
