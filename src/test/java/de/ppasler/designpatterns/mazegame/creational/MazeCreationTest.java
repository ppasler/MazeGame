package de.ppasler.designpatterns.mazegame.creational;

import static org.junit.Assert.assertEquals;

import de.ppasler.designpatterns.mazegame.MazeGame;
import de.ppasler.designpatterns.mazegame.creational.builder.DefaultMazeBuilder;
import de.ppasler.designpatterns.mazegame.creational.builder.MazeBuilder;
import de.ppasler.designpatterns.mazegame.creational.abstractfactory.DefaultMazeFactory;
import de.ppasler.designpatterns.mazegame.creational.abstractfactory.MazeFactory;
import de.ppasler.designpatterns.mazegame.creational.factorymethods.DefaultMazeGame;
import de.ppasler.designpatterns.mazegame.objects.Maze;

import org.junit.Before;
import org.junit.Test;

public class MazeCreationTest {

	private MazeGame mazeGame;

	@Before
	public void setup() {
		mazeGame = new MazeGame();
	}

	@Test
	public void createMaze_abstractfactory() {
		Maze maze1 = mazeGame.createMaze();

		MazeFactory factory = new DefaultMazeFactory();
		Maze maze2 = factory.makeMaze();

		assertEquals(maze1, maze2);
	}

	@Test
	public void createMaze_factorymethods() {
		Maze maze1 = mazeGame.createMaze();

		MazeGame defaultMazeGame = new DefaultMazeGame();
		Maze maze2 = defaultMazeGame.createMaze();

		assertEquals(maze1, maze2);
	}

	@Test
	public void createMaze_builder() {
		Maze maze1 = mazeGame.createMaze();

		MazeBuilder builder = new DefaultMazeBuilder();
		Maze maze2 = builder.createMaze().addRoom(1).addRoom(2).addDoor(1, 2).build();

		assertEquals(maze1, maze2);
	}
}
