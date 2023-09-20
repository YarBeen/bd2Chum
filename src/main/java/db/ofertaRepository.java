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
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.OracleTypes;
import java.util.ArrayList; 
/**
 *
 * @author Anthony
 */
public class ofertaRepository {

    OracleDBConnection connection;

    public ofertaRepository(OracleDBConnection connection) {
        this.connection = connection;
    }
        public List<ofertaEntity> read(int entityID) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure
        
            CallableStatement callableStatement = connect.prepareCall(READ_OFERTA_QUERY);

            callableStatement.setInt(1, entityID);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
        
            // Execute the stored procedure
            callableStatement.executeUpdate();
            
            ResultSet results = (ResultSet) callableStatement.getObject(2);
            List<ofertaEntity> listOferta = new ArrayList<>();

            while(results.next()){
                ofertaEntity actual = new ofertaEntity(  results.getInt("ID"),
                        results.getInt("ID_COMPRADOR"),
                         results.getInt("ID_PUBLICACION"),
                       results.getInt("REGATEO"),
                        results.getString("MENSAJE"),
                        results.getString("ACEPTACION")
                );
                String texto = results.getString("id");
                listOferta.add(actual);
            }
            callableStatement.close();
            connection.closeConection();
        
            return listOferta;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    
    }
        public List<ofertaEntity> readOfertasHechas(int entityID) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure
        
            CallableStatement callableStatement = connect.prepareCall(READ_OFERTAS_HECHAS_QUERY);

            callableStatement.setInt(1, entityID);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
        
            // Execute the stored procedure
            callableStatement.executeUpdate();
            
            ResultSet results = (ResultSet) callableStatement.getObject(2);
            List<ofertaEntity> listOferta = new ArrayList<>();

            while(results.next()){
                ofertaEntity actual = new ofertaEntity(  results.getInt("ID"),
                        entityID,
                         results.getInt("ID_PUBLICACION"),
                       results.getInt("REGATEO"),
                        results.getString("MENSAJE"),
                        results.getString("ACEPTACION"),
                        results.getString("TITULO_PUBLICACION")
                );
                System.out.println(results.getString("TITULO_PUBLICACION") +"HOLI");
                listOferta.add(actual);
            }
            callableStatement.close();
            connection.closeConection();
        
            return listOferta;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    
    }
        public List<ofertaEntity> readOfertasRecibidas(int entityID) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure
        
            CallableStatement callableStatement = connect.prepareCall(READ_OFERTAS_RECIBIDAS_QUERY);

            callableStatement.setInt(1, entityID);
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
        
            // Execute the stored procedure
            callableStatement.executeUpdate();
            
            ResultSet results = (ResultSet) callableStatement.getObject(2);
            List<ofertaEntity> listOferta = new ArrayList<>();

            while(results.next()){
                ofertaEntity actual = new ofertaEntity(  results.getInt("ID"),
                        results.getInt("ID_COMPRADOR"),
                         results.getInt("ID_PUBLICACION"),
                       results.getInt("REGATEO"),
                        results.getString("MENSAJE"),
                        results.getString("ACEPTACION"),
                        results.getString("Nombre_Producto")
                );
                String texto = results.getString("id");
                listOferta.add(actual);
            }
            callableStatement.close();
            connection.closeConection();
        
            return listOferta;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    
    }

    public int save(ofertaEntity entity) {

        try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

            CallableStatement callableStatement = connect.prepareCall(INSERT_OFERTA_QUERY);

            callableStatement.setInt(1, entity.getIdComprador());
            callableStatement.setInt(2, entity.getRegateo());
            callableStatement.setString(3, entity.getMensaje());
            callableStatement.setString(4, "Pendiente");
            callableStatement.setInt(5, entity.getIdPublicacion());

            // Execute the stored procedure
            callableStatement.executeUpdate();
           
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
            
            connection.closeConection();
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

            callableStatement.setInt(1, entity.getId());
            callableStatement.setInt(2, entity.getRegateo());
            callableStatement.setString(3, entity.getMensaje());
            callableStatement.setString(4, "Pendiente");

            // Execute the stored procedure
            callableStatement.executeUpdate();
            
            connection.closeConection();

            System.out.println("Oferta updated successfully.");
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
            return -1;
        }

    }

}
