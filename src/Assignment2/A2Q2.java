/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 3, 1, Direction.EAST);
        drake.setColor(Color.red); //make drake red
        //building race course with hurdles and finish thing
        new Wall(ovo, 3, 1, Direction.SOUTH);
        new Wall(ovo, 3, 2, Direction.SOUTH);
        new Wall(ovo, 3, 3, Direction.SOUTH);
        new Wall(ovo, 3, 4, Direction.SOUTH);
        new Wall(ovo, 3, 5, Direction.SOUTH);
        new Wall(ovo, 3, 6, Direction.SOUTH);
        new Wall(ovo, 3, 7, Direction.SOUTH);
        new Wall(ovo, 3, 8, Direction.SOUTH);
        new Wall(ovo, 3, 9, Direction.SOUTH);
        new Wall(ovo, 3, 10, Direction.SOUTH);
        new Thing(ovo, 3, 10);
        new Wall(ovo, 3, 3, Direction.EAST);
        new Wall(ovo, 3, 6, Direction.EAST);
        new Wall(ovo, 3, 7, Direction.EAST);
        new Wall(ovo, 3, 2, Direction.EAST);
        // while there is nothing to pick up
        while (!drake.canPickThing()) {
            // if the front is clear
            if (drake.frontIsClear()) {
                // move
                drake.move();
            // if there is a hurdle
            }else{
                // jump over it
                drake.turnLeft();
                drake.move();
                drake.turnRight();
                drake.move();
                drake.turnRight();
                drake.move();
                drake.turnLeft();
            }
        }
       
    
        
    }
}
