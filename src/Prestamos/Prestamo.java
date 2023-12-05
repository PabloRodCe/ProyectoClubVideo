/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prestamos;



/**
 *  Préstamo: Numero, Estado, Fecha, Cliente y Películas.
 * @author Pablo Rod
 */ 
public class Prestamo{
    private String numero;
    private String estado;
    private String fecha;
    private String cliente;
    private String pelicula;

    public Prestamo(String numero, String estado, String fecha, String cliente, String pelicula) {
        this.numero = numero;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        this.pelicula = pelicula;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    @Override
    public String toString() {
        return "Prestamo{ " + " numero= " + numero + " , estado= " + estado + " , fecha= " + fecha + " , cliente= " + cliente + " , pelicula= " + pelicula + '}';
    }
    
    
}
