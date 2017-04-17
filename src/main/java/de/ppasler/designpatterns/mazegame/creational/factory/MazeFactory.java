package de.ppasler.designpatterns.mazegame.creational.factory;

import de.ppasler.designpatterns.mazegame.mapsite.*;

public interface MazeFactory {

	Maze makeMaze();

	Wall makeWall();

	Door makeDoor(Room room1, Room room2);

	Room makeRoom(int roomNumber);
}
