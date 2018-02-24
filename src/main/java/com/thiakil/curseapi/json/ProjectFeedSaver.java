package com.thiakil.curseapi.json;

import addons.curse.AddOn;

import java.util.Collection;

/**
 * Created by Thiakil on 24/02/2018.
 */
public interface ProjectFeedSaver {
	void save(long timestampComplete, long timestampHourly, Collection<AddOn> addons);
}
