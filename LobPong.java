/*
Name: Beakal Lemeneh
Net ID: 31390484
Project Number: 04
Lab Section: Mon/Wed 4:50 pm-6:05 pm
I collaborated with Ermiyas Liyeh on this assignment.

*/

//I imported JFrame from java library
import javax.swing.JFrame;

public class LobPong {
	public static void main(String [] args) {
		
		//here, I created an object of type JFrame called frame
		JFrame frame = new JFrame("Lob Pong");
		
		//I set a size, title and resizablity properties
		frame.setSize(600, 800);
		frame.setResizable(true);
		
		//here, I created an instance of Playgame class called playGame
		Playgame playGame = new Playgame();
		
		//I finally added playGame to my frame
		frame.add(playGame);
		
		//I set a visibility and default closing operations
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}


