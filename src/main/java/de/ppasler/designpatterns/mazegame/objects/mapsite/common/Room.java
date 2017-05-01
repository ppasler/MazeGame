package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import de.ppasler.designpatterns.mazegame.objects.mapsite.AbstractMapSite;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.MapSite;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Room extends AbstractMapSite<Room> {

	protected int roomNumber;
	protected MapSite[] sites;

	public Room() {
		sites = new MapSite[4];
	}

	public Room(int roomNumber) {
		this();
		init(roomNumber);
	}

	public Room init(int roomNumber) {
		this.roomNumber = roomNumber;
		return this;
	}

	public void enter() {
		// todo
	}

	public void setSite(Direction direction, MapSite side) {
		sites[direction.getValue()] = side;
	}

	public MapSite getSite(Direction direction) {
		return sites[direction.getValue()];
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public MapSite[] getSites() {
		return sites;
	}

	public void setSites(MapSite[] sites) {
		this.sites = sites;
	}

	public Room cloneIt() {
		Room clone = super.cloneIt();
		clone.setSites(sites.clone());
		return clone;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Room) {
			final Room room = (Room)other;
			return new EqualsBuilder()
					.append(sites[0], room.getSites()[0])
					.append(sites[1], room.getSites()[1])
					.append(sites[2], room.getSites()[2])
					.append(sites[3], room.getSites()[3])
					.append(roomNumber, room.getRoomNumber())
					.isEquals();
		}
		return false;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("#", roomNumber)
				.append(Direction.NORTH.toString(), sites[Direction.NORTH.getValue()])
				.append(Direction.SOUTH.toString(), sites[Direction.SOUTH.getValue()])
				.append(Direction.EAST.toString(), sites[Direction.EAST.getValue()])
				.append(Direction.WEST.toString(), sites[Direction.WEST.getValue()])
				.toString();
	}
}
