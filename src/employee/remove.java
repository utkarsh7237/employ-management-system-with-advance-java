/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author utkarsh mishra
 */
public class remove implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JButton b1,b2,b3,b4;
    String a,b,c;
    remove(){
    f=new JFrame("Add new employee");
        f.setBackground(Color.WHITE);
       
        f.setLayout(null);
      
    
        l1=new JLabel("Employee id");
         l1.setForeground(Color.RED);
        l1.setFont(new Font("serif",Font.PLAIN,30));
        l1.setBounds(30,150,300,40);
        t1=new JTextField();
        t1.setBounds(250,150,150,30);
        f.add(t1);
        f.add(l1);
        f.setVisible(true);
        f.setSize(500,500);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/last.jpg"));
     Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     l2=new JLabel(i3);
     l2.setBounds(0,10,450,450);
     f.add(l2);
       
        
           
            
     b1=new JButton("Remove");
        b1.setBackground(Color.BLACK);
        b1.setBounds(30,250,120,30);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        f.add(b1);
      b2=new JButton("back");
        b2.setBackground(Color.BLACK);
        b2.setBounds(250,250,120,30);
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        f.add(b2);
    } 
        public void actionPerformed(ActionEvent ae){
           try{
               if(ae.getSource()==b1)
            { 
           conn con=new conn();
            String s=t1.getText();
            String q="delete from employee where empid='"+s+"' ";
            con.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Emp deleted successful");
                    f.setVisible(false);
                    new details();
                    
            
           
         
          
            
                
            }}
           catch(Exception e)
                   {}
           
            
            if(ae.getSource()==b2)
            {
                new details();
            }
            
        }
    
    public static void main(String arg[])
     {
     remove a=new remove();
     }
    
    
}
