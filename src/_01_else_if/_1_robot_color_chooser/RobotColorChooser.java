
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		
		Random ran = new Random();
		
		rob.penDown();
		rob.setSpeed(40);
		
	while (true) {
		
		String input = JOptionPane.showInputDialog("what color should the robot draw with?");
		
		if (input.equals("red")) {
			rob.setPenColor(255,0,0);
		} else if (input.equals("blue")) {
			rob.setPenColor(0,0,255);
		} else if (input.equals("green")) {
			rob.setPenColor(0,255,0);
		} else if (input.equals("yellow")) {
			rob.setPenColor(255,255,0);
		} else if (input.equals("purple")) {
			rob.setPenColor(128,0,128);
		} else {
			
			JOptionPane.showMessageDialog(null,"color not supported, choosing random color");
			int r = ran.nextInt(255) + 1;
			int g = ran.nextInt(255) + 1;
			int b = ran.nextInt(255) + 1;
			
			rob.setPenColor(r,g,b);
		}
		
		for (int i = 0; i < 4; i++) {
		  
			rob.move(50);
		    rob.turn(90);
		
		}
		
	}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
