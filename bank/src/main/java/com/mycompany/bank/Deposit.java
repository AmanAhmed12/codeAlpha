
package com.mycompany.bank;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Deposit extends javax.swing.JFrame {
    private static UserAccount userAccount;
      private Color defaultBackgroundColor;
   
    public Deposit(UserAccount account) {
        initComponents();
         userAccount=account;
       
       
    }
    
   
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();
        panTwo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDeposits = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 115, 207));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO CODSOFT ATM !!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Thank you !!!  Come Again !!!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 500, -1));

        btnPrev.setBackground(new java.awt.Color(0, 79, 152));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 13, -1, -1));

        panTwo.setBackground(new java.awt.Color(0, 79, 152));
        panTwo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        panTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount in Rupees:");
        panTwo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtDeposits.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panTwo.add(txtDeposits, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 144, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cash Deposit");
        panTwo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 109, -1));

        btnDeposit.setBackground(new java.awt.Color(0, 79, 152));
        btnDeposit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Deposit");
        btnDeposit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
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
        panTwo.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        panTwo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 120, 90));

        jPanel1.add(panTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 369, 241));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
     try{
          double depositAmount=Double.parseDouble(txtDeposits.getText());
       
        userAccount.depositAmount(depositAmount);
        txtDeposits.setText("");
      
      
     }
     catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Please provide the account No and Amount to Deposit..");
     }
     catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Invalid Amount Try Again ");
        }
       
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
      this.dispose();
      Atm.getInstance().setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnDepositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseEntered
       defaultBackgroundColor =   btnDeposit.getBackground();  
      btnDeposit.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnDepositMouseEntered

    private void btnDepositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseExited
       btnDeposit.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnDepositMouseExited

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new Deposit(userAccount).setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panTwo;
    private javax.swing.JTextField txtDeposits;
    // End of variables declaration//GEN-END:variables
}
