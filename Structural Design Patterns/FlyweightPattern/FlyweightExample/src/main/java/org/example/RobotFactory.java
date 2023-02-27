package org.example;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated(){
        return shapes.size();
    }

    public RobotInterface getRobotFRomFactory(String robotCategory) throws Exception{
        RobotInterface myRobot = null;

        if(shapes.containsKey(robotCategory)){
            myRobot = shapes.get(robotCategory);
        } else {
            switch (robotCategory){
                case "small":
                    System.out.println("Do not have, so we are creating");
                    myRobot = new SmallRobot();
                    shapes.put("small", myRobot);
                    break;
                case "large":
                    System.out.println("Do not have, so we are creating");
                    myRobot = new LargeRobot();
                    shapes.put("large", myRobot);
                    break;
                default:
                    throw new Exception("Robot Factory can create only small and large shapes");
            }
        }

        return myRobot;
    }
}
