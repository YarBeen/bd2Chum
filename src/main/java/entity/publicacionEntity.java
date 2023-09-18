/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Yarman
 */
public class publicacionEntity {
    private int id;
    private int idProducto;
    private String titulo;
    private String estado;
    private int precio;

    public publicacionEntity(int idProducto, String titulo, String estado, int precio) {
        this.idProducto = idProducto;
        this.titulo = titulo;
        this.estado = estado;
        this.precio = precio;
    }

    public publicacionEntity(int id, int idProducto, String titulo, String estado, int precio) {
        this.id = id;
        this.idProducto = idProducto;
        this.titulo = titulo;
        this.estado = estado;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
