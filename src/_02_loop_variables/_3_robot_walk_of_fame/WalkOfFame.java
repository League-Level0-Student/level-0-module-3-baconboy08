
package _02_loop_variables._3_robot_walk_of_fame;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
	
			
			rob.penDown();
			rob.setX(0);
			rob.setY(250);
			rob.setSpeed(25);
			rob.setAngle(90);
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
			
			for (int t = 0; t < 10; t++) {
			
				for (int n = 0; n < 5; n++) {
				
					rob.move(50);
					rob.turn(144);
				}
			
				 rob.setAngle(90);
				rob.move(70);
			
			}
			
			
		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
