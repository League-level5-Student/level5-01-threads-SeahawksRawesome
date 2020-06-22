package _02_Advanced_Robot_Race;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
//Threads to make them go at the same time
		//1. make a main method

		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.

		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	
	public static void main(String [] args) {
		Robot[] arr = new Robot[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Robot(i * 150 + 100, 900);
		}
		
		while(arr[0].getY() > 200 || arr[1].getY() > 200 || arr[2].getY() > 200 || arr[3].getY() > 200 || arr[4].getY() > 200) {
			
			Thread t1 = new Thread(()->{  { Random rand = new Random();	arr[0].move(rand.nextInt(50));	} });
			Thread t2 = new Thread(()->{  { Random rand = new Random();	arr[1].move(rand.nextInt(50));	} });
			Thread t3 = new Thread(()->{  { Random rand = new Random();	arr[2].move(rand.nextInt(50));	} });
			Thread t4 = new Thread(()->{  { Random rand = new Random();	arr[3].move(rand.nextInt(50));	} });
			Thread t5 = new Thread(()->{  { Random rand = new Random();	arr[4].move(rand.nextInt(50));	} });
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		}
		
		System.out.println("Congrats a robot won!");
	}

}


