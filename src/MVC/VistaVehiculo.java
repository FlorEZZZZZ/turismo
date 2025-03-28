/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC;

import Modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class VistaVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form Vehiculo
     */
    public VistaVehiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfmatricula = new javax.swing.JTextField();
        txfmarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfpuestos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfmodelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfnumeromotor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfcategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfidtransporte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txfidpromotor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registrar Vehiculo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setText("Matricula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel1.add(txfmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 350, -1));
        jPanel1.add(txfmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 350, -1));

        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));
        jPanel1.add(txfpuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 350, -1));

        jLabel4.setText("Puestos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel1.add(txfmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 350, -1));

        jLabel5.setText("Modelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jPanel1.add(txfnumeromotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 350, -1));

        jLabel6.setText("Numero del Motor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel1.add(txfcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 350, -1));

        jLabel7.setText("Categoria");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel1.add(txfidtransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 350, -1));

        jLabel8.setText("Id tipo de Transporte");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel1.add(txfidpromotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 350, -1));

        jLabel9.setText("Id del Promotor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
try {
    String matricula = txfmatricula.getText();
    String marca = txfmarca.getText();
    int puestos = Integer.parseInt(txfpuestos.getText());
    String modelo = txfmodelo.getText();
    int numeroMotor = Integer.parseInt(txfnumeromotor.getText());
    String categoria = txfcategoria.getText();
    int idTipo = Integer.parseInt(txfidtransporte.getText());
    int idPromotores = Integer.parseInt(txfidpromotor.getText());

    Vehiculo cr = new Vehiculo();
    cr.create(matricula, marca, puestos, modelo, numeroMotor, categoria, idTipo, idPromotores);

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Error en los datos: Verifica los campos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_btnregistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txfcategoria;
    private javax.swing.JTextField txfidpromotor;
    private javax.swing.JTextField txfidtransporte;
    private javax.swing.JTextField txfmarca;
    private javax.swing.JTextField txfmatricula;
    private javax.swing.JTextField txfmodelo;
    private javax.swing.JTextField txfnumeromotor;
    private javax.swing.JTextField txfpuestos;
    // End of variables declaration//GEN-END:variables
}
