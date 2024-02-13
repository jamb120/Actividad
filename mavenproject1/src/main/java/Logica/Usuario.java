/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

public class Usuario {
    
    private String Nombre;
    private String Contraseña;
    private String Tipo;

    public Usuario(String Nombre, String Contraseña, String Tipo) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
