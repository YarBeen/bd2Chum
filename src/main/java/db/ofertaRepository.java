/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.ofertaEntity;
import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import static db.Queries.*;
import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Anthony
 */

public class ofertaRepository {
    
    OracleDBConnection connection;

    public ofertaRepository (OracleDBConnection connection) {
        this.connection = connection;
    }

    public int save(ofertaEntity entity) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(INSERT_OFERTA_QUERY);

            callableStatement.setInt(1, entity.getIdComprador());
            callableStatement.setInt(2, entity.getIdPublicacion());
            callableStatement.setInt(3, entity.getRegateo());
            callableStatement.setString(4, entity.getMensaje());
            callableStatement.setString(5, entity.getAceptacion());

            // Execute the stored procedure
            callableStatement.executeUpdate();
            connect.commit();
            connection.closeConection();

            System.out.println("Oferta inserted successfully.");
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

            CallableStatement callableStatement = connect.prepareCall(DELETE_OFERTA_QUERY);

            callableStatement.setInt(1, entityID);

            // Execute the stored procedure
            callableStatement.executeUpdate();

            System.out.println("Oferta deleted successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }

    }

    public int update(ofertaEntity entity) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(UPDATE_OFERTA_QUERY);

            callableStatement.setInt(1, entity.getIdComprador());
            callableStatement.setInt(2, entity.getIdPublicacion());
            callableStatement.setInt(3, entity.getRegateo());
            callableStatement.setString(4, entity.getMensaje());
            callableStatement.setString(5, entity.getAceptacion());

            // Execute the stored procedure
            callableStatement.executeUpdate();

            System.out.println("Oferta updated successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            return -1;
        }

    }

}

