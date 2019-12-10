package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String month=JOptionPane.showInputDialog("What day were you born in?");
	String day=JOptionPane.showInputDialog("What month were you born in?");
	if(month.equals("11")&& day.equals("19")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}else {
	JOptionPane.showMessageDialog(null, "Merry Unbirthday!" );
	}

}
}
