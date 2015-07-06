package com.example.practice.base;

public class ObjectsFirstNonNull {
	private static final String UNKNOWN_COORDINATES = "Unknown coordinates";
	
	public String getCoordinatesAsText() {
		//return getGpsCoordinates() != null ? getGpsCoordinates() : UNKNOWN_COORDINATES;
		String gpsCoordinates = getGpsCoordinates();
		return gpsCoordinates != null ? gpsCoordinates : UNKNOWN_COORDINATES;
	}
	
	public String getGpsCoordinates() {
		// retrieve GPS coordinates from satellite
		return "";
	}
}
