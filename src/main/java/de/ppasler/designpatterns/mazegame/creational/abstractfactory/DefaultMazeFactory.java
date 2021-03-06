package de.ppasler.designpatterns.mazegame.creational.abstractfactory;

import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;


public class DefaultMazeFactory implements MazeFactory {

	public Maze makeMaze() {
		Maze maze = new Maze();
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSite(Direction.NORTH, makeWall());
		r1.setSite(Direction.SOUTH, makeWall());
		r1.setSite(Direction.EAST, door);
		r1.setSite(Direction.WEST, makeWall());

		r2.setSite(Direction.NORTH, makeWall());
		r2.setSite(Direction.SOUTH, makeWall());
		r2.setSite(Direction.EAST, makeWall());
		r2.setSite(Direction.WEST, door);

		return maze;
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
