package de.ppasler.designpatterns.mazegame.creational.abstractfactory;

import de.ppasler.designpatterns.mazegame.objects.Maze;
import org.junit.Test;

public class MazeFactoryTest {
	@Test
	public void makeMaze_default() throws Exception {
		DefaultMazeFactory defaultMazeFactory = new DefaultMazeFactory();
		Maze defaultMaze = defaultMazeFactory.makeMaze();

		BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();
		Maze bombedMaze = bombedMazeFactory.makeMaze();

		EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
		Maze enchantedMaze = enchantedMazeFactory.makeMaze();
		enchantedMaze.roomNumber(1).enter();
	}

	@Test
	public void makeMaze_bombed() throws Exception {
		BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();
		Maze bombedMaze = bombedMazeFactory.makeMaze();
	}

	@Test
	public void makeMaze_enchanted() throws Exception {
		EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
		Maze enchantedMaze = enchantedMazeFactory.makeMaze();
		enchantedMaze.roomNumber(1).enter();
	}

}