package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoomTest {

	@Test
	public void equals_sameObject() {
		Room room = new Room(1);
		assertEquals(room, room);
	}

	@Test
	public void equals_sameNumbers() {
		Room room1 = new Room(1);
		Room room2 = new Room(1);
		assertEquals(room1, room2);
	}

	@Test
	public void equals_differentNumbers() {
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		assertNotEquals(room1, room2);
	}

	@Test
	public void equals_null() {
		Room room = new Room(1);
		assertNotEquals(room, null);
	}

	@Test
	public void equals_otherType() {
		Room room = new Room(1);
		assertNotEquals(room, "RoomWithABomb");
	}

	@Test
	public void clone_isOtherObject() {
		Room room = new Room(1);
		Room roomClone = room.cloneIt();

		assertThat(room, is(not(sameInstance(roomClone))));
		assertThat(room.getSites(), is(not(sameInstance(roomClone.getSites()))));
	}
}