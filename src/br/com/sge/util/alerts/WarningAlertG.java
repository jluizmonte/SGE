package br.com.sge.util.alerts;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author joseluiz
 */
public class WarningAlertG extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form Error
     *
     * @param parent
     * @param modal
     */
    public WarningAlertG(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        localization(0);
        WarningAlertG.id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        msj = new javax.swing.JLabel();
        msj1 = new javax.swing.JLabel();
        jbOk = new principal.MaterialButton();
        jbCancelar = new principal.MaterialButton();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/alerts/fondo.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/alerts/warning.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 19, -1, 155));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Titulo");
        panel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, 366, 32));

        msj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msj.setForeground(new java.awt.Color(102, 102, 102));
        msj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj.setText("Titulo");
        panel1.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 241, 366, -1));

        msj1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msj1.setForeground(new java.awt.Color(102, 102, 102));
        msj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msj1.setText("Titulo");
        panel1.add(msj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 278, 366, -1));

        jbOk.setBackground(new java.awt.Color(58, 159, 171));
        jbOk.setForeground(new java.awt.Color(255, 255, 255));
        jbOk.setText("OK");
        jbOk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbOk.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkActionPerformed(evt);
            }
        });
        jbOk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbOkKeyTyped(evt);
            }
        });
        panel1.add(jbOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 317, 182, 53));

        jbCancelar.setBackground(new java.awt.Color(204, 0, 0));
        jbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelar.setText("CANCELAR");
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCancelar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        panel1.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 317, 174, 53));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("id");
        panel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 11, 30, -1));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 407, 387));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkActionPerformed
//        int elimina = Opciones.eliminar(Integer.parseInt(WarningAlertG.id.getText()));
//        if (elimina != 0) {
//            Opciones.listar("");
//            Opciones.totalGastos();
        this.dispose();
        SuccessAlert sa = new SuccessAlert(new JFrame(), true);
        sa.titulo.setText("OK");
        sa.msj.setText("UM REGSITRO FOI");
        sa.msj1.setText("ELIMINADO");
        sa.setVisible(true);

    }//GEN-LAST:event_jbOkActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    close();
                } else {
                    localization(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    localization(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jbOkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbOkKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
//            int elimina = Opciones.eliminar(Integer.parseInt(WarningAlertG.id.getText()));
//            if (elimina != 0) {
//                Opciones.listar("");
//                Opciones.totalGastos();
            this.dispose();
            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
            sa.titulo.setText("OK");
            sa.msj.setText("UM REGSITRO FOI");
            sa.msj1.setText("ELIMINADO");
            sa.setVisible(true);

        }
    }//GEN-LAST:event_jbOkKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private principal.MaterialButton jbCancelar;
    private principal.MaterialButton jbOk;
    public static javax.swing.JLabel msj;
    public static javax.swing.JLabel msj1;
    private org.edisoncor.gui.panel.Panel panel1;
    public static javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void close() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void localization(int y) {
        this.setLocation(640, y - 120);
    }
}
