package br.com.sge.view;

import br.com.sge.model.UsuarioModel;
import br.com.sge.service.UsuarioService;
import br.com.sge.util.EstiloTableHeader;
import br.com.sge.util.EstiloTableRenderer;
import br.com.sge.util.MyScrollbarUI;
import br.com.sge.util.alerts.ErrorAlert;
import br.com.sge.util.alerts.WarningAlertU;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author joseluiz
 */
public class Users extends javax.swing.JInternalFrame {

    UsuarioService usuarioService = new UsuarioService();
    UsuarioModel usuarioModel = new UsuarioModel();
    ArrayList<UsuarioModel> listaUsuarioModel = new ArrayList<>();

    /**
     * Creates new form NewJInternalFrame
     */
    public Users() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        Users.jtUsers.getTableHeader().setDefaultRenderer(new EstiloTableHeader());
        Users.jtUsers.setDefaultRenderer(Object.class, new EstiloTableRenderer());
        Users.jtUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        loadUsers();
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
        jPanel2 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jbNew = new principal.MaterialButton();
        jbModify = new principal.MaterialButton();
        jbdelete = new principal.MaterialButton();
        jbSearch = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(58, 159, 171));
        cerrar.setText("X");
        cerrar.setToolTipText("");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/icono.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUÁRIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(787, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel7.setBackground(new java.awt.Color(58, 159, 171));

        jbNew.setBackground(new java.awt.Color(255, 255, 255));
        jbNew.setForeground(new java.awt.Color(58, 159, 171));
        jbNew.setText("NOVO USUÁRIO");
        jbNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbNew.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        jbModify.setBackground(new java.awt.Color(255, 255, 255));
        jbModify.setForeground(new java.awt.Color(58, 159, 171));
        jbModify.setText("MODIFICAR");
        jbModify.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbModify.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModifyActionPerformed(evt);
            }
        });

        jbdelete.setBackground(new java.awt.Color(255, 255, 255));
        jbdelete.setForeground(new java.awt.Color(58, 159, 171));
        jbdelete.setText("ELIMINAR");
        jbdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbdelete.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdeleteActionPerformed(evt);
            }
        });

        jbSearch.setBorder(null);
        jbSearch.setForeground(new java.awt.Color(58, 159, 171));
        jbSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSearch.setPlaceholder("BUSCAR");
        jbSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jbSearchKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbModify, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jbdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbModify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jtUsers.setBackground(new java.awt.Color(204, 204, 204));
        jtUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtUsers.setForeground(new java.awt.Color(255, 255, 255));
        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME", "USUÁRIO", "SENHA", "TIPO USUÁRIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtUsers.setDoubleBuffered(true);
        jtUsers.setRowHeight(20);
        jtUsers.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jtUsers.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtUsers);
        if (jtUsers.getColumnModel().getColumnCount() > 0) {
            jtUsers.getColumnModel().getColumn(0).setMinWidth(7);
            jtUsers.getColumnModel().getColumn(0).setPreferredWidth(7);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        NewUser mp = new NewUser(new JFrame(), true);
        NewUser.titulo.setText("REGISTRAR");
        mp.jbRegister.setText("REGISTRAR");
        mp.setVisible(true);
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModifyActionPerformed
        if (Users.jtUsers.getRowCount() < 1) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            ErrorAlert.titulo.setText("AVISOS!!");
            ErrorAlert.msj.setText("A TABELA ESTÁ SEM REGISTROS");
            ErrorAlert.msj1.setText("");
            er.setVisible(true);
        } else {
            if (Users.jtUsers.getSelectedRowCount() < 1) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                ErrorAlert.titulo.setText("AVISO!!");
                ErrorAlert.msj.setText("SELECIONA UM");
                ErrorAlert.msj1.setText("REGISTRO");
                er.setVisible(true);
            } else {

                int fila = Users.jtUsers.getSelectedRow();

                NewUser nUser = new NewUser(new JFrame(), true);
                NewUser.id.setText(Users.jtUsers.getValueAt(fila, 0).toString());
                nUser.nome = Users.jtUsers.getValueAt(fila, 1).toString();
                nUser.login = Users.jtUsers.getValueAt(fila, 2).toString();
                nUser.password = Users.jtUsers.getValueAt(fila, 3).toString();
                nUser.jcbTipo.setSelectedItem(Users.jtUsers.getValueAt(fila, 4).toString());
                NewUser.nombreUs.setText(Users.jtUsers.getValueAt(fila, 1).toString());
                NewUser.titulo.setText("MODIFICAR");
                nUser.loadDataUser();
                nUser.jbRegister.setText("SALVAR");
                nUser.setVisible(true);
            }
        }
    }//GEN-LAST:event_jbModifyActionPerformed

    private void jbdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdeleteActionPerformed
        deleteUsers();
    }//GEN-LAST:event_jbdeleteActionPerformed

    private void jbSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSearchKeyReleased
        searchUsers();
    }//GEN-LAST:event_jbSearchKeyReleased

    private void loadUsers() {
        /**
         * Array que buscará no BD (atraves do Controller) os dados para serem
         * exibidos na tabela
         */
        listaUsuarioModel = usuarioService.getListaUsuarioDAO();
        DefaultTableModel modelo = (DefaultTableModel) jtUsers.getModel();

        // Setando a quantidade de linhas que a tabela para não haver duplicação de
        // dados
        modelo.setNumRows(0);

        try {
            /**
             * insere os produtos na tabela
             */
            int cont = listaUsuarioModel.size();
            for (int i = 0; i < cont; i++) {
                modelo.addRow(
                        new Object[]{listaUsuarioModel.get(i).getIdUsuario(),
                            listaUsuarioModel.get(i).getUsuNome(),
                            listaUsuarioModel.get(i).getUsuLogin(),
                            listaUsuarioModel.get(i).getUsuSenha(),
                            listaUsuarioModel.get(i).getUsuTipo()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar usuários para preencher a tabela\n" + e.toString());

        }
    }

    private void deleteUsers() {
        if (Users.jtUsers.getRowCount() < 1) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            ErrorAlert.titulo.setText("AVISO!!");
            ErrorAlert.msj.setText("A TABELA ESTÁ SEM REGISTROS");
            ErrorAlert.msj1.setText("");
            er.setVisible(true);
        } else {
            if (Users.jtUsers.getSelectedRowCount() < 1) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                ErrorAlert.titulo.setText("AVISO!!");
                ErrorAlert.msj.setText("SELECIONA UM");
                ErrorAlert.msj1.setText("REGISTRO");
                er.setVisible(true);
            } else {
                int fila = Users.jtUsers.getSelectedRow();

                if (Users.jtUsers.getValueAt(fila, 0).toString().equals("1")) {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    ErrorAlert.titulo.setText("AVISO!!");
                    ErrorAlert.msj.setText("VOCÊ NÃO PODE ELIMINAR");
                    ErrorAlert.msj1.setText("ESTE USUÁRIO");
                    er.setVisible(true);
                } else {

                    int linha = jtUsers.getSelectedRow();
                    int codigoUsuario = (int) jtUsers.getValueAt(linha, 0);
                    /**
                     * menu de opções para o usuario confirmar a exclusão
                     */

                    WarningAlertU wa = new WarningAlertU(new JFrame(), true);
                    WarningAlertU.titulo.setText("EXCLUIR?");
                    WarningAlertU.msj.setText("ESSA OPERAÇÃO NÃO PODERÁ");
                    WarningAlertU.msj1.setText("SER DESFEITA");
                    wa.setVisible(true);
                    if (wa.status == true) {
                        try {
                            usuarioService.excluirUsuarioDAO(codigoUsuario);
                            loadUsers();
                        } catch (HeadlessException e) {
                            ErrorAlert er = new ErrorAlert(new JFrame(), true);
                            ErrorAlert.titulo.setText("AVISO!!");
                            ErrorAlert.msj.setText("ERRO AO EXCLUIR");
                            ErrorAlert.msj1.setText("O USUÁRIO");
                            er.setVisible(true);
                        }
                    } else {
                        ErrorAlert errorAlert = new ErrorAlert(new JFrame(), true);
                        ErrorAlert.titulo.setText("CANCELADO!");
                        ErrorAlert.msj.setText("OPERAÇÃO CANCELADA");
                        ErrorAlert.msj1.setText("O USUÁRIO NÃO FOI EXCLUIDO");
                        errorAlert.setVisible(true);

                    }
                }
            }
        }
    }

    private void searchUsers() {
        DefaultTableModel modelo = (DefaultTableModel) Users.jtUsers.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        Users.jtUsers.setRowSorter(classificador);
        String texto = jbSearch.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButton jbModify;
    private principal.MaterialButton jbNew;
    public static app.bolivia.swing.JCTextField jbSearch;
    private principal.MaterialButton jbdelete;
    public static javax.swing.JTable jtUsers;
    // End of variables declaration//GEN-END:variables
}
