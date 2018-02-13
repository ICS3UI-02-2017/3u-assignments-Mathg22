/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City ovo = new City(); //create a city for the robot
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 1, 2, Direction.SOUTH);
        drake.setColor(Color.black); //make drake red 
        new Wall(ovo, 1, 1, Direction.NORTH); //insert a wall
        new Wall(ovo, 1, 2, Direction.NORTH); //insert a wall
        new Wall(ovo, 1, 1, Direction.WEST); //insert a wall
        new Wall(ovo, 2, 1, Direction.WEST); //insert a wall
        new Wall(ovo, 2, 1, Direction.SOUTH); //insert a wall
        new Wall(ovo, 1, 2, Direction.SOUTH); //insert a wall
        new Wall(ovo, 1, 2, Direction.EAST); //insert a wall
  drake.setColor(Color.red); //make drake red
            //Thing ball = 
        new Thing(ovo, 2, 2, Direction.SOUTH); //insert a thing
     //Drake goes outside picks up the thing and goes back to his starting position
        drake.turnRight();
        drake.move(1);
        drake.turnLeft();
        drake.move();
        drake.turnLeft();
        drake.move();
        drake.pickThing();
        drake.turnAround();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.turnRight();   
        
    }
}