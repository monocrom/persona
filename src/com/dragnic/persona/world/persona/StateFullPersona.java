package com.dragnic.persona.world.persona;

import java.util.HashMap;
import java.util.Map;

import com.dragnic.persona.world.World;
import com.dragnic.persona.world.entity.WorldUpdate;
import com.dragnic.persona.world.persona.action.Action;
import com.dragnic.persona.world.persona.state.State;
import com.dragnic.persona.world.persona.state.States;

public class StateFullPersona implements Persona {
	
	private World memorizedWorld;
	private State innerState;
	private Map<States, State> availableStates;
	
	public StateFullPersona() {
		availableStates = new HashMap<States, State>();
	}
	
	public void updateWorld(WorldUpdate update) {
		memorizedWorld.update(update);
	}
	
	public Action getNextAction() {
		return innerState.getNextAction();
	}
}
