
package com.mycompany.bank;

import java.awt.Color;


public class Atm extends javax.swing.JFrame {
private UserAccount userAccount;
private Color defaultBackgroundColor;
private static Atm instance;
    public Atm() {
        initComponents();
        userAccount=new UserAccount(500);
        instance=this;
    }
    
   public static Atm getInstance(){
       
       return instance;
   }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnBal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 115, 207));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWithdraw.setBackground(new java.awt.Color(0, 79, 152));
        btnWithdraw.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdrawal");
        btnWithdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWithdrawMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWithdrawMouseExited(evt);
            }
        });
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel1.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 230, 40));

        btnDeposit.setBackground(new java.awt.Color(0, 79, 152));
        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Cash Deposit");
        btnDeposit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositMouseExited(evt);
            }
        });
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 40));

        btnBal.setBackground(new java.awt.Color(0, 79, 152));
        btnBal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBal.setForeground(new java.awt.Color(255, 255, 255));
        btnBal.setText("Balance Inquiry");
        btnBal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnBal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBalMouseExited(evt);
            }
        });
        btnBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODSOFT ATM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/card.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        this.dispose();
        Deposit d1=new Deposit(userAccount);
        d1.setVisible(true);
          btnWithdraw.setBackground(defaultBackgroundColor); 
          btnDeposit.setBackground(defaultBackgroundColor); 
           btnBal.setBackground(defaultBackgroundColor); 
        
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalActionPerformed
     userAccount.BalanceInquiry();
       btnWithdraw.setBackground(defaultBackgroundColor); 
          btnDeposit.setBackground(defaultBackgroundColor); 
           btnBal.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnBalActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
      this.dispose();
        Withdraw w1=new Withdraw(userAccount);
        w1.setVisible(true);
          btnWithdraw.setBackground(defaultBackgroundColor); 
          btnDeposit.setBackground(defaultBackgroundColor); 
           btnBal.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDepositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseEntered
        defaultBackgroundColor =   btnDeposit.getBackground();  
      btnDeposit.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnDepositMouseEntered

    private void btnDepositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseExited
       btnDeposit.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnDepositMouseExited

    private void btnWithdrawMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMouseEntered
        defaultBackgroundColor =   btnWithdraw.getBackground();  
      btnWithdraw.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnWithdrawMouseEntered

    private void btnWithdrawMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMouseExited
         btnWithdraw.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnWithdrawMouseExited

    private void btnBalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalMouseEntered
      defaultBackgroundColor =   btnBal.getBackground();  
      btnBal.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnBalMouseEntered

    private void btnBalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalMouseExited
         btnBal.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnBalMouseExited

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBal;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
