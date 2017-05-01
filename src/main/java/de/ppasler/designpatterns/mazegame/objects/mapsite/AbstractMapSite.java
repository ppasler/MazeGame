package de.ppasler.designpatterns.mazegame.objects.mapsite;

import org.apache.commons.lang3.SerializationUtils;

public abstract class AbstractMapSite<T> implements MapSite<T> {

	public abstract void enter();

	public T cloneIt() {
		return (T) SerializationUtils.clone(this);
	}
}
