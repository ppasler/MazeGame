package de.ppasler.designpatterns.mazegame.creational.factorymethods;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.DoorNeedingSpell;
import de.ppasler.designpatterns.mazegame.objects.mapsite.enchanted.EnchantedRoom;

public class EnchantedMazeGame extends DefaultMazeGame {

	public Door makeDoor(Room room1, Room room2) {
		return new DoorNeedingSpell(room1, room2);
	}

	public Room makeRoom(int roomNumber) {
		return new EnchantedRoom(roomNumber, null);
	}
}
