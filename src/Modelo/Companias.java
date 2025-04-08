/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import MVC.VistaCompanias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import com.mysql.cj.protocol.Resultset;
import javax.swing.JFrame;
/**
 *
 * @author APRENDIZ
 */
public class Companias {

    public String razonsocial;
    public String idcompania;
    public String direccion;
    public String correo;
    public String telefono;
    public String web;
    public String fechacreacion;

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(String idcompania) {
        this.idcompania = idcompania;
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

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
        Conexiones conector = new Conexiones();
    
     public void create(String razonSocial,int idCompania,String direccion,String correo,String telefono,String web,String fechaCreacion) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tblagencias (razonSocial, idCompania, direccion, correo, telefono, web, fechaCreacion) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setString(1, razonSocial);
            pst.setInt(2, idCompania);
            pst.setString(3, direccion);
            pst.setString(4, correo);
            pst.setString(5, telefono);
            pst.setString(6, web);
            pst.setString(7, fechaCreacion);
            
            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void mostrarCompaniaActualizar(int idcompania) {
    String[] datos = new String[7]; // Solo necesitamos 7 campos para tblcompanias
    String sql = "SELECT * FROM tblcompanias WHERE idcompania = ?";
    Connection dbConnection = null;
    PreparedStatement pst = null;

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(sql);
        pst.setInt(1, idcompania);  // Usamos el parámetro `idcompania` para la consulta

        ResultSet rs = pst.executeQuery();  // Ejecutamos la consulta con executeQuery()

        // Comprobamos si hay algún resultado
        if (rs.next()) {
            // Obtener los datos del ResultSet
            datos[0] = String.valueOf(rs.getInt("idcompania"));
            datos[1] = rs.getString("razonsocial");
            datos[2] = rs.getString("direccion");
            datos[3] = rs.getString("correo");
            datos[4] = rs.getString("telefono");
            datos[5] = rs.getString("web");
            datos[6] = String.valueOf(rs.getDate("fechacreacion"));

            VistaCompanias vc = new VistaCompanias();

            // Pasar los datos de la compañía para la vista de actualización
            vc.setear(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
            vc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vc.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la compañía con ID " + idcompania);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public void actualizar(int idcompania, String razonsocial, String direccion, String correo, String telefono, String web, String fechacreacion) {
    Connection dbConnection = null;
    PreparedStatement pst = null;

    // Cambié la tabla y las columnas a las correspondientes de `tblcompanias`
    String script = "UPDATE tblcompanias SET razonsocial = ?, direccion = ?, correo = ?, telefono = ?, web = ?, fechacreacion = ? WHERE idcompania = ?";

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(script);

        // Establecer los valores de los parámetros
        pst.setString(1, razonsocial);
        pst.setString(2, direccion);
        pst.setString(3, correo);
        pst.setString(4, telefono);
        pst.setString(5, web);
        pst.setString(6, fechacreacion); // Asegúrate de que el formato de fecha sea correcto
        pst.setInt(7, idcompania);  // Condición WHERE

        // Ejecutar la actualización
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro actualizado con éxito.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
    }
}


}
