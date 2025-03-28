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
    
}
