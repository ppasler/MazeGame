package de.ppasler.designpatterns.mazegame.creational.factory;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.DoorNeedingSpell;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.EnchantedRoom;

public class EnchantedMazeFactory extends DefaultMazeFactory {

	public DoorNeedingSpell makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}

	public Room makeRoom(int roomNumber) {
		return new EnchantedRoom(roomNumber);
	}
}
