package br.com.sge.view;

import javax.swing.JOptionPane;

/**
 *
 * @author joseluiz
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
    public Customers() {
        //  setUndecorated(true);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        enableDisableFields(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jrbPJ = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jtfCpfCnpj = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jrbPF = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfContact1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfContact2 = new javax.swing.JFormattedTextField();
        jtfEmail = new javax.swing.JTextField();
        jbSave = new javax.swing.JButton();
        jbDelete = new javax.swing.JButton();
        jbClearText = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 658));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        jrbPJ.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbPJ.setText("Pessoa Jurídica");
        jrbPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPJActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("CPF/CNPJ:");

        try {
            jtfCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCpfCnpj.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nome/Razão Social:");

        jtfName.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Fornecedor:");

        jrbPF.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jrbPF.setText("Pessoa Física");
        jrbPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        jtfAddress.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setText("Contato 1:");

        try {
            jtfContact1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfContact1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setText("Contato 2:");

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel7.setText("E-mail:");

        try {
            jtfContact2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfContact2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jtfEmail.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        jbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/actions/salvar.png"))); // NOI18N
        jbSave.setText("Salvar Fornecedor");

        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/actions/lixeira.png"))); // NOI18N
        jbDelete.setText("Excluir Fornecedor");

        jbClearText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/actions/excluir.png"))); // NOI18N
        jbClearText.setText("Limpar Campos");
        jbClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearTextActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/actions/adicionar.png"))); // NOI18N
        jButton3.setText("Novo Fornecedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(122, 122, 122))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfEmail)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jrbPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbPJ))
                            .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jbClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSave)
                        .addGap(26, 26, 26)
                        .addComponent(jbDelete)
                        .addGap(45, 45, 45))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbPF)
                    .addComponent(jrbPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jtfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jtfContact2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbClearText)
                    .addComponent(jbSave)
                    .addComponent(jbDelete)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        jTable1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TIPO", "CPF/CNPJ", "NOME/RAZÃO", "ENDEREÇO", "CONTATO 1", "CONTATO 2", "E-MAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(8);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(15);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setText("CLIQUE EM SALVAR");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/icons8-casa-16.png"))); // NOI18N
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/icons8-imac-exit-20.png"))); // NOI18N
        jButton2.setText("SAIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/actions/editar.png"))); // NOI18N
        jbEdit.setText("Editar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEdit)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPFActionPerformed
        if (jrbPF.isSelected() == true) {
            jrbPJ.setSelected(false);
            try {
                jtfCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
                jtfCpfCnpj.requestFocusInWindow();
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jrbPFActionPerformed

    private void jrbPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPJActionPerformed
        if (jrbPJ.isSelected() == true) {
            jrbPF.setSelected(false);
            try {
                jtfCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
                jtfCpfCnpj.requestFocusInWindow();
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jrbPJActionPerformed

    private void jbClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearTextActionPerformed
        clearFields();
        enableDisableFields(false);
    }//GEN-LAST:event_jbClearTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new SGE().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        enableDisableFields(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void clearFields() {
        jtfAddress.setText("");
        jtfContact1.setText("");
        jtfContact2.setText("");
        jtfEmail.setText("");
        jtfName.setText("");
        jrbPF.setSelected(false);
        jrbPJ.setSelected(false);
        jrbPF.setSelected(false);
        try {
            jtfCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
    }
    
    private void enableDisableFields(boolean condicao) {
        jtfAddress.setEnabled(condicao);
        jtfContact1.setEnabled(condicao);
        jtfContact2.setEnabled(condicao);
        jtfEmail.setEnabled(condicao);
        jtfName.setEnabled(condicao);
        jrbPF.setEnabled(condicao);
        jrbPJ.setEnabled(condicao);
        jtfCpfCnpj.setEnabled(condicao);
        jbSave.setEnabled(condicao);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbClearText;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbSave;
    private javax.swing.JRadioButton jrbPF;
    private javax.swing.JRadioButton jrbPJ;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JFormattedTextField jtfContact1;
    private javax.swing.JFormattedTextField jtfContact2;
    private javax.swing.JFormattedTextField jtfCpfCnpj;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables

}
