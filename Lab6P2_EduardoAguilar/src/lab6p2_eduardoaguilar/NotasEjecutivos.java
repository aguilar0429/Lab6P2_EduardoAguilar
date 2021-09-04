package lab6p2_eduardoaguilar;


public class NotasEjecutivos {
    String titulo;
    int invitadas;
    String descripcion;
    String asunto;

    public NotasEjecutivos(String titulo, int categoria, String descripcion, String publico) {
        this.titulo = titulo;
        this.invitadas = categoria;
        this.descripcion = descripcion;
        this.asunto = publico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getInvitadas() {
        return invitadas;
    }

    public void setInvitadas(int invitadas) {
        this.invitadas = invitadas;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    
}
