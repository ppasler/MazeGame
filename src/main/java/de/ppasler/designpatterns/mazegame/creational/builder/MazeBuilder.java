package de.ppasler.designpatterns.mazegame.creational.builder;

import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;

public interface MazeBuilder {

	MazeBuilder createMaze();

	MazeBuilder addRoom(int roomNumber);

	MazeBuilder addDoor(int roomNo1, int roomNo2);

	Maze build();
}