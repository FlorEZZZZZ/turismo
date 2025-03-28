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
public class Clientes {

    public int id;
    public int tipodocumento;
    public String nombres;
    public String apellidos;
    public String eps;
    public String alergias;
    public String fechanacimiento;
    public String correo;
    public String estadocivil;
    public String telefono;
    public String direccion;
    public int documento;

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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }  
    
        Conexiones conector = new Conexiones();
    
     public void create(int tipodocumento,String nombres,String apellidos,String eps,String alergias,String fechaNacimiento,String correo,String estadoCivil,String telefono,String direccion, int documento) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tblclientes (tipodocumento, nombres, apellidos, eps, alergias, fechaNacimiento, correo, estadoCivil, telefono, direccion, documento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setInt(1, tipodocumento);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, eps);
            pst.setString(5, alergias);
            pst.setString(6, fechaNacimiento);
            pst.setString(7, correo);
            pst.setString(8, estadoCivil);
            pst.setString(9, telefono);
            pst.setString(10, direccion);
            pst.setInt(11, documento);

            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
