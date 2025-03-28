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

public class Vehiculo {
    public String matricula;
    public String marca;
    public int puestos;
    public String modelo;
    public int numeromotor;
    public String categoria;
    public int idtipo;
    public int idpromotores;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeromotor() {
        return numeromotor;
    }

    public void setNumeromotor(int numeromotor) {
        this.numeromotor = numeromotor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public int getIdpromotores() {
        return idpromotores;
    }

    public void setIdpromotores(int idpromotores) {
        this.idpromotores = idpromotores;
    }
    
    Conexiones conector = new Conexiones();
    
    public void create(String matricula, String marca, int puestos, String modelo, 
                   int numeroMotor, String categoria, int idTipo, int idPromotores) {

    Connection dbConnection = null;
    PreparedStatement pst = null;

    String script = "INSERT INTO tblvehiculo (matricula, marca, puestos, modelo, numeromotor, categoria, idtipo, idpromotores) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        dbConnection = conector.conectarBD();
        pst = dbConnection.prepareStatement(script);

        pst.setString(1, matricula);
        pst.setString(2, marca);
        pst.setInt(3, puestos);
        pst.setString(4, modelo);
        pst.setInt(5, numeroMotor);
        pst.setString(6, categoria);
        pst.setInt(7, idTipo);
        pst.setInt(8, idPromotores);

        pst.executeUpdate();

        JOptionPane.showConfirmDialog(null, "Registro con éxito.");

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
}
