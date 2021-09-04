package lab6p2_eduardoaguilar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class AdminCrea {
    ArrayList<NotasCreativos> lista = new ArrayList();
    File archivo = null;
    public AdminCrea(String path) {
        archivo = new File(path);
    }

    public ArrayList<NotasCreativos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<NotasCreativos> lista) {
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
            for (NotasCreativos t : lista) {
                bw.write(t.getTitulo() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getDescripcion() + ";");
                bw.write(t.getPublico()+";");
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
                    lista.add(new NotasCreativos(sc.next(),
                                    sc.next(),
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
