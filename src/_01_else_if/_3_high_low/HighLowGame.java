
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random ran = new Random();
				
				int random = ran.nextInt(100) + 1;
		
		// 2. Print out the random variable above
		
		System.out.println(random);
		
		// 11. Repeat steps 1 to 10 ten times
	while (true) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
     String guess = JOptionPane.showInputDialog("what do you guess the number is?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
     int guessInt = Integer.parseInt(guess);
     
     if (guessInt == random) {
    	 
    	 System.exit(0);
    	
    	 
     } else if (guessInt > random) {
    	 
    	 JOptionPane.showMessageDialog(null, "guess lower!");
    	 
     } else {
    	 
    	 JOptionPane.showMessageDialog(null, "guess higher!!");
    	 
     }
	}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


