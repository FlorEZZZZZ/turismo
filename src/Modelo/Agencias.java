/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import MVC.VistaAgencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import com.mysql.cj.protocol.Resultset;
import javax.swing.JFrame;


public class Agencias {

    public int idagencia;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;
    public String web;
    public int idcompania;

    
    public int getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(int idagencia) {
        this.idagencia = idagencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public int getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(int idcompania) {
        this.idcompania = idcompania;
    }

    Conexiones conector = new Conexiones();
    
     public void create(String nombre, String direccion, String correo, String telefono, String web, int idcompania) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tblagencias (nombre, direccion, correo, telefono, web, idcompania) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setString(1, nombre);
            pst.setString(2, direccion);
            pst.setString(3, correo);
            pst.setString(4, telefono);
            pst.setString(5, web);
            pst.setInt(6, idcompania);

            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
     public void mostrar(int idagencia){
    String[] datos = new String[6];
    String sql = "SELECT * FROM tblagencias WHERE idagencia = ?";
    Connection dbConnection = null;
    PreparedStatement pst = null;

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(sql);
        pst.setInt(1, idagencia);  // Usamos el parámetro `idagencia` para la consulta
        
        ResultSet rs = pst.executeQuery();  // Ejecutamos la consulta con executeQuery()

        // Comprobamos si hay algún resultado
        if (rs.next()) {
            // Obtener los datos del ResultSet
            datos[0] = rs.getString("nombre");
            datos[1] = rs.getString("direccion");
            datos[2] = rs.getString("correo");
            datos[3] = rs.getString("telefono");
            datos[4] = rs.getString("web");
            datos[5] = String.valueOf(rs.getInt("idcompania"));

            VistaAgencias va = new VistaAgencias();
            
            va.actualizar(datos[0], datos[1], datos[2], datos[3], datos[4], Integer.parseInt(datos[5]));
            va.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            va.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la agencia con ID " + idagencia);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}



