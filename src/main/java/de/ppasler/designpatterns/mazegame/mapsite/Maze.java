package de.ppasler.designpatterns.mazegame.mapsite;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.HashMap;
import java.util.Map;

public class Maze {

	private Map<Integer, Room> map;

	public Maze() {
		map = new HashMap<>();
	}

	public void addRoom(Room room) {
		map.put(room.getRoomNumber(), room);
	}

	public Room roomNumber(int roomNumber) {
		return map.get(roomNumber);
	}

	public Map<Integer, Room> getMap() {
		return map;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Maze) {
			Maze maze = (Maze) other;

			return new EqualsBuilder()
					.append(map, maze.getMap())
					.isEquals();
		}
		return false;
	}
}
