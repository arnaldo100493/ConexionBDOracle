/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbdoracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author abarrime
 */
public class Controlador {

    public Controlador() {

    }

    public String consultarCuentas(String cueLineaCuenta) {
        String mensaje = "";
        String sql = "select * from PVEQA_SCHEME.PVE_CUENTA_TB where cue_linea_cuenta like ?";
        Connection connection = ConexionOracle.conectar();
        PreparedStatement statement;
        ResultSet resultSet;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, cueLineaCuenta);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                mensaje = "Exitoso";
            } else {
                mensaje = "Fallido";
            }
        } catch (SQLException ex) {

        }
        return mensaje;
    }

}
