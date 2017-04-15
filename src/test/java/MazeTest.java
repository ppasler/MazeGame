import org.junit.Before;
import org.junit.Test;

public class MazeTest {

	Maze maze;

	@Before
	public void setup(){
		maze = new Maze();
	}

	@Test
	public void addRoom_sunshine() {
		maze.addRoom();
	}

	@Test
	public void roomNo_sunshine() {
		maze.roomNo();
	}
}
