package com.thiakil.curseapi.json;

import addons.curse.AddOn;

import java.util.Collection;

/**
 * Created by Thiakil on 24/02/2018.
 */
public interface ProjectFeedLoader {
	long getTimestampComplete();

	long getTimestampHourly();

	Collection<AddOn> getAddOns();
}
