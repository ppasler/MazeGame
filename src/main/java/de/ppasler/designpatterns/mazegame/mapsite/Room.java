package de.ppasler.designpatterns.mazegame.mapsite;

import org.apache.commons.lang3.builder.EqualsBuilder;

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

	public int getRoomNumber() {
		return roomNumber;
	}

	public MapSite[] getSides() {
		return sides;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Room) {
			final Room room = (Room)other;
			return new EqualsBuilder()
					.append(sides[0], room.getSides()[0])
					.append(sides[1], room.getSides()[1])
					.append(sides[2], room.getSides()[2])
					.append(sides[3], room.getSides()[3])
					.append(roomNumber, room.getRoomNumber())
					.isEquals();
		}
		return false;
	}
}
