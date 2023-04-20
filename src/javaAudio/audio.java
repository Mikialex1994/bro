package javaAudio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class audio {

	/*public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
	File file = new File("Ice & Fire - King Canyon.wav");
	
	AudioInputStream audio = AudioSystem.getAudioInputStream(file);
	
	Clip clip = AudioSystem.getClip();
	
	clip.open(audio);
	
	String response = "";		
	
	while(!response.equals("Q")) {
		System.out.println("P = play, S = Stop, R= Reset,Q = Quit");
		System.out.println("Enter your choice: ");
		
		 response = scanner.next();
		
		response = response.toUpperCase();
		
		switch(response) {
		
		case "P":
			clip.start();
			break;
			
		case "S":
			clip.stop();
			break;
		
		case "R":
			clip.setMicrosecondPosition(0);
			break;
			
		case "Q":
			clip.close();
			break;
			
		default:
			System.out.println("Not a valid response");
			
		
		}
		
	}
	System.out.println("BYYYYYYYEEEEEEEEs");
	
	
	}*/

	
	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		File file = new File("Ice & Fire - King Canyon.wav");
		
		AudioInputStream audio = AudioSystem.getAudioInputStream(file);
		
		Clip clip = AudioSystem.getClip();
		
		clip.open(audio);
		
		Scanner scanner = new Scanner(System.in);
		
		String response = "";
		
		
		while(!response.equals("Q")) {
			
			System.out.println("P: play, Q: quit, R: reset");
			System.out.println("Enter your choice");
			
			response = scanner.next();	
			
			response = response.toUpperCase();
			
			
		 switch(response) {
		 
		 case "P": 
			 clip.start();
		break;
		
		 case "Q":
			 clip.close();
		break;
		
		 case "R":
			 clip.setMicrosecondPosition(0);
		break;	 
		 
		default :
			System.out.println("Invalid number");
		 
		 }
			
			
		}
		System.out.println("See you soon");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
