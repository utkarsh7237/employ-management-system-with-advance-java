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

/**
 *
 * @author utkarsh mishra
 */
public class update implements ActionListener{
    
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2;
    update(){
    f=new JFrame("Add new employee");
        f.setBackground(Color.WHITE);
       
        f.setLayout(null);
      
    
        l1=new JLabel("Employee id");
         l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("serif",Font.PLAIN,30));
        l1.setBounds(30,100,300,40);
        t1=new JTextField();
        t1.setBounds(250,100,150,30);
        f.add(t1);
        f.add(l1);
        f.setVisible(true);
        f.setSize(500,500);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/view.jpg"));
     Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     l2=new JLabel(i3);
     l2.setBounds(0,10,450,450);
     f.add(l2);
     b1=new JButton("Update");
        b1.setBackground(Color.BLACK);
        b1.setBounds(30,250,120,30);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        f.add(b1);
      b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setBounds(250,250,120,30);
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        f.add(b2);
    } 
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b1)
            { 
            f.setVisible(false);
            String s=t1.getText();
            new viewdata(s);
            
                
            }
            
            
            
        }
    
    public static void main(String arg[])
     {
     update a=new update();
     }
    
}

