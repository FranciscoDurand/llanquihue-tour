package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de leer el archivo de texto y cargar los tours en una colección.
 */
public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Lectura del archivo línea por línea
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Separa los datos usando punto y coma
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String tipo = datos[1];
                int precio = Integer.parseInt(datos[2]);

                // Crea el objeto y lo agrega al ArrayList
                Tour tour = new Tour(nombre, tipo, precio);
                listaTours.add(tour);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}
