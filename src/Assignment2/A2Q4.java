/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 0, 0, Direction.EAST);
        drake.setColor(Color.red); //make drake red
        //top left pillar
        new Wall(ovo, 1, 1, Direction.NORTH);
        new Wall(ovo, 1, 1, Direction.EAST);
        new Wall(ovo, 1, 1, Direction.SOUTH);
        new Wall(ovo, 1, 1, Direction.WEST);
        //middle square
        new Wall(ovo, 2, 2, Direction.NORTH);
        new Wall(ovo, 2, 3, Direction.NORTH);
        new Wall(ovo, 2, 2, Direction.WEST);
        new Wall(ovo, 3, 2, Direction.WEST);
        new Wall(ovo, 3, 2, Direction.SOUTH);
        new Wall(ovo, 3, 3, Direction.SOUTH);
        new Wall(ovo, 3, 3, Direction.EAST);
        new Wall(ovo, 2, 3, Direction.EAST);
        //top right pillar
        new Wall(ovo, 1, 4, Direction.NORTH);
        new Wall(ovo, 1, 4, Direction.EAST);
        new Wall(ovo, 1, 4, Direction.SOUTH);
        new Wall(ovo, 1, 4, Direction.WEST);
        //bottom left pillar
        new Wall(ovo, 4, 1, Direction.NORTH);
        new Wall(ovo, 4, 1, Direction.EAST);
        new Wall(ovo, 4, 1, Direction.SOUTH);
        new Wall(ovo, 4, 1, Direction.WEST);
        //bottom right pillar
        new Wall(ovo, 4, 4, Direction.NORTH);
        new Wall(ovo, 4, 4, Direction.EAST);
        new Wall(ovo, 4, 4, Direction.SOUTH);
        new Wall(ovo, 4, 4, Direction.WEST);


        /*I created a loop of the same command because every side of the castle is the
         same shape requiring the same command. I created a loop by using 
         * a statement that in this case will always be true
         */
        while (drake.countThingsInBackpack() == 0) {

            drake.move();
            drake.move();
            drake.turnRight();
            drake.move();
            drake.turnLeft();
            drake.move();
            drake.turnLeft();
            drake.move();
            drake.turnRight();
            drake.move(2);
            drake.turnRight();
        }

    }
}
