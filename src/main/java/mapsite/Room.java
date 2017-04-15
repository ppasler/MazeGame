package mapsite;

public class Room extends AbstractMapSite {

	private final int roomNumber;
	private MapSite[] sides;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		sides = new MapSite[4];
	}

	public void enter() {
		// todo
	}

	public void setSide(Direction direction, MapSite side) {
		sides[direction.getValue()] = side;
	}

	public MapSite getSide(Direction direction) {
		return null;
	}
}
