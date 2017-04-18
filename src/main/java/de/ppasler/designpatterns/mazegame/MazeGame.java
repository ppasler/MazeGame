package de.ppasler.designpatterns.mazegame;

import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public class MazeGame {

	public Maze createMaze() {
		Maze maze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.EAST, door);
		r1.setSide(Direction.WEST, new Wall());

		r2.setSide(Direction.NORTH, new Wall());
		r2.setSide(Direction.SOUTH, new Wall());
		r2.setSide(Direction.EAST, new Wall());
		r2.setSide(Direction.WEST, door);

		return maze;
	}
}
