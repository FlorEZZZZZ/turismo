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
public class Medios {
    public int idmedios; 
public String nombre; 
public String observacion; 
public int idtipomedio;

    public int getIdmedios() {
        return idmedios;
    }

    public void setIdmedios(int idmedios) {
        this.idmedios = idmedios;
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

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getIdtipomedio() {
        return idtipomedio;
    }

    public void setIdtipomedio(int idtipomedio) {
        this.idtipomedio = idtipomedio;
    }
    
            Conexiones conector = new Conexiones();
    
     public void create(String nombre,int idtipomedio,String observacion) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tblmedios (nombre, idtipomedio, observacion) VALUES (?, ?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setString(1, nombre);
            pst.setInt(2, idtipomedio);
            pst.setString(3, observacion);
            
            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
