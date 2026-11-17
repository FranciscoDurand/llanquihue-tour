package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal que ejecuta el sistema, recorre la colección y filtra resultados.
 */
public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();

        // Carga los datos desde la ruta relativa del proyecto en IntelliJ
        ArrayList<Tour> tours = gestor.cargarTours("src/resources/tours.txt");

        // 1. Muestra todos los elementos de la colección (recorrido)
        System.out.println("--- Catálogo Completo Llanquihue Tour ---");
        for (Tour t : tours) {
            System.out.println(t.toString());
        }

        // 2 y 3. Filtra según condición (tipo == "Gastronomico") e imprime resultados
        System.out.println("\n--- Tours Gastronómicos Disponibles ---");
        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase("Gastronomico")) {
                System.out.println(t.toString());
            }
        }
    }
}