package com.ankitgupta.designPatterns.builder.robot;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder(){
		this.robot = new Robot();
	}
	
	@Override
	public void setHead(String head) {
		robot.setHead(head);
	}

	@Override
	public void setTorso(String torso) {
		robot.setTorso(torso);
	}

	@Override
	public void setLegs(String legs) {
		robot.setLegs(legs);
	}

	@Override
	public Robot build() {
		return this.robot;
	}

}
