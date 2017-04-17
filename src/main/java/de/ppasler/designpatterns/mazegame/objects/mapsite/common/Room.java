package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import de.ppasler.designpatterns.mazegame.objects.mapsite.AbstractMapSite;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.MapSite;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Room extends AbstractMapSite {

	protected final int roomNumber;
	protected MapSite[] sides;

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

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("#", roomNumber)
				.append(Direction.NORTH.toString(), sides[Direction.NORTH.getValue()])
				.append(Direction.SOUTH.toString(), sides[Direction.SOUTH.getValue()])
				.append(Direction.EAST.toString(), sides[Direction.EAST.getValue()])
				.append(Direction.WEST.toString(), sides[Direction.WEST.getValue()])
				.toString();
	}
}
