package de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class DoorNeedingSpell extends Door {

	private boolean isOpen;

	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
		this.isOpen = false;
	}

	public void enter() {
		// todo
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof DoorNeedingSpell) {
			DoorNeedingSpell door = (DoorNeedingSpell) other;
			return new EqualsBuilder()
					.append(isOpen, door.isOpen)
					.append(room1.getRoomNumber(), door.room1.getRoomNumber())
					.append(room2.getRoomNumber(), door.room2.getRoomNumber())
					.isEquals();
		}
		return false;
	}
}
