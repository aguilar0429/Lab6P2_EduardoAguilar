package lab6p2_eduardoaguilar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AdminEje {
    ArrayList<NotasEjecutivos> lista = new ArrayList();
    File archivo = null;
    
    
    public AdminEje(String path) {
        archivo = new File(path);
    }

    public ArrayList<NotasEjecutivos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<NotasEjecutivos> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (NotasEjecutivos t : lista) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getInvitadas() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getAsunto()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new NotasEjecutivos(sc.next(),
                                    sc.nextInt(),
                                    sc.next(),
                            sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
