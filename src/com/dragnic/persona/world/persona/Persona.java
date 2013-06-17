package com.dragnic.persona.world.persona;

import com.dragnic.persona.world.entity.WorldUpdate;
import com.dragnic.persona.world.persona.action.Action;

public interface Persona {
	public void updateWorld(WorldUpdate update);
	public Action getNextAction();
}
