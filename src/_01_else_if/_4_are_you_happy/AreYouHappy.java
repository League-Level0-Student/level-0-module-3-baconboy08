package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

public static void main(String[] args) {
	
	String ques1 = JOptionPane.showInputDialog("are you happy?");
	
	if (ques1.equals("yes")){
		
		JOptionPane.showMessageDialog(null, "keep doing whatever you're doing!");
	
		
	} else {
		
		
		String ques2 = JOptionPane.showInputDialog("do you WANT to be happy?");
		
	if (ques2.equals("yes")) {
		
		JOptionPane.showMessageDialog(null, "Then change something.");
		
		
	} else {
		
		JOptionPane.showMessageDialog(null,"then keep doing whatever you're doing.");
		
		
	}
		
	}
	
	
}


}
