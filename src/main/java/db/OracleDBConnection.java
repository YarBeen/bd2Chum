/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.userEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Yarman
 */
public class OracleDBConnection {

    private Connection connection;
    private userRepository userRep;
    private publicacionRepository pubRep;
    private ofertaRepository ofeRep;
    private productoRepository prodRep;
    private boolean open;
    private userEntity user;
    private tendenciaRepository tendRep;

    public productoRepository getProdRep() {
        return prodRep;
    }

    public void setProdRep(productoRepository prodRep) {
        this.prodRep = prodRep;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public tendenciaRepository getTendRep() {
        return tendRep;
    }

    public void setTendRep(tendenciaRepository tendRep) {
        this.tendRep = tendRep;
    }

    public Connection getConnection() {
        if (open) {
            return connection;
        } else {
            openConnection();
            this.open = true;
            return this.connection;
        }
    }

    public userEntity getUserLogged() {

        return user;
    }

    public void setUser(userEntity userEnt) {
        user = userEnt;
    }

    public userRepository getUserRep() {
        return userRep;
    }

    public publicacionRepository getPubRep() {
        return pubRep;
    }

    public ofertaRepository getOfeRep() {
        return ofeRep;
    }

    public void closeConection() {

        try {
            if (this.open = false) {
                return;
            }
            if (connection != null && !connection.isClosed()) {
                this.connection.close();
                this.open = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void openConnection() {

        String url = "jdbc:oracle:thin:@siuadb1_high?TNS_ADMIN=/wall";
        String user = "YCHARPENTIER";
        String password = "bdAlajuela2023s2";
        try {
            Properties prop = new Properties();
            prop.setProperty("user", user);
            prop.setProperty("password", password);

            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(url, prop);
            this.connection = connection;

            System.out.println("Conexion Correcta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void init() {
        this.userRep = new userRepository(this);
        this.pubRep = new publicacionRepository(this);
        this.ofeRep = new ofertaRepository(this);
        this.prodRep = new productoRepository(this);
        this.tendRep = new tendenciaRepository(this);
    }

    public OracleDBConnection() {

        String url = "jdbc:oracle:thin:@siuadb1_high?TNS_ADMIN=C:/wall";
        String user = "YCHARPENTIER";
        String password = "bdAlajuela2023s2";

        Connection connection = null;

        try {
            Properties prop = new Properties();
            prop.setProperty("user", user);
            prop.setProperty("password", password);

            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(url, prop);
            this.connection = connection;
            init();

            System.out.println("Conexion Correcta");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
