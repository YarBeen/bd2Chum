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
public class userRepository implements CRUD{
    Connection connection;
    

    public userRepository(Connection connection) {
        this.connection = connection;
    }

    public userEntity login(String user, String password){
         ResultSet resultSet = null;
        try{
            PreparedStatement statement= this.connection.prepareStatement(LOGIN_CLIENT_QUERY);
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
    @Override
    public List findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional findById(int userID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Serializable entityID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object update(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
