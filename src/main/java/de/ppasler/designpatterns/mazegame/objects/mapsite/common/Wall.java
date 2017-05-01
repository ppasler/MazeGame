package de.ppasler.designpatterns.mazegame.objects.mapsite.common;

import de.ppasler.designpatterns.mazegame.objects.mapsite.AbstractMapSite;

public class Wall extends AbstractMapSite<Wall> {
	public void enter() {
		// todo
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		return other.getClass().equals(this.getClass());
	}

	@Override
	public String toString() {
		return "Wall";
	}
}