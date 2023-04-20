package lambdaexpression;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*@FunctionalInterface
 public interface Lambda {

	public void run(String name , int num);
}*/

public class myFrame extends JFrame {
	
	
	JButton button = new JButton("Button#1");
	JButton button1 = new JButton("Button#2");
	JButton button2 = new JButton("Button#3");
	
	
	
	
	myFrame(){
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        
        button.setBounds(100, 100, 100, 100);
        button.setFocusable(false);
    
        button1.setBounds(200, 100, 100, 100);
        button1.setFocusable(false);
        
        button1.addActionListener( (e) ->  {
        	
        	System.out.println("You clicked button#2");
        	
        });
        
        
        
        button.addActionListener( (e)  -> {			
				System.out.println("You clicked a button");
        
        });
        
        
        button2.setBounds(300, 100, 100, 100);
        button2.setFocusable(false);
				
        
        button2.addActionListener((e) -> {
        	
        	System.out.println("You clicked button#3");
        	
        });
        
        
        
        
        this.add(button2);
        this.add(button1);
        this.add(button);
        this.setVisible(true);
		
	}
	
	
	
}