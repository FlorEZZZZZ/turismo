/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class TiposTransportes {
    
     public int idtipo;
    public String nombre;
    public String observacion;

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String nombre, String observacion) {
        this.observacion = observacion;
    }
    
            Conexiones conector = new Conexiones();

             public void create(String nombre, String observacion) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tbltipotransporte (nombre, observacion) VALUES (?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setString(1, nombre);
            pst.setString(2, observacion);
            
            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    
}
}
