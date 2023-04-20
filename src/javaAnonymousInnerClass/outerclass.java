package javaAnonymousInnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class outerclass extends JFrame{
	
	
	JButton button1;
	JButton button2;
	JButton button3;
	
	
	outerclass(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		
		button1 = new JButton("button#1");
		button2 = new JButton("button#2");
		button3 = new JButton("button#3");
		
		button1.setBounds(100, 100, 100, 100);
		button2.setBounds(200, 100, 100, 100);
		button3.setBounds(300, 100, 100, 100);
		
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				System.out.println("You clicked button#1");
			}
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("You clicked button#2");
			}
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("You clicked button#3");
			}
		});
		
		
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setVisible(true);
		
		
		
		
		
		
	}
	
	
	
}
