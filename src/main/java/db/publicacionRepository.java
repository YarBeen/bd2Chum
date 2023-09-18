/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.publicacionEntity;
import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import static db.Queries.*;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Yarman
 */
public class publicacionRepository {

    OracleDBConnection connection;

    public publicacionRepository(OracleDBConnection connection) {
        this.connection = connection;
    }

    public int save(publicacionEntity entity) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(INSERT_PUBLICACION_QUERY);

            callableStatement.setInt(1, entity.getIdProducto());
            callableStatement.setString(2, entity.getTitulo());
            callableStatement.setString(3, entity.getEstado());
            callableStatement.setInt(4, entity.getPrecio());

            // Execute the stored procedure
            callableStatement.executeUpdate();
            connect.commit();
            connection.closeConection();

            System.out.println("Publicacion inserted successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

            return -1;
        }

    }

    public int delete(int entityID) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(DELETE_PUBLICACION_QUERY);

            callableStatement.setInt(1, entityID);

            // Execute the stored procedure
            callableStatement.executeUpdate();

            System.out.println("Publicacion deleted successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }

    }

    public int update(publicacionEntity entity) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(UPDATE_PUBLICACION_QUERY);

            callableStatement.setInt(1, entity.getIdProducto());
            callableStatement.setString(2, entity.getTitulo());
            callableStatement.setString(3, entity.getEstado());
            callableStatement.setInt(4, entity.getPrecio());

            // Execute the stored procedure
            callableStatement.executeUpdate();

            System.out.println("Publicacion updated successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            return -1;
        }

    }

}
