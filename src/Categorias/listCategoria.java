/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categorias;

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
     * @param categoria
     */
    public void agregarCategoria(String codigo, String nombre) {

        if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
            System.out.println("La categoría indicada ya existe");
        } else {
            categoriasList.put(codigo, nombre);
            System.out.println("Categoría agregada exitosamente");
        }
    }

    /**
     * Metodo para mostrar categorias
     */
    public void mostrarCategorias() {
        for (Map.Entry<String, String> entry : categoriasList.entrySet()) {
            String clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println("Clave: " + clave + ", Valor: " + valor);
        }
    }

    /**
     * Metodo que elimina categorias de el ArrayList categoriaList
     *
     * @param codigo
     * @param categoria
     */
    public void eliminarCategoria(String codigo, String nombre) {
        if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
            categoriasList.remove(codigo, nombre);
            System.out.println("Categoría eliminada exitosamente");
        } else {
            System.out.println("No se encontró la categoría indicada");
        }
    }

    //Faltan correcciones
    public void actualizarCategoria(String codigo, String nombre, String codigoNuevo, String nombreNuevo) {

        if (categoriasList.containsKey(codigo) && categoriasList.containsValue(nombre)) {
            categoriasList.remove(codigo, nombre);
            categoriasList.put(codigoNuevo, nombreNuevo);
            System.out.println("Categoría actualizada exitosamente");
        } else {

            System.out.println("No se encontró la categoría indicada");
        }
    }
}
