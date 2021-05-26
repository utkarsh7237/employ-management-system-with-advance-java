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
public class add implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2;
    add()
    {
        
    f=new JFrame("Add new employee");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
      
    
        l1=new JLabel("Name");
        l1.setBounds(30,30,50,20);
        t1=new JTextField();
        t1.setBounds(100,30,80,20);
        f.add(t1);
        f.add(l1);
        l2=new JLabel("Age");
        l2.setBounds(30,60,50,20);
        t2=new JTextField();
        t2.setBounds(100,60,80,20);
        f.add(t2);
        f.add(l2);
        
        l3=new JLabel("Address");
        l3.setBounds(30,90,50,20);
        t3=new JTextField();
        t3.setBounds(100,90,80,20);
        f.add(t3);
        f.add(l3); 
        
        l4=new JLabel("Email Id");
        l4.setBounds(30,120,50,20);
        t4=new JTextField();
        t4.setBounds(100,120,80,20);
        f.add(t4);
        f.add(l4);
        
        l5=new JLabel("Designation");
        l5.setBounds(30,150,50,20);
        t5=new JTextField();
        t5.setBounds(100,150,80,20);
        f.add(t5);
        f.add(l5); 
        
        l6=new JLabel("Employee id");
        l6.setBounds(30,180,50,20);
        t6=new JTextField();
        t6.setBounds(100,180,80,20);
        f.add(t6);
        f.add(l6); 
        
        l7=new JLabel("job location");
        l7.setBounds(30,210,50,20);
        t7=new JTextField();
        t7.setBounds(100,210,80,20);
        f.add(t7);
        f.add(l7);
        l8=new JLabel("Adhar No");
        l8.setBounds(30,240,50,20);
        t8=new JTextField();
        t8.setBounds(100,240,80,20);
        f.add(t8);
        f.add(l8); 
        
         l9=new JLabel("Phone No");
        l9.setBounds(30,280,50,20);
        t9=new JTextField();
        t9.setBounds(100,280,80,20);
        f.add(t9);
        f.add(l9);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("employee/icons/do.jpg"));
     Image i2=i1.getImage().getScaledInstance(500,400, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
     l=new JLabel(i3);
     l.setBounds(0,10,350,350);
     l.setLayout(null);
    // l9.setIcon(i1);
     f.add(l9);
     
      b1=new JButton("Add details");
        b1.setBackground(Color.BLACK);
        b1.setBounds(100,400,120,30);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        f.add(b1);
        
         b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setBounds(250,400,120,30);
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        f.add(b2);
        
        f.setSize(500,500);
        f.setVisible(true);
    }
        public void actionPerformed(ActionEvent ae)
        {
           
               String a=t1.getText();
               String b=t2.getText();
               String c=t3.getText();
               String d=t4.getText();
               String e=t5.getText();
               String n=t6.getText();
               String g=t7.getText();
               String h=t8.getText();
               String k=t9.getText();
              
            try{    
             if(ae.getSource()==b1)
            {
                conn cc=new conn();
                String q="insert into employee values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+n+"','"+g+"','"+h+"','"+k+"')";
               cc.s.executeUpdate(q);
               JOptionPane.showMessageDialog(null,"Information successfully added"); 
               f.setVisible(false);
               new details();
              
            
            } }
            catch(Exception l)
            {
                l.printStackTrace();
            }
            
        }
    
     public static void main(String arg[])
     {
     add a=new add();
     }
    
}
