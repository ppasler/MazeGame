package de.ppasler.designpatterns.mazegame.creational.factorymethods;

import de.ppasler.designpatterns.mazegame.objects.mapsite.bombed.BombedWall;
import de.ppasler.designpatterns.mazegame.objects.mapsite.bombed.RoomWithABomb;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public class BombedMazeGame extends DefaultMazeGame {

	public Wall makeWall() {
		return new BombedWall();
	}

	public Room makeRoom(int roomNumber) {
		return new RoomWithABomb(roomNumber);
	}
}
