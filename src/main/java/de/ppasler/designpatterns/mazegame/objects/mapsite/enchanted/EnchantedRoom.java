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
