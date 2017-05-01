package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

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

	@Test
	public void clone_otherType() {
		Wall wall = new Wall();
		assertNotEquals(wall, "RoomWithABomb");
	}

	@Test
	public void clone_isOtherObject() {
		Wall wall = new Wall();
		Wall wallClone = wall.cloneIt();

		assertThat(wall, is(not(sameInstance(wallClone))));
	}
}