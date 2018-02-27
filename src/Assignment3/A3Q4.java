/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author mathg8825
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a city for the robot
        City ovo = new City();
        //put a robot in my city
        RobotSE drake = new RobotSE(ovo, 3, 3, Direction.SOUTH);
        drake.setColor(Color.red); //make drake red
        //top left square
        new Wall(ovo, 1, 1, Direction.NORTH);
        new Wall(ovo, 1, 2, Direction.NORTH);
        new Wall(ovo, 1, 1, Direction.WEST);
        new Wall(ovo, 2, 1, Direction.WEST);
        new Wall(ovo, 1, 2, Direction.EAST);
        new Wall(ovo, 2, 2, Direction.EAST);
        new Wall(ovo, 2, 2, Direction.SOUTH);
        new Wall(ovo, 2, 1, Direction.SOUTH);
        //top right square
        new Wall(ovo, 1, 4, Direction.NORTH);
        new Wall(ovo, 1, 5, Direction.NORTH);
        new Wall(ovo, 1, 4, Direction.WEST);
        new Wall(ovo, 2, 4, Direction.WEST);
        new Wall(ovo, 1, 5, Direction.EAST);
        new Wall(ovo, 2, 5, Direction.EAST);
        new Wall(ovo, 2, 5, Direction.SOUTH);
        new Wall(ovo, 2, 4, Direction.SOUTH);
        //bottom left square
        new Wall(ovo, 4, 1, Direction.NORTH);
        new Wall(ovo, 4, 2, Direction.NORTH);
        new Wall(ovo, 4, 1, Direction.WEST);
        new Wall(ovo, 5, 1, Direction.WEST);
        new Wall(ovo, 4, 2, Direction.EAST);
        new Wall(ovo, 5, 2, Direction.EAST);
        new Wall(ovo, 5, 2, Direction.SOUTH);
        new Wall(ovo, 5, 1, Direction.SOUTH);
//bottom right square
        new Wall(ovo, 4, 4, Direction.NORTH);
        new Wall(ovo, 4, 5, Direction.NORTH);
        new Wall(ovo, 4, 4, Direction.WEST);
        new Wall(ovo, 5, 4, Direction.WEST);
        new Wall(ovo, 4, 5, Direction.EAST);
        new Wall(ovo, 5, 5, Direction.EAST);
        new Wall(ovo, 5, 5, Direction.SOUTH);
        new Wall(ovo, 5, 4, Direction.SOUTH);
/*drake. will move around the first square then continue forward and repeat that 
 4 times to go around all 4 of the squares. 
 
 */
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 3; x++) {
                drake.move(3);
                drake.turnLeft();

            }
            drake.move(3);

        }

    }
}