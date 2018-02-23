/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

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
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 4, 0, Direction.EAST);
      //make drake red
        drake.setColor(Color.red); 

        //inserting walls
        new Wall(ovo, 4, 2, Direction.WEST);
        new Wall(ovo, 4, 2, Direction.NORTH);
        new Wall(ovo, 3, 3, Direction.WEST);
        new Wall(ovo, 3, 3, Direction.NORTH);
        new Wall(ovo, 2, 4, Direction.WEST);
        new Wall(ovo, 2, 4, Direction.NORTH);
        new Wall(ovo, 2, 4, Direction.NORTH);
        new Wall(ovo, 2, 5, Direction.NORTH);
        new Wall(ovo, 2, 5, Direction.EAST);
        new Wall(ovo, 3, 6, Direction.NORTH);
        new Wall(ovo, 3, 6, Direction.EAST);
        new Wall(ovo, 4, 7, Direction.NORTH);
        new Wall(ovo, 4, 7, Direction.EAST);

        //inserting new things
        new Thing(ovo, 4, 1);
        new Thing(ovo, 3, 2);
        new Thing(ovo, 2, 3);
        new Thing(ovo, 1, 4);
        
//move up the left side of the staircase while picking up every thing
        drake.move();
        drake.pickThing();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.pickThing();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.pickThing();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.pickThing();
        
        //move down the right side of the staircase while placing all of the things at the steps
        drake.move();
        drake.putThing();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.putThing();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.putThing();
        drake.turnLeft();
        drake.move();
        drake.turnRight();
        drake.move();
        drake.putThing();
        drake.turnLeft();
        
        drake.move();
        
    }
}
