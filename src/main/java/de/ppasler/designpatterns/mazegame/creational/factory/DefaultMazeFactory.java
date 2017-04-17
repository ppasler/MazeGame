package de.ppasler.designpatterns.mazegame.creational.factory;

import de.ppasler.designpatterns.mazegame.mapsite.*;


public class DefaultMazeFactory implements MazeFactory {

	public Maze makeMaze() {
		return new Maze();
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}

	public Room makeRoom(int roomNumber) {
		return new Room(roomNumber);
	}
}
