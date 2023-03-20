/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import UI.RegistroVenta;
import java.sql.*;

public class ConexionBD {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sistemapuntoventa"; // URL de la base de datos
        String usuario = "root"; // Usuario de la base de datos
        String password = "sesamo"; // Contraseña de la base de datos

        try {
            try ( // Conexión a la base de datos
                Connection conexion = DriverManager.getConnection(url, usuario, password)) {
                System.out.println("Conexión exitosa a la base de datos");
                RegistroVenta rv = new RegistroVenta();
                rv.setVisible(true);
                // Cerrar la conexión
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

