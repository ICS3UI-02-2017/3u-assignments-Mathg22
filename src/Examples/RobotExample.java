/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the robots
 *
 * @author mathg8825
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 2, 3, Direction.EAST);
        new Wall(ovo, 2, 7, Direction.WEST); //insert a wall
        drake.setLabel("OVO"); //label drake OVO
        drake.setColor(Color.red); //make drake red

        drake.move(3);
        drake.turnRight(2);
        new Thing(ovo, 2, 2, Direction.EAST);//create a thing
        int i = 4;
        drake.move(i);

        drake.pickThing();
        drake.turnLeft();
        drake.move();
        drake.turnLeft();
        drake.move(5);
        drake.turnLeft();
        drake.move();
        drake.putThing();
        drake.move();
        drake.turnLeft();
        drake.move(5);
        drake.getSpeed();
        drake.turnLeft();
        drake.move();
        drake.turnLeft();
        new Thing(ovo, 3, 4, Direction.NORTHWEST);
        new Wall(ovo, 2, 4, Direction.NORTH);

    }
}
