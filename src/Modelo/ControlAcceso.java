/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import MVC.VistaUsuarios;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ControlAcceso {

    public int documento;
    public String contraseña;

    public ControlAcceso(int documento, String contraseña) {
        this.documento = documento;
        this.contraseña = contraseña;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    public void ingreso(int documento, String contraseña){
    
        Conexiones conector = new Conexiones();

        VistaUsuarios vs = new VistaUsuarios();
     Connection dbConnection = null;
        PreparedStatement pst = null;
        
        String script = "SELECT * FROM tblpromotores WHERE documento = ? and contrasena = ?";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setInt(1, documento);
            pst.setString(2, contraseña);
            
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {                
                vs.show();
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    }   

