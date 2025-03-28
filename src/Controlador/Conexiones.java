/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author APRENDIZ
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
	public Connection conectarBD() {
		// Crar e inicializar un objeto de la clase connection

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo", "root", "2556229");
			System.out.println("Connected With the database successfully");
		} catch (SQLException e) {
			System.out.println("Error while connecting to the database");
                        System.out.println("Error: " + e.getMessage());

		}
		return connection; // retorna la conexión abierta con la BD
	}
}