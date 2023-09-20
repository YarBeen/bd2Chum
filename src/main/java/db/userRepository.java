/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.userEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;



import static db.Queries.*;
/**
 *
 * @author Yarman
 */
public class userRepository {
    OracleDBConnection connection;
    

    public userRepository(OracleDBConnection connection) {
        this.connection = connection;
    }

    public userEntity login(String user, String password){
        this.connection.openConnection();
        Connection connect = connection.getConnection();
         ResultSet resultSet = null;
        try{
            PreparedStatement statement= connect.prepareStatement(LOGIN_CLIENT_QUERY);
            statement.setString(1, user);            
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            if(!resultSet.next()){
                System.out.println(user);
                System.out.println(password);
                System.out.println("Hola");
                return null;
            }
            userEntity userLogged = new userEntity(resultSet.getInt("ID"),resultSet.getString("Nombre"),
                    resultSet.getString("Apellido"),
                    resultSet.getString("Direccion"),
                    resultSet.getString("Username"),
                    resultSet.getString("Contrasenna"));
            return userLogged;


        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    

    
    
}
