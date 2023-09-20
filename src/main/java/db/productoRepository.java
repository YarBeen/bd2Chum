/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.productoEntity;
import oracle.jdbc.OracleTypes;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import static db.Queries.*;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
import java.util.ArrayList;
import java.sql.Types;

/**
 *
 * @author Anthony
 */
public class productoRepository {

    OracleDBConnection connection;

    public productoRepository(OracleDBConnection connection) {
        this.connection = connection;
    }

    public int save(productoEntity entity) {

        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(INSERT_PRODUCTO_QUERY);

            callableStatement.setString(1, entity.getNombre());
            callableStatement.setString(2, entity.getDescripcion());
            callableStatement.setInt(3, entity.getIdVendedor());
            callableStatement.setInt(4, entity.getIdCategoria());

            callableStatement.executeUpdate();

            connection.closeConection();

            System.out.println("Producto inserted successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            connection.closeConection();
            return -1;
        }

    }

    public List<productoEntity> read(int entityID) {

        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(READ_PRODUCTO_QUERY);

            callableStatement.setInt(1, entityID);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);

            callableStatement.executeUpdate();

            ResultSet results = (ResultSet) callableStatement.getObject(2);

            List<productoEntity> listProduct = new ArrayList<>();
            while (results.next()) {
                productoEntity actual = new productoEntity(Integer.parseInt(results.getString("ID")),
                        Integer.parseInt(results.getString("ID_Vendedor")),
                        Integer.parseInt(results.getString("ID_Categoria")),
                        results.getString("Nombre"),
                        results.getString("Descripcion")
                );

                listProduct.add(actual);
            }
            callableStatement.close();
            connection.closeConection();

            return listProduct;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

    public List<productoEntity> readMisProductos(int entityID) {

        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(READ_MIS_PRODUCTOS_QUERY);

            callableStatement.setInt(1, entityID);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);

            callableStatement.executeUpdate();

            ResultSet results = (ResultSet) callableStatement.getObject(2);

            List<productoEntity> listProduct = new ArrayList<>();
            while (results.next()) {
                productoEntity actual = new productoEntity(Integer.parseInt(results.getString("ID")),
                        Integer.parseInt(results.getString("ID_VENDEDOR")),
                        Integer.parseInt(results.getString("ID_CATEGORIA")),
                        results.getString("NOMBRE"),
                        results.getString("DESCRIPCION")
                );

                listProduct.add(actual);
            }
            callableStatement.close();
            connection.closeConection();

            return listProduct;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

    public int isMine(int userID, int productID) {
        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(PRODUCT_IS_MINE_QUERY);

            callableStatement.registerOutParameter(1, Types.INTEGER);

            callableStatement.setInt(2, productID);
            callableStatement.setInt(3, userID);

            callableStatement.executeUpdate();
            int result = callableStatement.getInt(1);
            System.out.println("Resultadossss" + result);
            connection.closeConection();

            return result;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            connection.closeConection();
            return -1;
        }
    }

    public int delete(int entityID) {

        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(DELETE_PRODUCTO_QUERY);

            callableStatement.setInt(1, entityID);

            callableStatement.executeUpdate();

            connection.closeConection();

            System.out.println("Prodcuto deleted successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            connection.closeConection();
            return -1;
        }

    }

    public int update(productoEntity entity) {

        try (Connection connect = this.connection.getConnection()) {

            CallableStatement callableStatement = connect.prepareCall(UPDATE_PRODUCTO_QUERY);

            callableStatement.setInt(1, entity.getId());
            callableStatement.setString(2, entity.getNombre());
            callableStatement.setString(3, entity.getDescripcion());

            callableStatement.executeUpdate();

            connection.closeConection();

            System.out.println("Producto updated successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            return -1;
        }

    }

}
