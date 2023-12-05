/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peliculas;

import Categorias.Categoria;
import Entidad.Entidad;

import java.util.Objects;

/**
 *
 * @author Pablo Rod
 */
public class Pelicula extends Entidad {

    private String categoria;

    public Pelicula( String codigo, String nombre,String categoria) {
        super(codigo, nombre);
        this.categoria = categoria;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Pelicula(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + " nombre: " + nombre + " categoria: " + categoria; 
    }

   

   @Override
public int hashCode() {
    int hash = 7;
    hash = 31 * hash + Objects.hashCode(this.codigo);
    hash = 31 * hash + Objects.hashCode(this.nombre);
    hash = 31 * hash + Objects.hashCode(this.categoria);
    return hash;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    final Pelicula other = (Pelicula) obj;
    return Objects.equals(this.codigo, other.codigo)
            && Objects.equals(this.nombre, other.nombre)
            && Objects.equals(this.categoria, other.categoria);
}


}
