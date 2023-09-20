/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Anthony
 */
public class productoEntity {

    private int id;
    private int idVendedor;
    private int idCategoria;
    private String nombre;
    private String descripcion;

    public productoEntity(int id, int idVendedor, int idCategoria, String nombre, String descripcion) {
        this.id = id;
        this.idVendedor = idVendedor;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }



    public productoEntity(int idProducto, String nombreProducto, String descripcion) {
        this.id = idProducto;
        this.nombre = nombreProducto;

        this.descripcion = descripcion;
    }

    public productoEntity(String nombreProducto, String descripcion, int idvendedor, int idcategoria) {
        
        this.nombre = nombreProducto;

        this.descripcion = descripcion;
        this.idVendedor=idvendedor;
        this.idCategoria=idcategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
