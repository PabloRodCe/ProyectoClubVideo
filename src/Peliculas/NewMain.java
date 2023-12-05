/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Peliculas;

import Categorias.Categoria;




/**
 *
 * @author Isaac Sibaja
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     listPelicula lista = new listPelicula();
     Categoria accion = new Categoria("1","accion");
     lista.agregarPelicula("1 ", "pepe ", accion.getNombre());
      lista.agregarPelicula("2 ", "pepa ", accion.getNombre());
     lista.mostrarPeliculas();

        
    
}
}
