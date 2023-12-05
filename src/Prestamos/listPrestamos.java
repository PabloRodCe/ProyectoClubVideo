package Prestamos;


import Peliculas.Pelicula;

import java.util.LinkedList;
import java.util.Queue;

public class listPrestamos {

    private Queue<Prestamo> queuePrestamo = new LinkedList<>();

    public void agregarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula) {
        try {
            Prestamo nuevoPrestamo = new Prestamo(numero, estado, fecha, cliente, pelicula);
            Pelicula peli = new Pelicula(pelicula, "");
        
            if (queuePrestamo.contains(nuevoPrestamo)) {
                System.out.println("El préstamo con el número " + numero + " ya existe en la lista");
            } else {
                queuePrestamo.add(nuevoPrestamo);
                System.out.println("Préstamo agregado exitosamente");
            }
        } catch (Exception e) {
            System.err.println("Error al agregar préstamo: " + e.getMessage());
        }
    }

    public void mostrarPrestamos() {
        try {
            for (Prestamo prestamo : queuePrestamo) {
                System.out.println(prestamo);
            }
        } catch (Exception e) {
            System.err.println("Error al mostrar préstamos: " + e.getMessage());
        }
    }

    public void eliminarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula) {
        try {
            Prestamo prestamoDel = new Prestamo(numero, estado, fecha, cliente, pelicula);
            if (queuePrestamo.contains(prestamoDel)) {
                queuePrestamo.remove(prestamoDel);
                System.out.println("Préstamo eliminado exitosamente");
            } else {
                System.out.println("No se encontró el préstamo con el número indicado");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar préstamo: " + e.getMessage());
        }
    }

    public void actualizarPrestamo(String numero, String estado, String fecha, String cliente, String pelicula,
            String nuevoNumero, String nuevoEstado, String nuevaFecha, String nuevoCliente, String nuevaPelicula) {

        try {
            Prestamo prestamoUpd = new Prestamo(numero, estado, fecha, cliente, pelicula);
            if (queuePrestamo.contains(prestamoUpd)) {
                queuePrestamo.remove(prestamoUpd);
                Prestamo prestamoAdd = new Prestamo(nuevoNumero, nuevoEstado, nuevaFecha, nuevoCliente, nuevaPelicula);
                queuePrestamo.add(prestamoAdd);
                System.out.println("Préstamo actualizado exitosamente");
            } else {
                System.out.println("No se encontró el préstamo con el número indicado");
            }
        } catch (Exception e) {
            System.err.println("Error al actualizar préstamo: " + e.getMessage());
        }
    }
}
