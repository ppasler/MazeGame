import mapsite.Direction;
import mapsite.Door;
import mapsite.Room;
import mapsite.Wall;

public class MazeGame {

	public static Maze createMaze() {
		Maze maze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, door);
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, new Wall());

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, door);

		return maze;
	}
}
