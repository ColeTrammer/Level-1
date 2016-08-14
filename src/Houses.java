import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class Houses {

	/*
	1. have the tortoise start in the bottom left corner

	2. draw a house of height 100 with grass after it. This shape: |**|_

	3. extract the piece of code that draws the house into a method. Draw 10 houses.

	4. Change the method to take int height as a parameter. Draw 9 houses of different heights

	5. Make the method take a String instead of a height. 	
		
	“small” 		60
	“medium”	 	120
	“large”			250

	6. Make the method take a color as well as a height. The houses are drawn in that color.

	[optional] Set the scene to night time by setting the background to black using Tortoise.getBackgroundWindow().setColor

	7. Give the houses peaked roofs

	8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

	9. make large houses have flat rooves
	*/
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Tortoise.setX(20);
		Tortoise.setY(425);
		
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(5);
			
		for (int i = 0; i < 100; i++) {
			drawHouse(r.nextDouble() * 200, r.nextDouble() * 50, r.nextDouble() * 30, new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)), r.nextBoolean());
		}
	}
	
	private static void drawHouse(double height, double width, double grassWidth, Color color, boolean drawPointedHouse) {
		
		Tortoise.setPenColor(color);
		
		Tortoise.setAngle(0);
		Tortoise.move(height);

		drawRoof(width, drawPointedHouse);
		
		Tortoise.move(height);
		
		Tortoise.setPenColor(new Color(40, 105, 35));
		Tortoise.turn(270);
		Tortoise.move(width);
	}

	private static void drawRoof(double width, boolean drawPointedHouse) {
		if (drawPointedHouse) {
			Tortoise.turn(45);
			Tortoise.move(width);
			Tortoise.turn(90);
			Tortoise.move(width);
			Tortoise.turn(45);
		} else {
			Tortoise.turn(90);
			Tortoise.move(Math.sqrt(Math.pow(width, 2) * 2));
			Tortoise.turn(90);
			
		}
	}
	
}
