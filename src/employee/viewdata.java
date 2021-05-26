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
public class viewdata implements ActionListener {
    JFrame fr;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b3;
    
    String a,b,c,d,e,f,g,h,i;
    viewdata(String id)
    {
        
        try{
            conn con=new conn();
    String k="Select * from employee where empid='"+id+"'"; 
    ResultSet rs=con.s.executeQuery(k);
    while(rs.next())
    {a=rs.getString(1);
    b=rs.getString(2);
    c=rs.getString(3);
    d=rs.getString(4);
      e=rs.getString(5);
      f=rs.getString(6);
      g=rs.getString(7);
      h=rs.getString(8);
      i=rs.getString(9);
      
    }
    
        }
        
        catch(Exception e)
        {
        
        }
        
       fr=new JFrame("Data");
        fr.setBackground(Color.WHITE);
        fr.setLayout(null);
        l1=new JLabel("Name");
        l1.setBounds(30,30,50,20);
        t1=new JLabel(a);
        t1.setBounds(100,30,80,20);
        fr.add(t1);
        fr.add(l1);
        l2=new JLabel("Age");
        l2.setBounds(30,60,50,20);
        t2=new JLabel(b);
        t2.setForeground(Color.red);
        t2.setBounds(100,60,80,20);
        fr.add(t2);
        fr.add(l2);
        
        l3=new JLabel("Address");
        l3.setBounds(30,90,50,20);
        t3=new JLabel(c);
        t3.setBounds(100,90,80,20);
        fr.add(t3);
        fr.add(l3); 
        
        l4=new JLabel("Email Id");
        l4.setBounds(30,120,50,20);
        t4=new JLabel(d);
        t4.setBounds(100,120,80,20);
        fr.add(t4);
        fr.add(l4);
        
        l5=new JLabel("Designation");
        l5.setBounds(30,150,50,20);
        t5=new JLabel(e);
        t5.setBounds(100,150,80,20);
        fr.add(t5);
        fr.add(l5); 
        
        l6=new JLabel("Employee id");
        l6.setBounds(30,180,50,20);
        t6=new JLabel(f);
        t6.setBounds(100,180,80,20);
        fr.add(t6);
        fr.add(l6); 
        
        l7=new JLabel("job location");
        l7.setBounds(30,210,50,20);
        t7=new JLabel(g);
        t7.setBounds(100,210,80,20);
        fr.add(t7);
        fr.add(l7);
        l8=new JLabel("Adhar No");
        l8.setBounds(30,240,50,20);
        t8=new JLabel(h);
        t8.setBounds(100,240,80,20);
        fr.add(t8);
        fr.add(l8); 
        
        l9=new JLabel("Phone No");
        l9.setBounds(30,280,50,20);
        t9=new JLabel(i);
        t9.setBounds(100,280,80,20);
        fr.add(t9);
        fr.add(l9);
        fr.setSize(500,500);
        fr.setVisible(true);
     b3=new JButton("Back");
        b3.setBackground(Color.BLACK);
        b3.setBounds(370,300,100,30);
        b3.addActionListener(this);
        b3.setForeground(Color.WHITE);
        fr.add(b3);}
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b3)
            {fr.setVisible(false);
            new details();
            
                
            }
        }
        
        
    }
    
