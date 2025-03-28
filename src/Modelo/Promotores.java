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
public class Promotores {
 
      public int id;
    public int tipodocumento;
    public int documento;
    public String nombres;
    public String apellidos;
    public String direccion;
    public String correo;
    public String correopersonal;
    public String correocorp;
    public String fechanacimiento;
    public String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(int tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getCorreopersonal() {
        return correopersonal;
    }

    public void setCorreopersonal(String correopersonal) {
        this.correopersonal = correopersonal;
    }

    public String getCorreocorp() {
        return correocorp;
    }

    public void setCorreocorp(String correocorp) {
        this.correocorp = correocorp;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    Conexiones conector = new Conexiones();

    
public void create(int tipoDocumento, int documento, String nombres, String apellidos, String direccion, String correo, String correoPersonal,String correoCorp, String fechaNacimiento, String telefono) {
    
    Connection dbConnection = null;
    PreparedStatement pst = null;

    String script = "INSERT INTO tblpromotores (tipoDocumento, documento, nombres, apellidos, direccion, correo, correopersonal, correocorp, fechanacimiento, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(script);

        pst.setInt(1, tipoDocumento);
        pst.setInt(2, documento);
        pst.setString(3, nombres);
        pst.setString(4, apellidos);
        pst.setString(5, direccion);
        pst.setString(6, correo);
        pst.setString(7, correoPersonal);
        pst.setString(8, correoCorp);
        pst.setString(9, fechaNacimiento);
        pst.setString(10, telefono);

        pst.executeUpdate();

        JOptionPane.showConfirmDialog(null, "Registro con éxito.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
