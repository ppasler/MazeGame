package de.ppasler.designpatterns.mazegame.creational.prototype;

import de.ppasler.designpatterns.mazegame.creational.abstractfactory.MazeFactory;
import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public class MazePrototypeFacotry implements MazeFactory {

	private Maze prototypeMaze;
	private Wall prototypeWall;
	private Door prototypeDoor;
	private Room prototypeRoom;

	public MazePrototypeFacotry(Maze maze, Wall wall, Door door, Room room) {
		this.prototypeMaze = maze;
		this.prototypeWall = wall;
		this.prototypeDoor = door;
		this.prototypeRoom = room;
	}

	@Override
	public Maze makeMaze() {
		return null;
	}


	@Override
	public Wall makeWall() {
		return null;
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		return null;
	}

	@Override
	public Room makeRoom(int roomNumber) {
		return null;
	}
}
