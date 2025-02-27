package Trabajo6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Eliminar {
    public static String eliminar(String EntradaNombre, long EntradaNumero) {
        try {
            String lineaTexto, resultado, nombre;
            String nuevoNombre = EntradaNombre;
            int index;
            long nuevoNumero = EntradaNumero;
            long numero;
            boolean duplicado = false;
            
            File url = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\NetBeansProjects\\Trabajo6\\src\\main\\java\\Trabajo6\\Contacto.txt");
            if (!url.exists()) {
                url.createNewFile();
            }
            
            RandomAccessFile txt = new RandomAccessFile(url, "rw");
            while (txt.getFilePointer() < txt.length()) {
                lineaTexto = txt.readLine();
                String[] separador = lineaTexto.split("-");
                nombre = separador[0];
                numero = Long.parseLong(separador[1]);
                if (nombre.equals(nuevoNombre) || numero == nuevoNumero) {
                    duplicado = true;
                    break;
                }
            }
            
            if (duplicado) {
                File urlTemp = new File("temp.txt");
                RandomAccessFile txtTemp = new RandomAccessFile(urlTemp, "rw");
                txt.seek(0);
                
                while (txt.getFilePointer() < txt.length()) {
                    lineaTexto = txt.readLine();
                    index = lineaTexto.indexOf('-');
                    nombre = lineaTexto.substring(0, index);
                    if (nombre.equals(nuevoNombre)) {
                        continue;
                    }
                    txtTemp.writeBytes(lineaTexto);
                    txtTemp.writeBytes(System.lineSeparator());
                }
                
                txt.seek(0);
                txtTemp.seek(0);
                
                while (txtTemp.getFilePointer() < txtTemp.length()) {
                    txt.writeBytes(txtTemp.readLine());
                    txt.writeBytes(System.lineSeparator());
                }
                
                txt.setLength(txtTemp.length());
                txtTemp.close();
                txt.close();
                urlTemp.delete();
                
                resultado = "Usuario " + nuevoNombre + " fue borrado con éxito";
                return resultado;
            } else {
                txt.close();
                resultado = "El nombre ingresado no existe.";
                return resultado;
            }
        } catch (IOException e) {
            return "Error al eliminar el usuario: " + e.getMessage();
        }
    }
}
