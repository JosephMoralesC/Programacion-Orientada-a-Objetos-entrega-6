package Trabajo6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Actualizar {
    public static String actualizar(String EntradaNombre, Long EntradaNumero) {
        try {
            String nombre, lineaTexto, resultado;
            String nuevoNombre = EntradaNombre;
            boolean duplicado = false;
            Long nuevoNumero = EntradaNumero;
            long numero;
            int index;
            
            File url = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\NetBeansProjects\\Trabajo6\\src\\main\\java\\Trabajo6\\contacto.txt");
            if (!url.exists()) {
                url.createNewFile();
            }
            
            RandomAccessFile txt = new RandomAccessFile(url, "rw");
            while (txt.getFilePointer() < txt.length()) {
                lineaTexto = txt.readLine();
                String[] separador = lineaTexto.split("-");
                nombre = separador[0];
                numero = Long.parseLong(separador[1]);
                System.out.println(nombre.equals(nuevoNombre));
                if (nombre.equals(nuevoNombre)) {
                    duplicado = true;
                    break;
                }
            }
            
            if (duplicado == true) {
                File urlTemp = new File("temp.txt");
                RandomAccessFile txtTemp = new RandomAccessFile(urlTemp, "rw");
                txt.seek(0);
                
                while (txt.getFilePointer() < txt.length()) {
                    lineaTexto = txt.readLine();
                    index = lineaTexto.indexOf('-');
                    nombre = lineaTexto.substring(0, index);
                    if (nombre.equals(nuevoNombre)) {
                        lineaTexto = nombre + "-" + String.valueOf(nuevoNumero);
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
                resultado = "El usuario " + nuevoNombre + " fue actualizado en el registro";
                return resultado;
            } else {
                txt.close();
                resultado = "el nombre ingresado no esta en registro";
                return resultado;
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
            return "";
        } catch (NumberFormatException nef) {
            System.out.println(nef);
            return "";
        }
    }
}
