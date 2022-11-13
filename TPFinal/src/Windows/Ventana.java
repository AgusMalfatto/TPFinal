package Windows;

public class Ventana extends javax.swing.JFrame {
    private CustomerClass custom;
    
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabStock = new javax.swing.JPanel();
        panelDataStock = new javax.swing.JPanel();
        lbIdProd = new javax.swing.JLabel();
        lbDescrProd = new javax.swing.JLabel();
        lbStockProd = new javax.swing.JLabel();
        lbIncomeProd = new javax.swing.JLabel();
        lbPriceProd = new javax.swing.JLabel();
        lbExpirProd = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        txtDescrProd = new javax.swing.JTextField();
        txtStockProd = new javax.swing.JTextField();
        txtIncomeProd = new javax.swing.JTextField();
        txtPriceProd = new javax.swing.JTextField();
        txtExpirProd = new javax.swing.JTextField();
        lbDiscountStock = new javax.swing.JLabel();
        txtDiscountStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        panelSearchStock = new javax.swing.JPanel();
        btnOnlyStock = new javax.swing.JButton();
        btnSearchStock = new javax.swing.JButton();
        txtSearchStock = new javax.swing.JTextField();
        panelButtonsStock3 = new javax.swing.JPanel();
        btnAddStock3 = new javax.swing.JButton();
        btnModifyStock3 = new javax.swing.JButton();
        btnDeleteStock3 = new javax.swing.JButton();
        btnResetStock3 = new javax.swing.JButton();
        btnExpirStock = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tabSells = new javax.swing.JPanel();
        panelWestSells = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAddSell = new javax.swing.JButton();
        btnRemoveSell = new javax.swing.JButton();
        btnResetSell = new javax.swing.JButton();
        panelNewSell = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        panelDataSell = new javax.swing.JPanel();
        lbIdProdSell = new javax.swing.JLabel();
        lbDescrProdSell = new javax.swing.JLabel();
        lbStockProdSell = new javax.swing.JLabel();
        lbAmountProdSell = new javax.swing.JLabel();
        lbPriceProdSell = new javax.swing.JLabel();
        lbExpirProdSell = new javax.swing.JLabel();
        txtIdProdSell = new javax.swing.JTextField();
        txtDescrProdSell = new javax.swing.JTextField();
        txtStockProdSell = new javax.swing.JTextField();
        txtAmountProdSell = new javax.swing.JTextField();
        txtPriceProdSell = new javax.swing.JTextField();
        txtExpirProdSell = new javax.swing.JTextField();
        lbDiscountProdSell = new javax.swing.JLabel();
        txtDiscountProdSell = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        panelSearchStock5 = new javax.swing.JPanel();
        btnOnlySell = new javax.swing.JButton();
        btnSearchSell = new javax.swing.JButton();
        txtSearchSell = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAllSells = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOneSell = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        custom = new CustomerClass();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N

        lbIdProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbIdProd.setText("ID");

        lbDescrProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbDescrProd.setText("Description");

        lbStockProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbStockProd.setText("Stock");

        lbIncomeProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbIncomeProd.setText("Income");

        lbPriceProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbPriceProd.setText("Price");

        lbExpirProd.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbExpirProd.setText("Expiration");

        txtIdProd.setEditable(false);
        txtIdProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdActionPerformed(evt);
            }
        });

        txtDescrProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtStockProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtIncomeProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPriceProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtExpirProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtExpirProd.setVerifyInputWhenFocusTarget(false);

        lbDiscountStock.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbDiscountStock.setText("Discount");

        txtDiscountStock.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDiscountStock.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelDataStockLayout = new javax.swing.GroupLayout(panelDataStock);
        panelDataStock.setLayout(panelDataStockLayout);
        panelDataStockLayout.setHorizontalGroup(
            panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdProd)
                    .addComponent(lbDescrProd)
                    .addComponent(lbStockProd)
                    .addComponent(lbIncomeProd)
                    .addComponent(lbPriceProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbExpirProd)
                    .addComponent(lbDiscountStock))
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataStockLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescrProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIncomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataStockLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceProd, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiscountStock, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDataStockLayout.setVerticalGroup(
            panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataStockLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdProd)
                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescrProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescrProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStockProd)
                    .addComponent(txtStockProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIncomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPriceProd)
                    .addComponent(txtPriceProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExpirProd)
                    .addComponent(txtExpirProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiscountStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiscountStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        lbIdProd.getAccessibleContext().setAccessibleName("txtIDProd");
        lbDescrProd.getAccessibleContext().setAccessibleName("txtDescrProd");
        lbStockProd.getAccessibleContext().setAccessibleName("txtStockProd");
        lbIncomeProd.getAccessibleContext().setAccessibleName("txtIncomeProd");
        lbPriceProd.getAccessibleContext().setAccessibleName("txtPriceProd");
        lbExpirProd.getAccessibleContext().setAccessibleName("txtExpirProd");
        txtIdProd.getAccessibleContext().setAccessibleName("txtIdProd");
        txtDescrProd.getAccessibleContext().setAccessibleName("txtDescrProd");
        txtStockProd.getAccessibleContext().setAccessibleName("txtStockProd");
        txtIncomeProd.getAccessibleContext().setAccessibleName("txtIncomeProd");
        txtPriceProd.getAccessibleContext().setAccessibleName("txtPriceProd");
        txtExpirProd.getAccessibleContext().setAccessibleName("txtExpirProd");

        jScrollPane1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N

        tableStock.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Price", "Expire", "Stock", "Discount %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableStock);
        if (tableStock.getColumnModel().getColumnCount() > 0) {
            tableStock.getColumnModel().getColumn(0).setMinWidth(90);
            tableStock.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableStock.getColumnModel().getColumn(0).setMaxWidth(120);
            tableStock.getColumnModel().getColumn(1).setMinWidth(300);
            tableStock.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableStock.getColumnModel().getColumn(1).setMaxWidth(600);
            tableStock.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableStock.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableStock.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        btnOnlyStock.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        btnOnlyStock.setText("Only Stock");

        btnSearchStock.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        btnSearchStock.setText("Search");

        txtSearchStock.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        txtSearchStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchStockLayout = new javax.swing.GroupLayout(panelSearchStock);
        panelSearchStock.setLayout(panelSearchStockLayout);
        panelSearchStockLayout.setHorizontalGroup(
            panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchStock)
                    .addGroup(panelSearchStockLayout.createSequentialGroup()
                        .addComponent(btnSearchStock, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOnlyStock, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelSearchStockLayout.setVerticalGroup(
            panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchStockLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtSearchStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchStock, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnOnlyStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddStock3.setText("ADD");

        btnModifyStock3.setText("MODIFY");

        btnDeleteStock3.setText("DELETE");

        btnResetStock3.setText("RESET");

        btnExpirStock.setText("EXPIRED");

        javax.swing.GroupLayout panelButtonsStock3Layout = new javax.swing.GroupLayout(panelButtonsStock3);
        panelButtonsStock3.setLayout(panelButtonsStock3Layout);
        panelButtonsStock3Layout.setHorizontalGroup(
            panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                        .addComponent(btnDeleteStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExpirStock, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResetStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                        .addComponent(btnAddStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModifyStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonsStock3Layout.setVerticalGroup(
            panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpirStock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabStockLayout = new javax.swing.GroupLayout(tabStock);
        tabStock.setLayout(tabStockLayout);
        tabStockLayout.setHorizontalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelDataStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSearchStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonsStock3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
        );
        tabStockLayout.setVerticalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addComponent(panelDataStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButtonsStock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSearchStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        panelDataStock.getAccessibleContext().setAccessibleName("panelDataStock");

        jTabbedPane1.addTab("    STOCK    ", tabStock);

        btnAddSell.setText("ADD");

        btnRemoveSell.setText("REMOVE");

        btnResetSell.setText("RESET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddSell, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveSell, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResetSell, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSell, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveSell, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetSell, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.setText("NEW SELL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbIdProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbIdProdSell.setText("ID");

        lbDescrProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbDescrProdSell.setText("Description");

        lbStockProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbStockProdSell.setText("Stock");

        lbAmountProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbAmountProdSell.setText("Amount");

        lbPriceProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbPriceProdSell.setText("Price");

        lbExpirProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbExpirProdSell.setText("Expiration");

        txtIdProdSell.setEditable(false);
        txtIdProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdProdSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdSellActionPerformed(evt);
            }
        });

        txtDescrProdSell.setEditable(false);
        txtDescrProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtStockProdSell.setEditable(false);
        txtStockProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAmountProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPriceProdSell.setEditable(false);
        txtPriceProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtExpirProdSell.setEditable(false);
        txtExpirProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtExpirProdSell.setVerifyInputWhenFocusTarget(false);

        lbDiscountProdSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbDiscountProdSell.setText("Discount");

        txtDiscountProdSell.setEditable(false);
        txtDiscountProdSell.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDiscountProdSell.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelDataSellLayout = new javax.swing.GroupLayout(panelDataSell);
        panelDataSell.setLayout(panelDataSellLayout);
        panelDataSellLayout.setHorizontalGroup(
            panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataSellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdProdSell)
                    .addComponent(lbDescrProdSell)
                    .addComponent(lbStockProdSell)
                    .addComponent(lbAmountProdSell)
                    .addComponent(lbPriceProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbExpirProdSell)
                    .addComponent(lbDiscountProdSell))
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataSellLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescrProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmountProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDataSellLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpirProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiscountProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelDataSellLayout.setVerticalGroup(
            panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataSellLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdProdSell)
                    .addComponent(txtIdProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescrProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescrProdSell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStockProdSell)
                    .addComponent(txtStockProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAmountProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmountProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPriceProdSell)
                    .addComponent(txtPriceProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExpirProdSell)
                    .addComponent(txtExpirProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiscountProdSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiscountProdSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNewSellLayout = new javax.swing.GroupLayout(panelNewSell);
        panelNewSell.setLayout(panelNewSellLayout);
        panelNewSellLayout.setHorizontalGroup(
            panelNewSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewSellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNewSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDataSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelNewSellLayout.setVerticalGroup(
            panelNewSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNewSellLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDataSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        btnOnlySell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        btnOnlySell.setText("Only Stock");

        btnSearchSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        btnSearchSell.setText("Search");

        txtSearchSell.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        txtSearchSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchStock5Layout = new javax.swing.GroupLayout(panelSearchStock5);
        panelSearchStock5.setLayout(panelSearchStock5Layout);
        panelSearchStock5Layout.setHorizontalGroup(
            panelSearchStock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchStock5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchStock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchSell)
                    .addGroup(panelSearchStock5Layout.createSequentialGroup()
                        .addComponent(btnSearchSell, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOnlySell, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelSearchStock5Layout.setVerticalGroup(
            panelSearchStock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchStock5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtSearchSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSearchStock5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchSell, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnOnlySell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelWestSellsLayout = new javax.swing.GroupLayout(panelWestSells);
        panelWestSells.setLayout(panelWestSellsLayout);
        panelWestSellsLayout.setHorizontalGroup(
            panelWestSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWestSellsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWestSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNewSell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelWestSellsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelWestSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSearchStock5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelWestSellsLayout.setVerticalGroup(
            panelWestSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWestSellsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNewSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSearchStock5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableAllSells.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Customer Name", "Phone Number", "Final Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAllSells);
        if (tableAllSells.getColumnModel().getColumnCount() > 0) {
            tableAllSells.getColumnModel().getColumn(0).setMinWidth(90);
            tableAllSells.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableAllSells.getColumnModel().getColumn(0).setMaxWidth(120);
            tableAllSells.getColumnModel().getColumn(1).setMinWidth(280);
            tableAllSells.getColumnModel().getColumn(1).setPreferredWidth(280);
            tableAllSells.getColumnModel().getColumn(1).setMaxWidth(500);
            tableAllSells.getColumnModel().getColumn(2).setMinWidth(100);
            tableAllSells.getColumnModel().getColumn(3).setMinWidth(80);
        }

        tableOneSell.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        tableOneSell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Price", "Expire", "Amount", "Discount %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableOneSell);
        if (tableOneSell.getColumnModel().getColumnCount() > 0) {
            tableOneSell.getColumnModel().getColumn(0).setMinWidth(90);
            tableOneSell.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableOneSell.getColumnModel().getColumn(0).setMaxWidth(120);
            tableOneSell.getColumnModel().getColumn(1).setMinWidth(300);
            tableOneSell.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableOneSell.getColumnModel().getColumn(1).setMaxWidth(600);
            tableOneSell.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableOneSell.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableOneSell.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jButton3.setText("CONFIRM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                custom.setVisible(true);
            }
        });
        jButton4.setText("CANCEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        jLabel1.setText("Final Price");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabSellsLayout = new javax.swing.GroupLayout(tabSells);
        tabSells.setLayout(tabSellsLayout);
        tabSellsLayout.setHorizontalGroup(
            tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSellsLayout.createSequentialGroup()
                .addComponent(panelWestSells, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabSellsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabSellsLayout.setVerticalGroup(
            tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSellsLayout.createSequentialGroup()
                .addGroup(tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelWestSells, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabSellsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabSellsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(tabSellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addGroup(tabSellsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))))
                .addContainerGap())
        );

        panelWestSells.getAccessibleContext().setAccessibleName("panelDataSell");

        jTabbedPane1.addTab("    VENTAS    ", tabSells);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.getAccessibleContext().setAccessibleName("tabs");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        

    private void txtIdProdActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtSearchStockActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void txtIdProdSellActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void txtSearchSellActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddSell;
    private javax.swing.JButton btnAddStock3;
    private javax.swing.JButton btnDeleteStock3;
    private javax.swing.JButton btnExpirStock;
    private javax.swing.JButton btnModifyStock3;
    private javax.swing.JButton btnOnlySell;
    private javax.swing.JButton btnOnlyStock;
    private javax.swing.JButton btnRemoveSell;
    private javax.swing.JButton btnResetSell;
    private javax.swing.JButton btnResetStock3;
    private javax.swing.JButton btnSearchSell;
    private javax.swing.JButton btnSearchStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAmountProdSell;
    private javax.swing.JLabel lbDescrProd;
    private javax.swing.JLabel lbDescrProdSell;
    private javax.swing.JLabel lbDiscountProdSell;
    private javax.swing.JLabel lbDiscountStock;
    private javax.swing.JLabel lbExpirProd;
    private javax.swing.JLabel lbExpirProdSell;
    private javax.swing.JLabel lbIdProd;
    private javax.swing.JLabel lbIdProdSell;
    private javax.swing.JLabel lbIncomeProd;
    private javax.swing.JLabel lbPriceProd;
    private javax.swing.JLabel lbPriceProdSell;
    private javax.swing.JLabel lbStockProd;
    private javax.swing.JLabel lbStockProdSell;
    private javax.swing.JPanel panelButtonsStock3;
    private javax.swing.JPanel panelDataSell;
    private javax.swing.JPanel panelDataStock;
    private javax.swing.JPanel panelNewSell;
    private javax.swing.JPanel panelSearchStock;
    private javax.swing.JPanel panelSearchStock5;
    private javax.swing.JPanel panelWestSells;
    private javax.swing.JPanel tabSells;
    private javax.swing.JPanel tabStock;
    private javax.swing.JTable tableAllSells;
    private javax.swing.JTable tableOneSell;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtAmountProdSell;
    private javax.swing.JTextField txtDescrProd;
    private javax.swing.JTextField txtDescrProdSell;
    private javax.swing.JTextField txtDiscountProdSell;
    private javax.swing.JTextField txtDiscountStock;
    private javax.swing.JTextField txtExpirProd;
    private javax.swing.JTextField txtExpirProdSell;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtIdProdSell;
    private javax.swing.JTextField txtIncomeProd;
    private javax.swing.JTextField txtPriceProd;
    private javax.swing.JTextField txtPriceProdSell;
    private javax.swing.JTextField txtSearchSell;
    private javax.swing.JTextField txtSearchStock;
    private javax.swing.JTextField txtStockProd;
    private javax.swing.JTextField txtStockProdSell;
    
    // End of variables declaration                   
}
