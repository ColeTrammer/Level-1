import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class BugsX {
		
	public static void main(String[] args) {
		World world = new World();
		world.show();
		int rows = world.getGrid().getNumRows();
		int cols = world.getGrid().getNumCols();
		for (int i = 0; i < cols; i++) {
			world.add(new Location(i, i), new Bug());
			world.add(new Location(rows - 1 - i, i), new Bug());
		}
	}
	
}
