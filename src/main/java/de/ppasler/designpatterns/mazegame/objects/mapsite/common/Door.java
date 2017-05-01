package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import de.ppasler.designpatterns.mazegame.objects.mapsite.AbstractMapSite;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Door extends AbstractMapSite<Door> {

	protected final Room room1;
	protected final Room room2;
	protected boolean isOpen;

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

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Room1", room1.getRoomNumber())
				.append("Room2", room2.getRoomNumber())
				.append("open", isOpen)
				.toString();
	}
}
