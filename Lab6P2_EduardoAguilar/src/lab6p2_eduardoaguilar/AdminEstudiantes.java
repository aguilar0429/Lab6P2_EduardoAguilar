
package lab6p2_eduardoaguilar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminEstudiantes {
    private ArrayList<NotaEstudiantes> lista = new ArrayList();
    private File archivo = null;
    
    
    public AdminEstudiantes(String path) {
        archivo = new File(path);
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (NotaEstudiantes t : lista) {
                bw.write(t.getName() + ";");
                bw.write(t.getDate() + ";");
                bw.write(t.getDescripcion() + ";");
                
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
                    lista.add(new NotaEstudiantes(sc.next(),
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

    public ArrayList<NotaEstudiantes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<NotaEstudiantes> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
}
