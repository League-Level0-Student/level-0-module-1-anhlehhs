package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
				"Who buys it, has no use for it.\r\n" + 
				"Who uses it can neither see nor feel it.\r\n" + 
				"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equalsIgnoreCase("coffin")) {
			JOptionPane.showMessageDialog(null, "You got it right! Congrat");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "WRONG \n The correct answer was coffin");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2=JOptionPane.showInputDialog("What is greater than God,\r\n" + 
		"more evil than the devil,\r\n" + 
		"the poor have it,\r\n" + 
		"the rich need it,\r\n" + 
		"and if you eat it, you'll die?");
		// 2. Make a pop up to show the score.
		if(answer2.equalsIgnoreCase("nothing")) {
			JOptionPane.showMessageDialog(null, "Congrat you also got this one right!");
			score++;
		}else {
			JOptionPane.showMessageDialog(null, "The answer was Nothing, you dummy");
		
	
		}
		String answer3=JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		if(answer3.equalsIgnoreCase("Man")) {
		JOptionPane.showMessageDialog(null, "Wow impressive!");
		score++;
		}else {
			JOptionPane.showMessageDialog(null, "this one was a hard one I don't blame you for get it wrong but the answer was man");
		}
	JOptionPane.showMessageDialog(null, "You got " + score +" out of 3" );
	}
}

