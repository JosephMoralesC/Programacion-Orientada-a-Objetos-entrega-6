package Trabajo6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Leer {
    public static String leer(String EntradaNombre) {
        try {
            String nombre, numero, lineaTexto;
            String nombreBuscado = EntradaNombre;
            String numeroBuscado = "";
            
            File url = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\NetBeansProjects\\Trabajo6\\src\\main\\java\\Trabajo6\\Contacto.txt");
            
            if (!url.exists()) {
                url.createNewFile();
            }
            
            RandomAccessFile txt = new RandomAccessFile(url, "rw");
            
            while (txt.getFilePointer() < txt.length()) {
                lineaTexto = txt.readLine();
                String[] separador = lineaTexto.split("-");
                
                nombre = separador[0];
                numero = separador[1];
                
                if (nombre.equals(nombreBuscado)) {
                    numeroBuscado = numero;
                }
            }
            
            txt.close();
            return numeroBuscado;
        } 
        catch (IOException ioe) {
            System.out.println(ioe);
            return "";
        } 
        catch (NumberFormatException nef) {
            System.out.println(nef);
            return "";
        }
    }
}
