package com.ankitgupta.designPatterns.builder.robot.main;

import com.ankitgupta.designPatterns.builder.robot.OldRobotBuilder;
import com.ankitgupta.designPatterns.builder.robot.Robot;
import com.ankitgupta.designPatterns.builder.robot.RobotBuilder;

/**
 * This demos the builder which is external to the actual robot class
 * @author ankit gupta
 *
 */
public class RobotBuilderDemo {

	public static void main(String[] args) {
		/**
		 * Note: External builder needs the constructor of the robot to be public,
		 * which means that the robot can be built using even this public constructor and
		 * not only the builder's build() method
		 */
		
		RobotBuilder robotBuilder = new OldRobotBuilder();
		robotBuilder.setHead("old head");
		robotBuilder.setTorso("old torso");
		robotBuilder.setLegs("old legs");
		Robot robot = robotBuilder.build();
		System.out.println(robot);
	}
	
}
