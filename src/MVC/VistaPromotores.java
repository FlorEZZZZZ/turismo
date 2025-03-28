/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC;

import Modelo.Promotores;
import javax.swing.JOptionPane;

public class VistaPromotores extends javax.swing.JFrame {

    public int tipoDocumento;
    
    public VistaPromotores() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdcc = new javax.swing.JRadioButton();
        rdti = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txfdocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txfnombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfapellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfdireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfxcorreopersonal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfxcorreocorporativo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txffechanacimiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txftelefono = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();

        buttonGroup1.add(rdcc);
        buttonGroup1.add(rdti);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registrar Promotores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setText("Tipo de documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        rdcc.setText("Cedula");
        jPanel1.add(rdcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        rdti.setText("Tarjeta Identidad");
        rdti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtiActionPerformed(evt);
            }
        });
        jPanel1.add(rdti, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel3.setText("Documento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(txfdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 290, -1));

        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(txfnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 290, -1));

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));
        jPanel1.add(txfapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 290, -1));

        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jPanel1.add(txfdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 290, -1));

        jLabel7.setText("Correo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel1.add(txfcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 290, -1));

        jLabel8.setText("Correo Personal");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        jPanel1.add(tfxcorreopersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 290, -1));

        jLabel9.setText("Correo Corporativo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        jPanel1.add(tfxcorreocorporativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 290, -1));

        jLabel10.setText("Fecha Nacimiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        jPanel1.add(txffechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 290, -1));

        jLabel11.setText("Telefono");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        jPanel1.add(txftelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 290, -1));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdtiActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
if (rdcc.isSelected()) {
    tipoDocumento = 1;
} else if (rdti.isSelected()) {
    tipoDocumento = 2;
}

try {
    // Capturar datos desde los campos de texto
    int documento = Integer.parseInt(txfdocumento.getText());
    String nombres = txfnombres.getText();
    String apellidos = txfapellidos.getText();
    String direccion = txfdireccion.getText();
    String correo = txfcorreo.getText();
    String correoPersonal = txfcorreo.getText();
    String correoCorp = tfxcorreocorporativo.getText();
    String fechaNacimiento = txffechanacimiento.getText();
    String telefono = txftelefono.getText();

    // Instanciar la clase Clientes y enviar los datos
    Promotores cr = new Promotores();
    cr.create(tipoDocumento, documento, nombres, apellidos, direccion, correo, correoPersonal, correoCorp, fechaNacimiento, telefono);

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
            java.util.logging.Logger.getLogger(VistaPromotores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPromotores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPromotores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPromotores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPromotores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdcc;
    private javax.swing.JRadioButton rdti;
    private javax.swing.JTextField tfxcorreocorporativo;
    private javax.swing.JTextField tfxcorreopersonal;
    private javax.swing.JTextField txfapellidos;
    private javax.swing.JTextField txfcorreo;
    private javax.swing.JTextField txfdireccion;
    private javax.swing.JTextField txfdocumento;
    private javax.swing.JTextField txffechanacimiento;
    private javax.swing.JTextField txfnombres;
    private javax.swing.JTextField txftelefono;
    // End of variables declaration//GEN-END:variables
}
