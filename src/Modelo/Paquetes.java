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
    
}
