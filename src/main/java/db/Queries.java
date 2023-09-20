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

    public static final String PUBLICACION_IS_MINE_QUERY = "{ ? = call consultas.VerificarRelacionVendedorPublicacion(?, ?) }";
    public static final String LOGIN_CLIENT_QUERY = "select * from Usuario where Username = ? and Contrasenna = ?";
    public static final String READ_PUBLICACION_QUERY = "{call consultas.MostrarPublicacion( ?)}";
    public static final String READ_MIS_PUBLICACIONES_QUERY = "{call consultas.ObtenerPublicacionesDeVendedor(?, ?)}";
    public static final String INSERT_PUBLICACION_QUERY = "{call modificaciones.InsertarPublicacion(?, ?, ? , ?)}";
    public static final String DELETE_PUBLICACION_QUERY = "{call  modificaciones.EliminarPublicacionPorID(?)}";
    public static final String UPDATE_PUBLICACION_QUERY = "{call modificaciones.ActualizarPublicacionPorID(?,?,?,?)}";

    public static final String PRODUCT_IS_MINE_QUERY = "{ ? = call consultas.VerificarRelacionProductoVendedor(?, ?) }";
    public static final String READ_MIS_PRODUCTOS_QUERY = "{call consultas.ObtenerProductosDeVendedor(?, ?)}";
    public static final String READ_PRODUCTO_QUERY = "{call consultas.MostrarProductoID(?, ?)}";
    public static final String INSERT_PRODUCTO_QUERY = "{call  modificaciones.InsertarProducto(?, ? , ? , ?)}";
    public static final String DELETE_PRODUCTO_QUERY = "{call modificaciones.EliminarProductoPorID(?)}";
    public static final String UPDATE_PRODUCTO_QUERY = "{call  modificaciones.ActualizarProductoPorID(?,?,?)}";

    public static final String OFERTA_IS_MINE_QUERY = "{ ? = call consultas.VerificarRelacionCompradorOferta(?, ?) }";
    public static final String READ_OFERTA_QUERY = "{call consultas.MostrarOfertaID(?, ?)}";
    public static final String READ_OFERTAS_HECHAS_QUERY = "{call consultas.ObtenerOfertasDeComprador(?, ?)}";
    public static final String READ_OFERTAS_RECIBIDAS_QUERY = "{call consultas.ObtenerOfertasDeVendedor(?, ?)}";
    public static final String INSERT_OFERTA_QUERY = "{call  modificaciones.InsertarOferta(?, ? , ? , ?, ? )}";
    public static final String DELETE_OFERTA_QUERY = "{call modificaciones.EliminarOfertaPorID(? )}";
    public static final String UPDATE_OFERTA_QUERY = "{call modificaciones.ActualizarOfertaPorID(?, ? , ? , ?)}";

    public static final String SELECT_MAS_OFERTABLES = "{call consultas.MostrarCategoriasMasOfertables(?)}";
    public static final String SELECT_MAS_PUBLICACIONES = "{call consultas.MostrarCategoriasConMasPublicaciones(?)}";

}
