    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Pablo Rod
 */
public class Cliente {

    private String id;
    private String Nombre;
    //Fecha de nacimiento
    private String Teléfono;
    private String Correo;
    private String dirección;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public Cliente(String id, String Nombre, String Teléfono, String Correo, String dirección) {
        this.id = id;
        this.Nombre = Nombre;
        this.Teléfono = Teléfono;
        this.Correo = Correo;
        this.dirección = dirección;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Nombre=" + Nombre + ", Tel\u00e9fono=" + Teléfono + ", Correo=" + Correo + ", direcci\u00f3n=" + dirección + '}';
    }

    
}
