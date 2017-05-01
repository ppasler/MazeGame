package de.ppasler.designpatterns.mazegame.objects.mapsite.bombed;

import org.apache.commons.lang3.builder.EqualsBuilder;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;

public class RoomWithABomb extends Room {

	public RoomWithABomb(int roomNumber) {
		super(roomNumber);
	}

	public void enter() {
		// todo
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof RoomWithABomb) {
			final RoomWithABomb room = (RoomWithABomb)other;
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
}
