package lab6p2_eduardoaguilar;


public class NotaEstudiantes {
    private String name;
    private String date;
    private String descripcion;
    private String usuario;

    public NotaEstudiantes(String name, String date, String descripcion,String usuario) {
        this.name = name;
        this.date = date;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
