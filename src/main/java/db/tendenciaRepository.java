package db;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.productoEntity;
import entity.stringAndInt;
import entity.tendenciaEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import static db.Queries.*;
import oracle.jdbc.OracleTypes;


public class tendenciaRepository {

    OracleDBConnection connection;
     public tendenciaRepository(OracleDBConnection connection) {
        this.connection = connection;
    }
     public List<stringAndInt> getMasOfertable(){
           try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

           CallableStatement callableStatement = connect.prepareCall(SELECT_MAS_OFERTABLES);
            

           
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);

            // Execute the stored procedure
            callableStatement.executeUpdate();
            


            
            ResultSet masOfertables = (ResultSet) callableStatement.getObject(1);

            List<stringAndInt> listmasOfertables = new ArrayList<>();
            

            while(masOfertables.next()){
                stringAndInt actual= new stringAndInt((masOfertables.getString("Categoria")), Integer.parseInt(masOfertables.getString("Cantidad_Ofertas")));
                listmasOfertables.add(actual);
            }

            
            callableStatement.close();
            


            connection.closeConection();

            return listmasOfertables;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
     }
        public List<stringAndInt> getMasPublicacion(){
           try (Connection connect = this.connection.getConnection()) {
            // Prepare the call to the stored procedure

           CallableStatement callableStatement = connect.prepareCall(SELECT_MAS_PUBLICACIONES);
            

           
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);

            // Execute the stored procedure
            callableStatement.executeUpdate();
            


            
            ResultSet masPublicacion = (ResultSet) callableStatement.getObject(1);

            
            List<stringAndInt> listmasPublicaciones = new ArrayList<>();

            while(masPublicacion.next()){
                stringAndInt actual= new stringAndInt((masPublicacion.getString("Categoria")), Integer.parseInt(masPublicacion.getString("Total_Publicaciones")));
                listmasPublicaciones.add(actual);
            }

            
            callableStatement.close();
            


            connection.closeConection();

            return listmasPublicaciones;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
     }
  
  

}