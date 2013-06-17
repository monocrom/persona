package com.dragnic.persona.world.entity;

import java.util.HashMap;
import java.util.Map;

public class Coordiante2D implements Coordinate {
	private Float x;
	private Float y;
	
	public Coordiante2D(Float x, Float y) {
		this.x = x;
		this.y = y;
	}
	
	public Map<Axis, Float> get() {
		Map<Axis, Float> coordinates = new HashMap<Axis, Float>();
		
		coordinates.put(Axis.X, x);
		coordinates.put(Axis.Y, y);
		
		return coordinates;
	}
}
