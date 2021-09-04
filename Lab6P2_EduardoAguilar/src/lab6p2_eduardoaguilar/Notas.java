package lab6p2_eduardoaguilar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Notas {
    private String name;
    private String creacion;
    private String prioridad;
    private String content;
    
    private String user;
    
    

    public Notas(String name, String creacion, String prioridad, String content, String user) {
        this.name = name;
        this.creacion = creacion;
        this.prioridad = prioridad;
        this.content = content;
        this.user = user;
    }
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreacion() {
        return creacion;
    }

    public void setCreacion(String creacion) {
        this.creacion = creacion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Notas{" + "name=" + name + ", creacion=" + creacion + ", prioridad=" + prioridad + ", content=" + content + '}';
    }
    
    
    

   
    
    
    
    
    
    
    
}
