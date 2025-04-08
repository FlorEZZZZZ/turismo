/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import MVC.VistaClientes;
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
    
     public void mostrarClienteActualizar(int idcliente){
    String[] datos = new String[12];
    String sql = "SELECT * FROM tblclientes WHERE id = ?";
    Connection dbConnection = null;
    PreparedStatement pst = null;

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(sql);
        pst.setInt(1, idcliente);  // Usamos el parámetro `idcliente` para la consulta
        
        ResultSet rs = pst.executeQuery();  // Ejecutamos la consulta con executeQuery()

        // Comprobamos si hay algún resultado
        if (rs.next()) {
            // Obtener los datos del ResultSet
            datos[0] = String.valueOf(rs.getInt("id"));
            datos[1] = rs.getString("tipodocumento");
            datos[2] = rs.getString("nombres");
            datos[3] = rs.getString("apellidos");
            datos[4] = rs.getString("eps");
            datos[5] = rs.getString("alergias");
            datos[6] = rs.getString("fechanacimiento");
            datos[7] = rs.getString("correo");
            datos[8] = rs.getString("estadocivil");
            datos[9] = rs.getString("telefono");
            datos[10] = rs.getString("direccion");
            datos[11] = String.valueOf(rs.getInt("documento"));

            VistaClientes vc = new VistaClientes();
            
            // Pasar los datos de cliente para la vista de actualización
            vc.setear(Integer.parseInt(datos[0]), datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9], datos[10], Integer.parseInt(datos[11]));
            vc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vc.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente con ID " + idcliente);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
     
public void actualizar(int idcliente,String nombres,String apellidos, String direccion,String correo,String telefono,String eps,String alergias,String fechanacimiento,String estadocivil,int documento, int tipodocumento) {
    Connection dbConnection = null;
    PreparedStatement pst = null;

    // Cambié la tabla y las columnas a las correspondientes de `tblclientes`
    String script = "UPDATE tblclientes SET tipodocumento = ?, nombres = ?, apellidos = ?, eps = ?, alergias = ?, fechanacimiento = ?, correo = ?, estadocivil = ?, telefono = ?, direccion = ?, documento = ? WHERE id = ?";

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(script);

        // Establecer los valores de los parámetros
        pst.setInt(1, tipodocumento);
        pst.setString(2, nombres);
        pst.setString(3, apellidos);
        pst.setString(4, eps);
        pst.setString(5, alergias);
        pst.setString(6, fechanacimiento);
        pst.setString(7, correo);
        pst.setString(8, estadocivil);
        pst.setString(9, telefono);
        pst.setString(10, direccion);
        pst.setInt(11, documento);
        pst.setInt(12, idcliente);  // Condición WHERE

        // Ejecutar la actualización
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro actualizado con éxito.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
    }
}

}
