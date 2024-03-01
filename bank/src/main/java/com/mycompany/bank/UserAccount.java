
package com.mycompany.bank;

import javax.swing.JOptionPane;


public class UserAccount {
    private static double balance=0;
    
    public UserAccount(double balance){
        this.balance=balance;
    }
    
    public void withdrawAmount(double amount) {
        try {

            if (balance <= 500) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance!!! Minimum balance of 500 must be maintained.");
            } else if (amount > (balance - 500)) {
                JOptionPane.showMessageDialog(null, "Insufficient Balance!!! Withdrawal exceeds available balance (excluding minimum balance).");
            } else {
                double newBal = balance - amount;
                balance = newBal;
                JOptionPane.showMessageDialog(null, "You have successfully withdrawn Rs:" + amount + "\n" + "THANK YOU !!! Come Again...");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter an amount to withdraw!!!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Check the Amount and try Again ");
        }
    }

    
    public void depositAmount(double amount){
        try{
        double newBal=balance+amount;
        balance=newBal;
       JOptionPane.showMessageDialog(null, "You have succesfully Deposited Rs:"+amount);
        }
        catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "please Enter an amount to Deposit!!!");
        }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Check the Amount and try Again ");
        }
    }
    
    public void BalanceInquiry(){
        JOptionPane.showMessageDialog(null, "Your Current Balance is Rs:"+balance);
    }
}
