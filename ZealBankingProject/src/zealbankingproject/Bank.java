/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zealbankingproject;
import java.util.*;
/**
 *
 * @author acer
 */
public class Bank {
    private String name;
    private int account;
    private double balance;
    private String address;
    private String password;
    private static int a=1001;
    public static ArrayList<Bank> obj=new ArrayList<Bank>();

    public Bank()
    {
        
    }
    public Bank(String n,double b,String ad,String p)
    {
        name=n;
        balance=b;
        address=ad;
        password=p;
        account=a++;
        javax.swing.JOptionPane.showMessageDialog(null, "Your account Number is ="+account+"\n");
    }
    public void deposit(double d)
    {
        balance=balance+d;
        javax.swing.JOptionPane.showMessageDialog(null,"Your New Balance="+balance);
    }
    public void withdraw(double d)
    {
        if(balance>d)
        {
            balance=balance-d;
            javax.swing.JOptionPane.showMessageDialog(null,"Your New Balance="+balance);
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Insuffient Balance");
    }
    public int getAccount()
    {
        return account;
    }
    public String getPassword()
    {
        return password;
    }
    public double getBalance()
    {
        return balance;
    }
}
