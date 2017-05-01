package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoorTest {

	@Test
	public void equals_sameObject() {
		Door door = createDoor();
		assertEquals(door, door);
	}

	@Test
	public void equals_differentInstances() {
		Door door1 = createDoor();
		Door door2 = createDoor();
		assertEquals(door1, door2);
	}

	@Test
	public void equals_null() {
		Door door = createDoor();
		assertNotEquals(door, null);
	}

	@Test
	public void equals_otherType() {
		Door door = createDoor();
		assertNotEquals(door, "RoomWithABomb");
	}

	@Test
	public void clone_isOtherObject() {
		Door door = createDoor();
		Door doorClone = door.cloneIt();

		assertThat(door, is(not(sameInstance(doorClone))));
	}

	private Door createDoor() {
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		return new Door(room1, room2);
	}
}