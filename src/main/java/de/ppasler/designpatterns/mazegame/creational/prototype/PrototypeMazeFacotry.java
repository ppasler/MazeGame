package de.ppasler.designpatterns.mazegame.creational.prototype;

import de.ppasler.designpatterns.mazegame.creational.abstractfactory.MazeFactory;
import de.ppasler.designpatterns.mazegame.objects.Maze;
import de.ppasler.designpatterns.mazegame.objects.mapsite.Direction;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Door;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Room;
import de.ppasler.designpatterns.mazegame.objects.mapsite.common.Wall;

public class PrototypeMazeFacotry implements MazeFactory {

	private Maze prototypeMaze;
	private Wall prototypeWall;
	private Door prototypeDoor;
	private Room prototypeRoom;

	public PrototypeMazeFacotry(Maze maze, Wall wall, Door door, Room room) {
		this.prototypeMaze = maze;
		this.prototypeWall = wall;
		this.prototypeDoor = door;
		this.prototypeRoom = room;
	}

	@Override
	public Maze makeMaze() {
		Maze maze = prototypeMaze.cloneIt();
		Room r1 = makeRoom(1);
		Room r2 = makeRoom(2);
		Door door = makeDoor(r1, r2);

		maze.addRoom(r1);
		maze.addRoom(r2);

		r1.setSite(Direction.NORTH, makeWall());
		r1.setSite(Direction.SOUTH, makeWall());
		r1.setSite(Direction.EAST, door);
		r1.setSite(Direction.WEST, makeWall());

		r2.setSite(Direction.NORTH, makeWall());
		r2.setSite(Direction.SOUTH, makeWall());
		r2.setSite(Direction.EAST, makeWall());
		r2.setSite(Direction.WEST, door);

		return maze;
	}


	@Override
	public Wall makeWall() {
		return prototypeWall.cloneIt();
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		return prototypeDoor.cloneIt().init(room1, room2);
	}

	@Override
	public Room makeRoom(int roomNumber) {
		return prototypeRoom.cloneIt().init(roomNumber);
	}
}
