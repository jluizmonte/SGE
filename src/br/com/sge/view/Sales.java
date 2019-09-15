package br.com.sge.view;

import br.com.sge.model.ProdutoModel;
import br.com.sge.model.SessaoUsuarioModel;
import br.com.sge.service.ProdutoService;
import br.com.sge.service.VendasService;
import br.com.sge.util.EstiloTableHeader;
import br.com.sge.util.EstiloTableRenderer;
import br.com.sge.util.MyScrollbarUI;
import br.com.sge.util.alerts.ErrorAlert;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joseluiz
 */
public class Sales extends javax.swing.JFrame {
    
    public static ProdutoModel produtoModel = new ProdutoModel();
    ProdutoService produtoService = new ProdutoService();
    public static ArrayList<ProdutoModel> listaProdutoModel = new ArrayList<>();

    /**
     * Creates new form NewJInternalFrame
     */
    public Sales() {
        //     setUndecorated(true);
        initComponents();
        //   ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); //remove bordas da janela
        jtSales.getTableHeader().setDefaultRenderer(new EstiloTableHeader());
        jtSales.setDefaultRenderer(Object.class, new EstiloTableRenderer());
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        clearFields();
        //     setExtendedState(MAXIMIZED_BOTH);
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
        jbExit = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblSaleNumber = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jtfQtde = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfModify = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        jbSearchProduct = new principal.MaterialButton();
        jPanel4 = new javax.swing.JPanel();
        jtfClient = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfDate = new app.bolivia.swing.JCTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtfVendedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSales = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbCancel = new principal.MaterialButton();
        jbSale = new principal.MaterialButton();
        jbRemove = new principal.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(58, 159, 171));

        jbExit.setBackground(new java.awt.Color(255, 255, 255));
        jbExit.setForeground(new java.awt.Color(58, 159, 171));
        jbExit.setText("X");
        jbExit.setToolTipText("");
        jbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbExit.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/caja.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VENDAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addComponent(jLabel4)
                    .addContainerGap(844, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171), 3));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 159, 171));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No. VENDA");

        lblSaleNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblSaleNumber.setForeground(new java.awt.Color(58, 159, 171));
        lblSaleNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaleNumber.setText("$No. VENDA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSaleNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblSaleNumber)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171), 3));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfQtde.setEditable(false);
        jtfQtde.setBackground(new java.awt.Color(255, 255, 255));
        jtfQtde.setBorder(null);
        jtfQtde.setForeground(new java.awt.Color(58, 159, 171));
        jtfQtde.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfQtde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfQtde.setPlaceholder("QUANTIDADE");
        jtfQtde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfQtdeKeyTyped(evt);
            }
        });
        jPanel8.add(jtfQtde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-importe.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, -1));

        jtfModify.setEditable(false);
        jtfModify.setBackground(new java.awt.Color(255, 255, 255));
        jtfModify.setBorder(null);
        jtfModify.setForeground(new java.awt.Color(58, 159, 171));
        jtfModify.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfModify.setPlaceholder("CAMBIO");
        jtfModify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfModifyKeyTyped(evt);
            }
        });
        jPanel8.add(jtfModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-cambio.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        jbSearchProduct.setBackground(new java.awt.Color(58, 159, 171));
        jbSearchProduct.setForeground(new java.awt.Color(255, 255, 255));
        jbSearchProduct.setText("produtos");
        jbSearchProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbSearchProduct.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchProductActionPerformed(evt);
            }
        });
        jPanel8.add(jbSearchProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 159, 171), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfClient.setEditable(false);
        jtfClient.setBackground(new java.awt.Color(255, 255, 255));
        jtfClient.setBorder(null);
        jtfClient.setForeground(new java.awt.Color(58, 159, 171));
        jtfClient.setText("$PUBLICO EM GERAL");
        jtfClient.setToolTipText("");
        jtfClient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfClient.setPlaceholder("CLIENTE");
        jPanel4.add(jtfClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-cliente.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 310, -1));

        jtfDate.setBorder(null);
        jtfDate.setForeground(new java.awt.Color(58, 159, 171));
        jtfDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfDate.setPlaceholder("DATA");
        jPanel4.add(jtfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-calendario.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 310, -1));

        jSeparator1.setBackground(new java.awt.Color(58, 159, 171));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 200));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/background/logo.jpg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 210));

        jtfVendedor.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jtfVendedor.setForeground(new java.awt.Color(58, 159, 171));
        jtfVendedor.setText("$VENDEDOR");
        jtfVendedor.setBorder(null);
        jPanel4.add(jtfVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 160, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sge/images/icon/campo-usuario.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jPanel7.setBackground(new java.awt.Color(58, 159, 171));

        jtSales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtSales.setForeground(new java.awt.Color(255, 255, 255));
        jtSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "DESCRIÇÃO", "CATEGORIA", "QUANTIDADE", "R$ UNITÁRIO", "$TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtSales.setDoubleBuffered(true);
        jtSales.setRowHeight(20);
        jtSales.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jtSales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtSales);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("TOTAL A PAGAR: R$");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("0.0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel6.setBorder(dropShadowBorder1);

        jbCancel.setBackground(new java.awt.Color(58, 159, 171));
        jbCancel.setForeground(new java.awt.Color(255, 255, 255));
        jbCancel.setText("CANCELAR");
        jbCancel.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Canclar la ventar</h4> </body> </html>");
        jbCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbCancel.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jbSale.setBackground(new java.awt.Color(58, 159, 171));
        jbSale.setForeground(new java.awt.Color(255, 255, 255));
        jbSale.setText("REALIZAR VENDA");
        jbSale.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbSale.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaleActionPerformed(evt);
            }
        });

        jbRemove.setBackground(new java.awt.Color(58, 159, 171));
        jbRemove.setForeground(new java.awt.Color(255, 255, 255));
        jbRemove.setText("REMOVER");
        jbRemove.setToolTipText("");
        jbRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbRemove.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jbRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jbRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSale, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        //  producto.Opciones.cancelarTransaccion();
        //  this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jbExitActionPerformed

    private void jtfQtdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfQtdeKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
        if ((num == KeyEvent.VK_ENTER)) {
            if (Sales.jtfQtde.getText().equals("")) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                ErrorAlert.titulo.setText("AVISO!");
                ErrorAlert.msj.setText("INSERA UMA QUANTIDADE");
                ErrorAlert.msj1.setText("PARA O PRODUTO");
                er.setVisible(true);
            } else {
                double recibe = Double.parseDouble(jtfQtde.getText());
                double total = Double.parseDouble(lblTotal.getText());
                
                if (total > 0.0) {
                    if (recibe > total) {
                        Sales.jtfModify.setText(String.valueOf(recibe - total));
                    } else {
                        ErrorAlert er = new ErrorAlert(new JFrame(), true);
                        ErrorAlert.titulo.setText("AVISO.");
                        ErrorAlert.msj.setText("INSIRA UMA QUANTIDADE");
                        ErrorAlert.msj1.setText("VÁLIDA");
                        er.setVisible(true);
                    }
                } else {
                    ErrorAlert er = new ErrorAlert(new JFrame(), true);
                    ErrorAlert.titulo.setText("AVISO");
                    ErrorAlert.msj.setText("IMPOSSÍVEL REALIZAR");
                    ErrorAlert.msj1.setText("ESTA OPERAÇÃO");
                    er.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jtfQtdeKeyTyped

    private void jtfModifyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModifyKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfModifyKeyTyped

    private void jbSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchProductActionPerformed
        new ProductSelection(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jbSearchProductActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        clearFields();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaleActionPerformed
        if (Sales.jtSales.getRowCount() < 1) {
            ErrorAlert er = new ErrorAlert(new JFrame(), true);
            ErrorAlert.titulo.setText("AVISO!");
            ErrorAlert.msj.setText("IMPOSSÍVEL REALIZAR");
            ErrorAlert.msj1.setText("A VENDA");
            er.setVisible(true);
//        } else {
//            ventas.Sentencias s = new Sentencias();
//            int contador = 0;
//            for (int i = 0; i < this.tablaVentas.getRowCount(); i++) {
//                s.setId_venta(Integer.parseInt(this.numVenta.getText()));
//                s.setId_producto(Integer.parseInt(this.tablaVentas.getValueAt(i, 0).toString()));
//                s.setCantidad(Integer.parseInt(this.tablaVentas.getValueAt(i, 3).toString()));
//                s.setTotal(Double.parseDouble(this.tablaVentas.getValueAt(i, 5).toString()));
//                s.setFecha(this.txtFecha.getText());
//                int opcion = ventas.Opciones.registrar(s);
//                if (opcion != 0) {
//                    contador++;
//                }
//            }
//
//            if (contador == this.tablaVentas.getRowCount()) {
//                clearFields();
//                producto.Opciones.finalizarTransaccion();
//                SuccessAlert sa = new SuccessAlert(new JFrame(), true);
//                sa.titulo.setText("¡HECHO!");
//                sa.msj.setText("VENTA REALIZADA CON");
//                sa.msj1.setText("ÉXITO");
//                sa.setVisible(true);
//            }
//        }
        }
    }//GEN-LAST:event_jbSaleActionPerformed

    private void jbRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoveActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Sales.jtSales.getModel();
        if (modelo.getRowCount() > 0) {
            
            int row = Sales.jtSales.getSelectedRow();
            if (Sales.jtSales.getSelectedRowCount() < 1) {
                ErrorAlert er = new ErrorAlert(new JFrame(), true);
                ErrorAlert.titulo.setText("AVISO!");
                ErrorAlert.msj.setText("SELECIONA UM");
                ErrorAlert.msj1.setText("REGISTRO");
                er.setVisible(true);
            } else {
                modelo.removeRow(row);
            }
        }
    }//GEN-LAST:event_jbRemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            
            new Sales().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private principal.MaterialButton jbCancel;
    private principal.MaterialButton jbExit;
    private principal.MaterialButton jbRemove;
    private principal.MaterialButton jbSale;
    private principal.MaterialButton jbSearchProduct;
    public static javax.swing.JTable jtSales;
    private app.bolivia.swing.JCTextField jtfClient;
    private app.bolivia.swing.JCTextField jtfDate;
    public static app.bolivia.swing.JCTextField jtfModify;
    public static app.bolivia.swing.JCTextField jtfQtde;
    private javax.swing.JTextField jtfVendedor;
    public static javax.swing.JLabel lblSaleNumber;
    public static javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables

    public static String dateNow() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    void clearFields() {
        DefaultTableModel modelo = (DefaultTableModel) jtSales.getModel();
        
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        
        jtfQtde.setText("0");
        jtfModify.setText("0.0");
        lblTotal.setText("0.0");
        jtfVendedor.setText(SessaoUsuarioModel.nomeUsuario);
        jtfDate.setText(dateNow());
        new VendasService().returnAmountSale();
    }
    
}