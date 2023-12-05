/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peliculas;

import Categorias.Categoria;
import java.util.ArrayList;

public class listPelicula {

    ArrayList<Pelicula> listPelicula = new ArrayList<>();

    /**
     * Método que agrega películas al peliculaMap
     *
     * @param codigo
     * @param nombre
     */
    public void agregarPelicula(String codigo, String nombre, String categoria) {
        Pelicula nuevaPelicula = new Pelicula(codigo, nombre, categoria);
        Categoria cate = new Categoria(codigo, nombre);
//        cate.setCodigo(codigo);
        if(cate.getCodigo().contains(codigo)){
            System.out.println("ssss");
        }
        if (listPelicula.contains(nuevaPelicula)) {
            System.out.println("La película con el código " + codigo + " ya existe en la lista");
        } else {
            listPelicula.add(nuevaPelicula);
            System.out.println("Película agregada exitosamente");
        }
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : listPelicula) {
            System.out.println(pelicula);
        }
    }

    public void eliminarPelicula(String codigo, String nombre, String categoria) {
        Pelicula pelidel = new Pelicula(codigo, nombre, categoria);
        if (listPelicula.contains(pelidel)) {
            listPelicula.remove(pelidel);
            System.out.println("Película eliminada exitosamente");
        } else {
            System.out.println("No se encontró la película con el código indicado");
        }
    }

    public void actualizarPelicula(String codigo, String nombre, String categoria, String nuevoCodigo, String nuevoNombre, String nuevaCategoria) {
        Pelicula peliUpd = new Pelicula(codigo, nombre, categoria);
        if (listPelicula.contains(peliUpd)) {
            listPelicula.remove(peliUpd);
            Pelicula peliAdd = new Pelicula(nuevoCodigo, nuevoNombre, nuevaCategoria);
            listPelicula.add(peliAdd);
            System.out.println("Película actualizada exitosamente");
        } else {
            System.out.println("No se encontró la película con el código indicado");
        }
    }
}
