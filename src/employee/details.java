/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
import java.sql.*;
/**
 *
 * @author utkarsh mishra
 */
public class details implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    details()
    {
    f=new JFrame("Details");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
            l1=new JLabel("Employee Details");
        l1.setBounds(500,20,200,100);
        l1.setForeground(Color.GREEN);
        l1.setBackground(Color.WHITE);
        l1.setFont(new Font("serif",Font.PLAIN,20));
        f.add(l1);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/details.jpg"));
        Image i2=i1.getImage().getScaledInstance(700, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        l2=new JLabel(i3);
        l2.setBounds(0, 15, 750, 300);
        f.add(l2);
        
        
        f.setSize(800,400);
        b1=new JButton("Add");
        b1.setBackground(Color.BLACK);
        b1.setBounds(400,100,100,30);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        f.add(b1);
        
        b2=new JButton("View");
        b2.setBackground(Color.BLACK);
        b2.setBounds(600,100,100,30);
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        f.add(b2);
        
        b3=new JButton("Remove");
        b3.setBackground(Color.BLACK);
        b3.setBounds(400,150,100,30);
        b3.addActionListener(this);
        b3.setForeground(Color.WHITE);
        f.add(b3);
        
        b4=new JButton("Update");
        b4.setBackground(Color.BLACK);
        b4.setBounds(600,150,100,30);
        b4.addActionListener(this);
        b4.setForeground(Color.WHITE);
        f.add(b4);
f.setVisible(true);
    }
        
       public void actionPerformed(ActionEvent ae)
       {
           if(ae.getSource()==b1)
           {
               new add();
               f.setVisible(false);
           }
           if(ae.getSource()==b2)
           {
               new view();
               f.setVisible(false);
           }
           if(ae.getSource()==b3)
           {
               new remove();
               f.setVisible(false);
           }
           
       }
        
   public static void main(String arg[])
     {
         details a=new details();
     }   
   
        
    

    
}
