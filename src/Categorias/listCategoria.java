package Categorias;

import Peliculas.Pelicula;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Andrey Rugama
 */
public class listCategoria {

    private HashMap<String, String> categoriasList = new HashMap<>();

    /**
     * Metodo que agrega una categoria a el ArrayList categoriasList
     *
     * @param codigo
     * @param nombre
     */
    public void agregarCategoria(String codigo, String nombre) {
        try {
            if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
                System.out.println("La categoría indicada ya existe");
            } else {
                categoriasList.put(codigo, nombre);
                System.out.println("Categoría agregada exitosamente");
            }
        } catch (Exception e) {
            System.err.println("Error al agregar categoría: " + e.getMessage());
        }
    }

    /**
     * Metodo para mostrar categorias
     */
    public void mostrarCategorias() {
        try {
            for (Map.Entry<String, String> entry : categoriasList.entrySet()) {
                String clave = entry.getKey();
                String valor = entry.getValue();
                System.out.println("Clave: " + clave + ", Valor: " + valor);
            }
        } catch (Exception e) {
            System.err.println("Error al mostrar categorías: " + e.getMessage());
        }
    }

    /**
     * Metodo que elimina categorias de el ArrayList categoriaList
     *
     * @param codigo
     * @param nombre
     */
    public void eliminarCategoria(String codigo, String nombre) {
        try {
            Pelicula peli = new Pelicula(codigo, nombre);
            if (peli.getCodigo().contains(codigo)) {
                if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
                    categoriasList.remove(codigo, nombre);
                    System.out.println("Categoría eliminada exitosamente");
                }
            } else {
                System.out.println("No se encontró la categoría indicada");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar categoría: " + e.getMessage());
        }
    }

    //Faltan correcciones
    public void actualizarCategoria(String codigo, String nombre, String codigoNuevo, String nombreNuevo) {
        try {
            if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
                categoriasList.remove(codigo, nombre);
                categoriasList.put(codigoNuevo, nombreNuevo);
                System.out.println("Categoría actualizada exitosamente");
            } else {
                System.out.println("No se encontró la categoría indicada");
            }
        } catch (Exception e) {
            System.err.println("Error al actualizar categoría: " + e.getMessage());
        }
    }
}
