/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aida.frame;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.PasswordView;

/**
 *
 * @author Maicol Andres
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEntrar = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnregresarOpcion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnRegistro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6681204 (2).png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, 130));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 80, 30));

        txtusuario.setBackground(new java.awt.Color(0, 51, 204));
        txtusuario.setFont(new java.awt.Font("Cutive", 1, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setText("ingrese su usario");
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 200, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 196, 15));
        jLabel6.setText("ENTRAR");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 70, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AIDA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 90, -1));

        jTextField1.setBackground(new java.awt.Color(111, 156, 198));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 200, 10));

        btnEntrar.setBackground(new java.awt.Color(79, 77, 78));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plomo-min-scaled.jpg"))); // NOI18N
        btnEntrar.setText("jButton1");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 196, 15)));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 80, 30));

        jpassword.setBackground(new java.awt.Color(0, 51, 204));
        jpassword.setForeground(new java.awt.Color(204, 204, 204));
        jpassword.setText("******************");
        jpassword.setBorder(null);
        jpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpasswordMousePressed(evt);
            }
        });
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jLabel7.setForeground(new java.awt.Color(241, 196, 15));
        jLabel7.setText("¿no tienes una cuenta? ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(241, 196, 15));
        jLabel11.setText("REGRESAR");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 80, 30));

        btnregresarOpcion.setBackground(new java.awt.Color(79, 77, 78));
        btnregresarOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plomo-min-scaled.jpg"))); // NOI18N
        btnregresarOpcion.setText("jButton1");
        btnregresarOpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 196, 15)));
        btnregresarOpcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregresarOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarOpcionActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresarOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 90, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 196, 15));
        jLabel8.setText("Registrate!");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 90, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 200, -1));

        btnRegistro.setBackground(new java.awt.Color(79, 77, 78));
        btnRegistro.setForeground(new java.awt.Color(241, 196, 15));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Plomo-min-scaled.jpg"))); // NOI18N
        btnRegistro.setText("jButton1");
        btnRegistro.setBorder(null);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 70, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9088655f-57d7-4c8d-b04c-343e846c196a.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        JOptionPane.showMessageDialog(null, "LOS SERVIDORES ESTÁN EN MANTENIMIENTO");
        try{
            Register m1=new Register();
            this.setVisible(false);
            m1.setVisible(true);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed

    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpasswordMousePressed
        if(String.valueOf(jpassword.getPassword()).equals("******************")){
            jpassword.setText("");
            jpassword.setForeground(Color.black);
        }
        if(txtusuario.getText().isEmpty()){
            txtusuario.setText("ingrese su usario");
            txtusuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_jpasswordMousePressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        JOptionPane.showMessageDialog(null, "USER:  "+txtusuario.getText()+"\n PASSWORD: "+jpassword.getText());
        User a2=null;
        for(int i=0;i<Register.modelo.size();i++){
            a2= (User) Register.modelo.get(i);
            JOptionPane.showMessageDialog(null, a2.getContrasena());
        }
        /*if(jpassword.getText()!=a2.getContrasena()){
            JOptionPane.showMessageDialog(null, "la contraseña o el usuario es incorrecto");
            return;
        }*/
        this.setVisible(false);
        ServicePay pay=new ServicePay();
        pay.setVisible(true);

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed
        if(txtusuario.getText().equals("ingrese su usario")){
            txtusuario.setText("");
            txtusuario.setForeground(Color.black);
        }
        if(String.valueOf(jpassword.getPassword()).isEmpty()){
            jpassword.setText("******************");
            jpassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtusuarioMousePressed

    private void btnregresarOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarOpcionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        InicioRegistro inicioRegistro=new InicioRegistro();
        inicioRegistro.setVisible(true);
    }//GEN-LAST:event_btnregresarOpcionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnregresarOpcion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
