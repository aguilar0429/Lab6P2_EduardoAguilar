package lab6p2_eduardoaguilar;


public class NotasCreativos {
    String titulo;
    String categoria;
    String descripcion;
    String publico;

    public NotasCreativos(String titulo, String categoria, String descripcion, String publico) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.publico = publico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }
    
    
}
