package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String Jennifer= "Jennifer is hella dumb";
	String Harry= "Harry is hella smart";
	String Carlos="Carlos have a big brain";
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name=JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(name.equalsIgnoreCase("Jennifer")) {
		JOptionPane.showMessageDialog(null, "You are hella dumb" );
		
	}
	if(name.equalsIgnoreCase("Carlos")) {
		JOptionPane.showMessageDialog(null, "You have a big brain");
	}
		if(name.equalsIgnoreCase("Harry")) {
			JOptionPane.showMessageDialog(null, "You are hella smart");
		}
	
		
	}
}
