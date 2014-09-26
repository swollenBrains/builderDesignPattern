package com.ankitgupta.designPatterns.builder.robot;

public interface RobotBuilder {
	
	void setHead(String head);
	
	void setTorso(String torso);
	
	void setLegs(String legs);
	
	Robot build();
	
}
