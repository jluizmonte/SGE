package br.com.sge.view;

import br.com.sge.model.SessaoUsuarioModel;
import br.com.sge.model.UsuarioModel;
import br.com.sge.service.UsuarioService;
import br.com.sge.util.alerts.AWTUtilities;
import br.com.sge.util.alerts.ErrorAlert;
import br.com.sge.util.alerts.FadeEffect;
import br.com.sge.util.alerts.WarningAlertCerrar;
import java.awt.HeadlessException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author joseluiz
 */
public class Login extends javax.swing.JFrame {

    /**
     * instancia do model, service e sessão do usuário criação de lista de
     * usuário.
     */
    UsuarioService usuarioService = new UsuarioService();
    UsuarioModel usuarioModel = new UsuarioModel();
    ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();
    SessaoUsuarioModel sessaoUsuarioModel = new SessaoUsuarioModel();

    int x, y;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/br/com/sge/images/background/logo_small.png")).getImage());
        this.setLocation(400, 100);
        AWTUtilities.setOpaque(this, true);
        FadeEffect.fadeInFrame(this, 50, 0.1f);
        jtfLogin.requestFocus();
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
        jtfLogin = new app.bolivia.swing.JCTextField();
        jPanel1 = new javax.swing.JPanel();
        jbClose = new principal.MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfPassword = new jpass.JRPasswordField();
        jLabel7 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbLogin = new principal.MaterialButtomRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/alerts/fondo.png"))); // NOI18N
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });

        jtfLogin.setBorder(null);
        jtfLogin.setForeground(new java.awt.Color(58, 159, 171));
        jtfLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfLogin.setPlaceholder("LOGIN");
        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(58, 159, 171));

        jbClose.setBackground(new java.awt.Color(255, 255, 255));
        jbClose.setForeground(new java.awt.Color(58, 159, 171));
        jbClose.setText("X");
        jbClose.setToolTipText("");
        jbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbClose.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/background/login-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-usuario.png"))); // NOI18N

        jtfPassword.setBorder(null);
        jtfPassword.setForeground(new java.awt.Color(58, 159, 171));
        jtfPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfPassword.setPlaceholder("SENHA");
        jtfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-contrasena.png"))); // NOI18N

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(58, 159, 171));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        jbLogin.setBackground(new java.awt.Color(255, 255, 255));
        jbLogin.setForeground(new java.awt.Color(58, 159, 171));
        jbLogin.setText("INICIAR SESSÃO");
        jbLogin.setToolTipText("");
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbLogin.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
        WarningAlertCerrar.titulo.setText("SAIR?");
        WarningAlertCerrar.msj.setText("O SISTEMA SERÁ ENCERRADO");
        WarningAlertCerrar.msj1.setText("");
        wa.setVisible(true);
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        if (jtfLogin.getText().equals("") || Login.jtfPassword.getText().equals("")) {
            lblInfo.setText("LOGIN E SENHAS REQUERIDOS");
            jtfLogin.requestFocus();
        } else {
            login();
        }
    }//GEN-LAST:event_jbLoginActionPerformed

    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panel1MousePressed

    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_panel1MouseDragged

    private void jtfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordActionPerformed
        if (Login.jtfLogin.getText().equals("") || Login.jtfPassword.getText().equals("")) {
            Login.lblInfo.setText("LOGIN E SENHAS REQUERIDOS");
            Login.jtfLogin.requestFocus();
        } else {
            login();
        }
    }//GEN-LAST:event_jtfPasswordActionPerformed

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        jtfPassword.requestFocusInWindow();
    }//GEN-LAST:event_jtfLoginActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    /**
     * metodo para fazer o login.
     */
    private void login() {

        usuarioModel.setUsuLogin(jtfLogin.getText());
        usuarioModel.setUsuSenha(String.valueOf(jtfPassword.getPassword()));

        try {
            if (usuarioService.getValidarUsuarioDAO(usuarioModel)) {
                usuarioModel = usuarioService.getUsuarioDAO(jtfLogin.getText());
                setSessionUser();
                //   new Principal().setVisible(true);
                new Sales().setVisible(true);
                this.dispose();
            } else {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                ErrorAlert.titulo.setText("AVISO!!");
                ErrorAlert.msj.setText("LOGIN OU SENHAS INVÁLIDOS");
                ErrorAlert.msj1.setText("REVISE OS DADOS INSERIDOS");
                er.setVisible(true);
                clearFields();
            }
        } catch (HeadlessException e) {
        }

    }

    private void clearFields() {
        jtfLogin.setText("");
        jtfPassword.setText("");
    }

    private void setSessionUser() {
        SessaoUsuarioModel.codigoUsuario = usuarioModel.getIdUsuario();
        SessaoUsuarioModel.nomeUsuario = usuarioModel.getUsuNome();
        SessaoUsuarioModel.loginUsuario = usuarioModel.getUsuLogin();
        SessaoUsuarioModel.tipoUsuario = usuarioModel.getUsuTipo();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private static principal.MaterialButton jbClose;
    private static principal.MaterialButtomRectangle jbLogin;
    public static app.bolivia.swing.JCTextField jtfLogin;
    public static jpass.JRPasswordField jtfPassword;
    public static javax.swing.JLabel lblInfo;
    private static org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
