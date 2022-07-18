/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import javax.swing.JOptionPane;
import sun.security.jgss.spi.MechanismFactory;

/**
 *
 * @author John PV
 */
public class VtnBajaProfesores extends javax.swing.JFrame
{

    /**
     * Creates new form VtnBajaProfesores
     */
    public VtnBajaProfesores()
    {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCve = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProfDesp = new javax.swing.JMenu();
        DespP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja Profesores");

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la clave del servidor publico");

        txtCve.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtCveKeyTyped(evt);
            }
        });

        mnuProfDesp.setText("Profesores Despedidos");
        mnuProfDesp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuProfDespActionPerformed(evt);
            }
        });

        DespP.setText("Ver...");
        DespP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DespPActionPerformed(evt);
            }
        });
        mnuProfDesp.add(DespP);

        jMenuBar1.add(mnuProfDesp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCve, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtCveKeyTyped
    {//GEN-HEADEREND:event_txtCveKeyTyped
        String s = txtCve.getText();
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9' || s.length() == 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCveKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed

        try
        {
            boolean existe = Prb.conn.buscaProfesor(Integer.parseInt(txtCve.getText()));
            if (existe)
            {
                int option = Mensaje.pregunta(this, "Seguro que desea eliminar al profesor de la base de datos?");
                if (option == JOptionPane.YES_OPTION)
                {
                    int a = Integer.parseInt(txtCve.getText());
                    Prb.conn.eliminaProf(a);
                    Mensaje.exito(this, "Se ha eliminado el profesor de la base de datos\n"
                            + "Puede consultarlo aún en la tabla de profesores despedidos");
                }
            } else
            {
                Mensaje.error(this, "No existe el profesor");
            }
        } catch (Exception e)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnuProfDespActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuProfDespActionPerformed
    {//GEN-HEADEREND:event_mnuProfDespActionPerformed

    }//GEN-LAST:event_mnuProfDespActionPerformed

    private void DespPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DespPActionPerformed
    {//GEN-HEADEREND:event_DespPActionPerformed
        new VtnProfDesp().setVisible(true);
    }//GEN-LAST:event_DespPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnBajaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBajaProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DespP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuProfDesp;
    private javax.swing.JTextField txtCve;
    // End of variables declaration//GEN-END:variables
}
