package de.ppasler.designpatterns.mazegame.creational.builder;

import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public class DefaultMazeBuilder implements MazeBuilder {

	private Maze maze = null;

	@Override
	public MazeBuilder createMaze() {
		maze = new Maze();
		return this;
	}

	@Override
	public MazeBuilder addRoom(int roomNumber) {
		Room room = new Room(roomNumber);
		room.setSide(Direction.NORTH, new Wall());
		room.setSide(Direction.SOUTH, new Wall());
		room.setSide(Direction.EAST, new Wall());
		room.setSide(Direction.WEST, new Wall());

		maze.addRoom(room);
		return this;
	}

	@Override
	public MazeBuilder addDoor(int roomNo1, int roomNo2) {
		Room room1 = maze.roomNumber(roomNo1);
		Room room2 = maze.roomNumber(roomNo2);

		Door door = new Door(room1, room2);
		room1.setSide(Direction.EAST, door);
		room2.setSide(Direction.WEST, door);
		return this;
	}

	@Override
	public Maze build() {
		return maze;
	}
}
