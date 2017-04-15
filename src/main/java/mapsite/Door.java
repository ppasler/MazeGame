package mapsite;

public class Door extends AbstractMapSite {

	private final Room room1;
	private final Room room2;
	private boolean isOpen;

	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
		this.isOpen = false;
	}

	public void enter() {
		// todo
	}

	public Room otherSideFrom(Room room) {
		if (room == room1) {
			return room2;
		} else if (room == room2) {
			return room1;
		}
		return null;
	}
}
