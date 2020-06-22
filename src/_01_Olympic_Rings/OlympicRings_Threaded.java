package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {

		Robot timmy = new Robot(700, 500);
		Robot tammy = new Robot(800, 500);
		Robot sammy = new Robot(900, 500);
		Robot simmy = new Robot(750, 550);
		Robot bimmy = new Robot(850, 550);
			

		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		simmy.setSpeed(10);
		bimmy.setSpeed(10);
		
		
		/*for(int i = 0; i < 360; i++) {
			timmy.move(1);
			timmy.setAngle(i);
		}*/
		
		Thread t1 = new Thread(()->{  {
			for(int i = 0; i < 360; i++) {
				timmy.penDown();
				timmy.setPenColor(Color.BLUE);
				timmy.move(1);
				timmy.setAngle(i);
			}	} });
		
		Thread t2 = new Thread(()->{  {
			for(int i = 0; i < 360; i++) {
				tammy.penDown();
				tammy.setPenColor(Color.BLACK);
				tammy.move(1);
				tammy.setAngle(i);
			}	} });
		
		Thread t3 = new Thread(()->{  {
			for(int i = 0; i < 360; i++) {
				sammy.penDown();
				sammy.setPenColor(Color.RED);
				sammy.move(1);
				sammy.setAngle(i);
			}	} });
		
		Thread t4 = new Thread(()->{  {
			for(int i = 0; i < 360; i++) {
				simmy.penDown();
				simmy.setPenColor(Color.YELLOW);
				simmy.move(1);
				simmy.setAngle(i);
			}	} });
		
		Thread t5 = new Thread(()->{  {
			for(int i = 0; i < 360; i++) {
				bimmy.penDown();
				bimmy.setPenColor(Color.GREEN);
				bimmy.move(1);
				bimmy.setAngle(i);
			}	} });
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	//	r1.start();
	//	r2.start();
	//	r3.start();
	}
}
