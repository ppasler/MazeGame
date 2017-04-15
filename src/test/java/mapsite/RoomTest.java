package mapsite;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {

	Room room;

	@Before
	public void setup(){
		room = new Room(1);
	}

	@Test
	public void addRoom_sunshine() {
		System.out.println(Direction.NORTH.getValue());
	}
}
