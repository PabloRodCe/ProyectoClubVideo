package Peliculas;

import Categorias.Categoria;
import java.util.ArrayList;

public class listPelicula {

    private ArrayList<Pelicula> listPelicula = new ArrayList<>();

    /**
     * Método que agrega películas al listPelicula
     *
     * @param codigo
     * @param nombre
     * @param categoria
     */
    public void agregarPelicula(String codigo, String nombre, String categoria) {
        try {
            Pelicula nuevaPelicula = new Pelicula(codigo, nombre, categoria);
            Categoria cate = new Categoria(codigo, nombre);

            if (cate.getCodigo().contains(codigo)) {
                System.out.println("La categoría indicada ya existe");
            } else {
                if (listPelicula.contains(nuevaPelicula)) {
                    System.out.println("La película con el código " + codigo + " ya existe en la lista");
                } else {
                    listPelicula.add(nuevaPelicula);
                    System.out.println("Película agregada exitosamente");
                }
            }
        } catch (Exception e) {
            System.err.println("Error al agregar película: " + e.getMessage());
        }
    }

    public void mostrarPeliculas() {
        try {
            for (Pelicula pelicula : listPelicula) {
                System.out.println(pelicula);
            }
        } catch (Exception e) {
            System.err.println("Error al mostrar películas: " + e.getMessage());
        }
    }

    public void eliminarPelicula(String codigo, String nombre, String categoria) {
        try {
            Pelicula pelidel = new Pelicula(codigo, nombre, categoria);
            if (listPelicula.contains(pelidel)) {
                listPelicula.remove(pelidel);
                System.out.println("Película eliminada exitosamente");
            } else {
                System.out.println("No se encontró la película con el código indicado");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar película: " + e.getMessage());
        }
    }

    public void actualizarPelicula(String codigo, String nombre, String categoria, String nuevoCodigo, String nuevoNombre, String nuevaCategoria) {
        try {
            Pelicula peliUpd = new Pelicula(codigo, nombre, categoria);
            if (listPelicula.contains(peliUpd)) {
                listPelicula.remove(peliUpd);
                Pelicula peliAdd = new Pelicula(nuevoCodigo, nuevoNombre, nuevaCategoria);
                listPelicula.add(peliAdd);
                System.out.println("Película actualizada exitosamente");
            } else {
                System.out.println("No se encontró la película con el código indicado");
            }
        } catch (Exception e) {
            System.err.println("Error al actualizar película: " + e.getMessage());
        }
    }
}
