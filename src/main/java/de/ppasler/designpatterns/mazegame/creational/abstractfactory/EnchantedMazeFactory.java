package de.ppasler.designpatterns.mazegame.creational.abstractfactory;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.DoorNeedingSpell;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.EnchantedRoom;

import java.lang.reflect.Method;

public class EnchantedMazeFactory extends DefaultMazeFactory {

	public static class Spell {

		public static void doSpell() {
			System.out.println("Abracadraba");
		}
	}

	public DoorNeedingSpell makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}

	public Room makeRoom(int roomNumber) {

		return new EnchantedRoom(roomNumber, getSpell());
	}

	private Method getSpell() {
		try {
			return EnchantedMazeFactory.Spell.class.getMethod("doSpell");
		} catch (NoSuchMethodException nsme) {
			nsme.printStackTrace();
			return null;
		}

	}
}
