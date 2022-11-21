package Windows;

public class CustomerClass extends javax.swing.JFrame {

    public CustomerClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabStock = new javax.swing.JPanel();
        panelDataStock = new javax.swing.JPanel();
        lbIdCustomer = new javax.swing.JLabel();
        lbNameCustomer = new javax.swing.JLabel();
        lbPhoneCustomer = new javax.swing.JLabel();
        lbAddressCustomer = new javax.swing.JLabel();
        txtIdCustomer = new javax.swing.JTextField();
        txtNameCustomer = new javax.swing.JTextField();
        txtPhoneCustomer = new javax.swing.JTextField();
        txtAddressCustomer = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        panelSearchStock = new javax.swing.JPanel();
        btnSearchCustomer = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        panelButtonsStock3 = new javax.swing.JPanel();
        btnConfirmCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnResetCustomer = new javax.swing.JButton();

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N

        lbIdCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbIdCustomer.setText("Id");

        lbNameCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbNameCustomer.setText("Name");

        lbPhoneCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbPhoneCustomer.setText("Phone Num.");

        lbAddressCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        lbAddressCustomer.setText("Address");

        txtIdCustomer.setEditable(false);
        txtIdCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCustomerActionPerformed(evt);
            }
        });

        txtNameCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPhoneCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAddressCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelDataStockLayout = new javax.swing.GroupLayout(panelDataStock);
        panelDataStock.setLayout(panelDataStockLayout);
        panelDataStockLayout.setHorizontalGroup(
            panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdCustomer)
                    .addComponent(lbNameCustomer)
                    .addComponent(lbPhoneCustomer)
                    .addComponent(lbAddressCustomer))
                .addGap(10, 10, 10)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelDataStockLayout.setVerticalGroup(
            panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataStockLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCustomer)
                    .addComponent(txtIdCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNameCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoneCustomer)
                    .addComponent(txtPhoneCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddressCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N

        tableCustomer.setFont(new java.awt.Font("Sitka Small", 2, 12)); // NOI18N
        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone Number", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        btnSearchCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        btnSearchCustomer.setText("Search");

        txtSearchCustomer.setFont(new java.awt.Font("Sitka Small", 2, 14)); // NOI18N
        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSearchStockLayout = new javax.swing.GroupLayout(panelSearchStock);
        panelSearchStock.setLayout(panelSearchStockLayout);
        panelSearchStockLayout.setHorizontalGroup(
            panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(btnSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelSearchStockLayout.setVerticalGroup(
            panelSearchStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchStockLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConfirmCustomer.setText("CONFIRM");
        btnConfirmCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setText("DELETE");

        btnResetCustomer.setText("RESET");

        javax.swing.GroupLayout panelButtonsStock3Layout = new javax.swing.GroupLayout(panelButtonsStock3);
        panelButtonsStock3.setLayout(panelButtonsStock3Layout);
        panelButtonsStock3Layout.setHorizontalGroup(
            panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResetCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(btnConfirmCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelButtonsStock3Layout.setVerticalGroup(
            panelButtonsStock3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsStock3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabStockLayout = new javax.swing.GroupLayout(tabStock);
        tabStock.setLayout(tabStockLayout);
        tabStockLayout.setHorizontalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDataStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSearchStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelButtonsStock3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabStockLayout.setVerticalGroup(
            tabStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabStockLayout.createSequentialGroup()
                .addComponent(panelDataStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelButtonsStock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSearchStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("    CUSTOMER    ", tabStock);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void btnConfirmCustomerActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void txtIdCustomerActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnConfirmCustomer;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnResetCustomer;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAddressCustomer;
    private javax.swing.JLabel lbIdCustomer;
    private javax.swing.JLabel lbNameCustomer;
    private javax.swing.JLabel lbPhoneCustomer;
    private javax.swing.JPanel panelButtonsStock3;
    private javax.swing.JPanel panelDataStock;
    private javax.swing.JPanel panelSearchStock;
    private javax.swing.JPanel tabStock;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAddressCustomer;
    private javax.swing.JTextField txtIdCustomer;
    private javax.swing.JTextField txtNameCustomer;
    private javax.swing.JTextField txtPhoneCustomer;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration                   
}

