/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Yarman
 */
public class dbSingleton {
    private static OracleDBConnection dbConnection;
    
    private dbSingleton(){
        
    }
    public static OracleDBConnection getDBConnection(){
        if (dbConnection== null){
            dbConnection = new OracleDBConnection();
        }
        return dbConnection;
    }
    
}
