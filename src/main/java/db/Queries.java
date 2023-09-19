/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Yarman
 */
public class Queries {

    public static final String LOGIN_CLIENT_QUERY = "select * from Usuario where Username = ? and Contrasenna = ?";

    public static final String INSERT_PUBLICACION_QUERY = "{call modificaciones.InsertarPublicacion(?, ?, ? , ?)}";
    public static final String DELETE_PUBLICACION_QUERY = "exec modificaciones.EliminarPublicacionPorID(?);";
    public static final String UPDATE_PUBLICACION_QUERY = "exec modificaciones.ActualizarPublicacionPorID(?,?,?,?);";
    
    public static final String INSERT_PRODUCT_QUERY = "exec modificaciones.InsertarProducto(?, ? , ? , ?);";
    public static final String DELETE_PRODUCT_QUERY = "exec modificaciones.EliminarProductoPorID(?);";
    public static final String UPDATE_PRODUCT_QUERY = "exec modificaciones.ActualizarProductoPorID(?,?,?);";
    
    
    public static final String INSERT_OFERTA_QUERY = "exec modificaciones.InsertarOferta(?, ? , ? , ?, ? );";
    public static final String DELETE_OFERTA_QUERY = "exec modificaciones.EliminarOfertaPorID(? );";
    public static final String UPDATE_OFERTA_QUERY = "exec modificaciones.ActualizarOfertaPorID(?, ? , ? , ?);";

}
