package de.ppasler.designpatterns.mazegame.mapsite;

import org.apache.commons.lang3.builder.EqualsBuilder;

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

	@Override
	public boolean equals(Object other) {
		if (other instanceof Door) {
			Door door = (Door) other;
			return new EqualsBuilder()
					.append(isOpen, door.isOpen)
					.append(room1.getRoomNumber(), door.room1.getRoomNumber())
					.append(room2.getRoomNumber(), door.room2.getRoomNumber())
					.isEquals();
		}
		return false;
	}
}
