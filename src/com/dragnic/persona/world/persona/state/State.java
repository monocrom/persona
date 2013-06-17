package com.dragnic.persona.world.persona.state;

import com.dragnic.persona.world.persona.action.Action;

public interface State {
	
	public Action getNextAction();

}
