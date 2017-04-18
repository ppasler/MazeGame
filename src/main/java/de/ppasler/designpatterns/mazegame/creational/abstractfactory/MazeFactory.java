package de.ppasler.designpatterns.mazegame.creational.abstractfactory;

import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public interface MazeFactory {

	Maze makeMaze();

	Wall makeWall();

	Door makeDoor(Room room1, Room room2);

	Room makeRoom(int roomNumber);
}
