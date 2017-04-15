import mapsite.Room;

import java.util.HashMap;
import java.util.Map;

public class Maze {

	Map<Integer, Room> map;

	public Maze() {
		map = new HashMap();
	}

	public void addRoom(Room room) {
		map.put(room.getRoomNumber(), room);
	}

	public Room roomNumber(int roomNumber) {
		return map.get(roomNumber);
	}
}
