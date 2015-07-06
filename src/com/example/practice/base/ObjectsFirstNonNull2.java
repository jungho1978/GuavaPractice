package com.example.practice.base;

import com.google.common.base.Objects;

public class ObjectsFirstNonNull2 {
	private static final String UNKNOWN_COORDINATES = "Unknown coordinates";
	
	public String getCoordinatesAsText() {
		/*
		String gpsCoordinates = getGpsCoordinates();
		return gpsCoordinates != null ? gpsCoordinates : UNKNOWN_COORDINATES;
		*/
		return Objects.firstNonNull(getGpsCoordinates(), UNKNOWN_COORDINATES);
	}
	
	public String getGpsCoordinates() {
		// retrieve GPS coordinates from satellite
		return "";
	}
}
