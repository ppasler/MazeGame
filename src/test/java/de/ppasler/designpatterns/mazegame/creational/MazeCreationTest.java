package de.ppasler.designpatterns.mazegame.creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.ppasler.designpatterns.mazegame.creational.factory.DefaultMazeFactory;
import de.ppasler.designpatterns.mazegame.creational.factory.MazeFactory;
import de.ppasler.designpatterns.mazegame.mapsite.*;

public class MazeCreationTest {

	@Test
	public void createMaze() {
		Maze maze1 = createMaze_native();
		Maze maze2 = createMaze_factory();
		assertEquals(maze1, maze2);
	}

	public Maze createMaze_native() {
		Maze maze = new Maze();
		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Door door = new Door(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, door);
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, new Wall());

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, door);

		return maze;
	}

	public Maze createMaze_factory() {
		MazeFactory factory = new DefaultMazeFactory();

		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door door = factory.makeDoor(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, door);
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, new Wall());

		r1.setSide(Direction.NORTH, new Wall());
		r1.setSide(Direction.SOUTH, new Wall());
		r1.setSide(Direction.EAST, new Wall());
		r1.setSide(Direction.WEST, door);

		return maze;
	}
}
