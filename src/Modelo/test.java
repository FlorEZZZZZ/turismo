/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author APRENDIZ
 */
import javax.swing.JOptionPane;
import Controlador.Conexiones;

public class test {
	public static void main(String[] args) {
		Conexiones test = new Conexiones();

		if (test.conectarBD() != null) {
			JOptionPane.showConfirmDialog(null, "Conectado a la BD");

		} else {

			JOptionPane.showConfirmDialog(null, "No Conectado a la BD");

		}

	}
}