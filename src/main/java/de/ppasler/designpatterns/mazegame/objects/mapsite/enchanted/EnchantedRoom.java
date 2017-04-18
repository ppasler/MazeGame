package de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EnchantedRoom extends Room {

	private Method castSpell;

	public EnchantedRoom(int roomNumber, Method castSpell) {
		super(roomNumber);
		this.castSpell = castSpell;
	}

	public void enter() {
		try {
			castSpell.invoke(null);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof EnchantedRoom) {
			final EnchantedRoom room = (EnchantedRoom)other;
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
