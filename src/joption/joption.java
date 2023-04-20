package joption;

import javax.swing.JOptionPane;

public class joption {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null,"Whats your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats you age")); 
		
	JOptionPane.showMessageDialog(null,"you are  " + num);
	}
	
}
