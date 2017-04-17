package de.ppasler.designpatterns.mazegame.mapsite;

public class Wall extends AbstractMapSite {
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
}
