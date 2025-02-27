package Trabajo6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class Crear {
    public static String crear(String EntradaNombre, long EntradaNumero) {
        try {
            String lineaTexto, resultado, nombre;
            String nuevoNombre = EntradaNombre;
            long numero;
            long nuevoNumero = EntradaNumero;
            boolean duplicado = false;
            
            File url = new File("C:\\Users\\gabri\\OneDrive\\Documentos\\NetBeansProjects\\Trabajo6\\src\\main\\java\\Trabajo6\\Contacto.txt");
            if (!url.exists()) {
                url.createNewFile();
            }
            
            RandomAccessFile txt = new RandomAccessFile(url, "rw");
            while (txt.getFilePointer() < txt.length()) {
                lineaTexto = txt.readLine();
                String[] lineSplit = lineaTexto.split("-");
                nombre = lineSplit[0];
                numero = Long.parseLong(lineSplit[1]);
                
                if (nombre == nuevoNombre || numero == nuevoNumero) {
                    duplicado = true;
                    break;
                }
            }
            
            if (duplicado == false) {
                lineaTexto = nuevoNombre + "-" + String.valueOf(nuevoNumero);
                txt.writeBytes(lineaTexto);
                txt.writeBytes(System.lineSeparator());
                resultado = "El usuario " + nuevoNombre + ", con identificacion " + nuevoNumero + " fue registrado con exito";
                txt.close();
            } else {
                txt.close();
                resultado = "El usuario y numero ingresados ya fue registrado";
            }
            
            return resultado;
        } catch (IOException ioe) {
            System.out.println(ioe);
            return "";
        } catch (NumberFormatException nef) {
            System.out.println(nef);
            return "";
        }
    }
}
