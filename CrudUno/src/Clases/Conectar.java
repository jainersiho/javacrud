/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jainer Bolaños
 */
/**
 * Esta clase representa una utilidad para establecer y cerrar una conexión a
 * una base de datos.
 */
public class Conectar {

    private Connection connection;

    /**
     *
     * Establece una conexión a la base de datos utilizando los parámetros
     * proporcionados.
     *
     * @param url la URL de la base de datos
     * @param username el nombre de usuario para la conexión
     * @param password la contraseña para la conexión
     */
    public void conexion(String url, String username, String password) {
        try {
           
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bdapp","root", "");
            JOptionPane.showMessageDialog(null, "Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    /**
     *
     * Cierra la conexión a la base de datos. Si la conexión no es nula, se
     * cierra y se muestra un mensaje de éxito. Si ocurre un error al cerrar la
     * conexión, se muestra un mensaje de error.
     */
    public void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                JOptionPane.showMessageDialog(null, "Conexión cerrada correctamente");
                System.out.println("Conexión cerrada correctamente");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    /**
     *
     * Retorna la conexión actualmente establecida.
     *
     * @return la conexión actual
     */
    public Connection getConexion() {
        return connection;
    }

    public PreparedStatement conexion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
