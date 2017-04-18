package de.ppasler.designpatterns.mazegame.creational;

import static org.junit.Assert.assertEquals;

import de.ppasler.designpatterns.mazegame.creational.builder.DefaultMazeBuilder;
import de.ppasler.designpatterns.mazegame.creational.builder.MazeBuilder;
import de.ppasler.designpatterns.mazegame.creational.factory.DefaultMazeFactory;
import de.ppasler.designpatterns.mazegame.creational.factory.MazeFactory;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;
import org.junit.Test;

public class MazeCreationTest {

	@Test
	public void createMaze_factory() {
		Maze maze1 = createMaze_native();

		MazeFactory factory = new DefaultMazeFactory();
		Maze maze2 = factory.makeMaze();

		assertEquals(maze1, maze2);
	}

	@Test
	public void createMaze_builder() {
		Maze maze1 = createMaze_native();

		MazeBuilder builder = new DefaultMazeBuilder();
		Maze maze2 = builder.createMaze().addRoom(1).addRoom(2).addDoor(1, 2).build();

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
