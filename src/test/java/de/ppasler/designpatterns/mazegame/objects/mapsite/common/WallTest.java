package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class WallTest {

	@Test
	public void equals_sameObject() {
		Wall wall = new Wall();
		assertEquals(wall, wall);
	}

	@Test
	public void equals_differentInstances() {
		Wall wall1 = new Wall();
		Wall wall2 = new Wall();
		assertEquals(wall1, wall2);
	}

	@Test
	public void equals_null() {
		Wall wall = new Wall();
		assertNotEquals(wall, null);
	}

	@Test
	public void equals_otherType() {
		Wall wall = new Wall();
		assertNotEquals(wall, "RoomWithABomb");
	}
}