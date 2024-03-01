
package com.mycompany.bank;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Withdraw extends javax.swing.JFrame {
   private static UserAccount userAccount;
     private Color defaultBackgroundColor;
   
    public Withdraw(UserAccount account) {
        initComponents();
        userAccount=account;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblHead = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPrev = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Amount in Rupees:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 115, 207));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        lblHead.setForeground(new java.awt.Color(255, 255, 255));
        lblHead.setText("WELCOME TO CODSOFT ATM !!!");
        jPanel1.add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 79, 152));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cash Withdrawal");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        lblAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setText("Amount in Rupees:");
        jPanel2.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 144, -1));

        btnWithdraw.setBackground(new java.awt.Color(0, 79, 152));
        btnWithdraw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
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
        jPanel2.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 350, 240));

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Thank you !!!  Come Again !!!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        btnPrev.setBackground(new java.awt.Color(0, 79, 152));
        btnPrev.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        try{
            double withdrawAmount=Double.parseDouble(txtAmount.getText());
            userAccount.withdrawAmount(withdrawAmount);
            txtAmount.setText("");
           

        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please provide  Amount to Withdraw..");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Invalid Amount Try Again ");
        }

    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.dispose();
        Atm.getInstance().setVisible(true);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnWithdrawMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMouseEntered
       defaultBackgroundColor =   btnWithdraw.getBackground();  
      btnWithdraw.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnWithdrawMouseEntered

    private void btnWithdrawMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithdrawMouseExited
      btnWithdraw.setBackground(defaultBackgroundColor); 
    }//GEN-LAST:event_btnWithdrawMouseExited

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new Withdraw(userAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblHead;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
