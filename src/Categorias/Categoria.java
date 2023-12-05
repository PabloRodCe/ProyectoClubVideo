/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categorias;

import Entidad.Entidad;

import java.util.Objects;

/**
 *
 * @author Pablo Rod
 */
public class Categoria extends Entidad {

    public Categoria(String codigo, String nombre) {
        super(codigo, nombre);
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " (Nombre: " + nombre + ")";
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codigo);
        hash = 29 * hash + Objects.hashCode(this.nombre);
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
        Categoria other = (Categoria) obj;
        return codigo.equals(other.codigo) && nombre.equals(other.nombre);
    }

}
