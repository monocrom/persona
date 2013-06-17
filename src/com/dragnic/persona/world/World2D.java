package com.dragnic.persona.world;

import java.util.HashMap;
import java.util.Map;

import com.dragnic.persona.world.entity.Coordinate;
import com.dragnic.persona.world.entity.Entity;
import com.dragnic.persona.world.entity.WorldUpdate;

public class World2D implements World {
	private Map<Coordinate, Entity> entites;
	
	public World2D() {
		entites = new HashMap<Coordinate, Entity>();
	}

	public void update(WorldUpdate update) {
	}
}
