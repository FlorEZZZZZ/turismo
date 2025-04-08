/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexiones;
import MVC.VistaPaquetes;
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
public class Paquetes {
    
    public int codigo; 
public int iddestino; 
public int idorigen; 
public String fechaventa; 
public String horaventa; 
public String horasalida; 
public String fechaejecucion; 
public String observacion; 
public int idcliente; 
public int idagencia; 
public int idmedio; 
public int idoperadores; 
public String matricula; 
public String precios;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIddestino() {
        return iddestino;
    }

    public void setIddestino(int iddestino) {
        this.iddestino = iddestino;
    }

    public int getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(int idorigen) {
        this.idorigen = idorigen;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getHoraventa() {
        return horaventa;
    }

    public void setHoraventa(String horaventa) {
        this.horaventa = horaventa;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getFechaejecucion() {
        return fechaejecucion;
    }

    public void setFechaejecucion(String fechaejecucion) {
        this.fechaejecucion = fechaejecucion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdagencia() {
        return idagencia;
    }

    public void setIdagencia(int idagencia) {
        this.idagencia = idagencia;
    }

    public int getIdmedio() {
        return idmedio;
    }

    public void setIdmedio(int idmedio) {
        this.idmedio = idmedio;
    }

    public int getIdoperadores() {
        return idoperadores;
    }

    public void setIdoperadores(int idoperadores) {
        this.idoperadores = idoperadores;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }
    
    Conexiones conector = new Conexiones();

    
    public void create(int idDestino,int idOrigen,String fechaVenta,String horaVenta,String horaSalida,String fechaEjecucion,String observacion,int idCliente,int idAgencia,int idMedio,int idOperadores,String matricula,String precios) {
        Connection dbConnection = null;
        PreparedStatement pst = null;

        String script = "INSERT INTO tblpaquetes (idDestino, idOrigen, fechaVenta, horaVenta, horaSalida, fechaEjecucion, observacion, idCliente, idAgencia, idMedio, idOperadores, matricula, precios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            dbConnection = conector.conectarBD();
            pst = dbConnection.prepareStatement(script);

            pst.setInt(1, idDestino);            
            pst.setInt(2, idOrigen);
            pst.setString(3, fechaVenta);
            pst.setString(4, horaVenta);
            pst.setString(5, horaSalida);
            pst.setString(6, fechaEjecucion);
            pst.setString(7, observacion);
            pst.setInt(8, idCliente);
            pst.setInt(9, idAgencia);
            pst.setInt(10, idMedio);
            pst.setInt(11, idOperadores);            
            pst.setString(12, matricula);            
            pst.setString(13, precios);
            pst.executeUpdate();

            JOptionPane.showConfirmDialog(null, "Registro con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
    
    public void mostrarPaqueteActualizar(int codigopaquete) {
    String[] datos = new String[14]; // Necesitamos 12 campos para tblpaquetes
    String sql = "SELECT * FROM tblpaquetes WHERE codigo = ?";
    Connection dbConnection = null;
    PreparedStatement pst = null;

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(sql);
        pst.setInt(1, codigopaquete);  // Usamos el parámetro `codigopaquete` para la consulta

        ResultSet rs = pst.executeQuery();  // Ejecutamos la consulta con executeQuery()

        // Comprobamos si hay algún resultado
        if (rs.next()) {
            // Obtener los datos del ResultSet
            datos[0] = String.valueOf(rs.getInt("codigo"));
            datos[1] = String.valueOf(rs.getInt("iddestino"));
            datos[2] = String.valueOf(rs.getInt("idorigen"));
            datos[3] = rs.getString("fechaventa");
            datos[4] = rs.getString("horaventa");
            datos[5] = rs.getString("horasalida");
            datos[6] = rs.getString("fechaejecucion");
            datos[7] = rs.getString("observacion");
            datos[8] = String.valueOf(rs.getInt("idcliente"));
            datos[9] = String.valueOf(rs.getInt("idagencia"));
            datos[10] = String.valueOf(rs.getInt("idmedio"));
            datos[11] = String.valueOf(rs.getInt("idoperadores"));
            datos[12] = rs.getString("matricula");
            datos[13] = rs.getString("precios");

            VistaPaquetes vp = new VistaPaquetes();

            // Pasar los datos del paquete para la vista de actualización
            vp.setear(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Integer.parseInt(datos[2]), 
                datos[3], datos[4], datos[5], datos[6], datos[7], Integer.parseInt(datos[8]),
                Integer.parseInt(datos[9]), Integer.parseInt(datos[10]), Integer.parseInt(datos[11]),
                datos[12], datos[13]);
            
            vp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vp.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el paquete con código " + codigopaquete);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void actualizar(int codigo, int iddestino, int idorigen, String fechaventa, String horaventa, 
                       String horasalida, String fechaejecucion, String observacion, int idcliente, 
                       int idagencia, int idmedio, int idoperadores, String matricula, String precios) {
    Connection dbConnection = null;
    PreparedStatement pst = null;

    // Cambié la tabla y las columnas a las correspondientes de `tblpaquetes`
    String script = "UPDATE tblpaquetes SET iddestino = ?, idorigen = ?, fechaventa = ?, horaventa = ?, " +
                    "horasalida = ?, fechaejecucion = ?, observacion = ?, idcliente = ?, idagencia = ?, " +
                    "idmedio = ?, idoperadores = ?, matricula = ?, precios = ? WHERE codigo = ?";

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(script);

        // Establecer los valores de los parámetros
        pst.setInt(1, iddestino);
        pst.setInt(2, idorigen);
        pst.setString(3, fechaventa);
        pst.setString(4, horaventa);
        pst.setString(5, horasalida);
        pst.setString(6, fechaejecucion);
        pst.setString(7, observacion);
        pst.setInt(8, idcliente);
        pst.setInt(9, idagencia);
        pst.setInt(10, idmedio);
        pst.setInt(11, idoperadores);
        pst.setString(12, matricula);
        pst.setString(13, precios);
        pst.setInt(14, codigo);  // Condición WHERE

        // Ejecutar la actualización
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro actualizado con éxito.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
    }
}

}
