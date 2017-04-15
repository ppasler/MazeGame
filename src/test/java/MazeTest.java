import org.junit.Before;
import org.junit.Test;

public class MazeTest {

	Maze maze;

	@Before
	public void setup() {
		maze = MazeGame.createMaze();
	}

	@Test
	public void run() {
	System.out.println(maze);
	}
}
