package de.ppasler.designpatterns.mazegame.objects.mapsite;

import java.io.Serializable;

public interface MapSite<T> extends Serializable {
	void enter();

	T cloneIt();
}
