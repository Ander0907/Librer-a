/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavafx.modelo;

/**
 *
 * @author Usuario
 */
public class Tarea {
    private int Id;
    private String Documento;
    private String Nombre;

    public Tarea() {
    
        
        
    }

       
    
    
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        this.Documento = documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + Id + ", documento=" + Documento + ", nombre=" + Nombre + '}';
    }
    
    
    
    
}
