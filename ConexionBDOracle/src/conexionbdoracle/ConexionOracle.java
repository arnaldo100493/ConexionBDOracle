/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author abarrime
 */
public class ConexionOracle {

    private static transient Connection connection;
    private static final String driver = "oracle.jdbc.OracleDriver";
    private static final String url = "jdbc:oracle:thin:@100.126.1.26:1521:Insdata";
    private static final String user = "QUERY_PVE";
    private static final String password = "QUERY_PVE";
    private static final Properties properties = new Properties();

    public static Connection conectar() {
        connection = null;
        try {
            Class.forName(driver);
            properties.setProperty("user", user);
            properties.setProperty("password", password);
            connection = DriverManager.getConnection(url, properties);
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {
{
            return connection;
        }

        } finally {
            return connection;
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static boolean isConnected() {
        return connection != null;
    }

}
