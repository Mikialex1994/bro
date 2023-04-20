package anonymousobject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class anonymous {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		
		ArrayList<JLabel> deck = new ArrayList<>();
		
		 
		 for (int i = 0; i <= 3; i++) {
			 deck.add(new JLabel(new ImageIcon("src\\image\\"+i+".png")));
			 frame.add(deck.get(i));
			 
		}
			
		
		 
		 
		
		
		
	
		
		
		/*for(int x = 0; x <= 3; x++) {
			deck.add( new JLabel(new ImageIcon("src\\image\\card-games(1).png")));
			frame.add(deck.get(x));
			
		}*/
		
		
		ImageIcon icon2 = new ImageIcon("src\\image\\deck-of-card.png");
		JLabel label2 = new JLabel(icon2);
		deck.add(label2);
		
	
		frame.add(deck.get(2));
		frame.add(deck.get(1));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}
}
