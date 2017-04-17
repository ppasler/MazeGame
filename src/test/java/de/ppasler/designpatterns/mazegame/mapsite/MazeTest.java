package de.ppasler.designpatterns.mazegame.mapsite;

import org.junit.Test;

import static org.junit.Assert.*;

public class MazeTest {

	@Test
	public void equals_sameObject() {
		Maze maze = new Maze();
		assertEquals(maze, maze);
	}

	@Test
	public void equals_sameNumbers() {
		Maze maze1 = new Maze();
		Maze maze2 = new Maze();
		assertEquals(maze1, maze2);
	}

	@Test
	public void equals_null() {
		Maze maze = new Maze();
		assertNotEquals(maze, null);
	}

	@Test
	public void equals_otherType() {
		Maze maze = new Maze();
		assertNotEquals(maze, "Room");
	}
}