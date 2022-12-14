import java.io.*;
import java.util.Scanner;

public class EjercicioInputStreamYprintStream {
    //TODO Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en
    // "fileOut".

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen:");
        String ficheroOriginal = in.next();//Copias el fichero
        System.out.println("Introduce el fichero destino");
        String ficheroCopia = in.next();//Pegas el fichero
        copiaYpega(ficheroOriginal, ficheroCopia);
    }

    public static void copiaYpega(String fileIn, String fileOut) {
      File fichero = new File("Ficheros/" + fileIn + ".txt");
      //----Supongo que no hace falta para el ejercicio...
        if (!(fichero.exists())){
            System.err.println(fileIn+" no existe este fichero");
            return;
        }
        if (buscarArchivo(fileOut+".txt", Paths.get("Ficheros/").toFile())){
            System.err.println("No se ha podido copiar porque "+"'"+fileOut+"'"+" ya existe");
            return;
        }
        //------------------------------------------
        InputStream in = null;
        PrintStream out = null;
        try {
            in = new FileInputStream(fichero);
            byte[] datos = in.readAllBytes();
            out = new PrintStream("Ficheros/" + fileOut + ".txt");
            out.write(datos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                    assert out != null;
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //Se me ocurrió la idea pero supongo que no necesita para este ejercicio
    public static boolean buscarArchivo(String nombreFichero, File carpeta) {
        String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
            return false;
        }
        else {
            for (int i=0; i< listado.length; i++) {
                if (listado[i].equals(nombreFichero)) {
                    return true;
                }
            }
        }
        return false;
    }
}
