import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		Random r = new Random();
		world.show();
		Bug bug = new Bug();
		Bug rBug = new Bug();
		world.add(new Location(2, 2), bug);
		int cols = world.getGrid().getNumCols();
		int rows = world.getGrid().getNumRows();
		Location rBugLocation = new Location(r.nextInt(rows), r.nextInt(cols));
		world.add(rBugLocation, rBug);
		rBug.setColor(Color.blue);
		rBug.setDirection(90);
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		world.add(rBugLocation.getAdjacentLocation(90), f1);
		world.add(rBugLocation.getAdjacentLocation(270), f2);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				world.add(new Location(i, j), new Flower(i % 2 == 0 ? Color.red : Color.blue));
			}
		}
	}
}
