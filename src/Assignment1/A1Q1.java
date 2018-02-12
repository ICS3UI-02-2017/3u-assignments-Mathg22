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
 *Move the bot counter clockwise around a box until it reaches it's starting position.
 * @author mathg8825
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here             
        City ovo = new City(); //create a city for the robot
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 0, 2, Direction.WEST);
        new Wall(ovo, 1, 1, Direction.NORTH); //insert a wall
        new Wall(ovo, 1, 2, Direction.NORTH); //insert a wall
        new Wall(ovo, 1, 1, Direction.WEST); //insert a wall
        new Wall(ovo, 2, 1, Direction.WEST); //insert a wall
        new Wall(ovo, 2, 1, Direction.SOUTH); //insert a wall
        new Wall(ovo, 2, 2, Direction.SOUTH); //insert a wall
        new Wall(ovo, 2, 2, Direction.EAST); //insert a wall
        new Wall(ovo, 1, 2, Direction.EAST); //insert a wall
        //drake.setLabel("OVO"); //label drake OVO
        drake.setColor(Color.black); //make drake red
  //move the bot counterclockwise around the box and return to starting position.
  drake.move(2);
  drake.turnLeft();
  drake.move(3);
  drake.turnLeft();
  drake.move(3);
  drake.turnLeft(); 
  drake.move(3);
  drake.turnLeft();
  drake.move(1);
    }
}
